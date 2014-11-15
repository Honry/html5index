package org.html5index.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;

public class Operation extends Member {
  private ArrayList<Parameter> parameters = new ArrayList<Parameter>();
  private String body;
  private Special special;
  private TreeMap<String, Operation> overloads = new TreeMap<>();

  public Operation(int modifiers, Type type, String name) {
    super(modifiers, type, name);
    special = Special.NONE;
  }

  public void addParameter(Parameter param) {
    parameters.add(param);
    param.owner = this;
    param.getType().addReference(this);
  }

  public void setBody(String body) {
    this.body = body;
  }

  public String getBody() {
    return body;
  }
  
  public String toString() {
    if (name.equals("(main)")) {
      return "(main)";
    }
    StringBuilder sb = new StringBuilder(name);
    sb.append('(');
    if (parameters.size() == 1) {
      Type t = parameters.get(0).getType();
      if (t != null) {
        sb.append(parameters.get(0).getType().getName());
      } else {
        sb.append("?");
        
      }
    } else if (parameters.size() > 1) {
      sb.append("\u2026");
    }
    sb.append(')');
    return sb.toString();
  }


  public String signature () {
    if (name.equals("(main)")) {
      return "(main)";
    }
    StringBuilder sb = new StringBuilder(name);
    sb.append('(');
    boolean first = true;
    for (Parameter p : parameters) {
      if (!first) {
        sb.append(",");
      } else {
        first = false;
      }
      sb.append(p.getType() != null ? p.getType().getName() : "void");
    }
    sb.append(')');
    return sb.toString();
  }

  public List<Parameter> getParameters() {
    return parameters;
  }


  private Parameter getParameterOrNull(int index) {
    return index < parameters.size() ? parameters.get(index) : null;
  }    
  
  private static Parameter mergeParameter(Model model, Parameter p1, Parameter p2) {
    if (p1 == null || p2 == null) {
      if (p1 == null) {
        p1 = p2;
      }
      Parameter np = new Parameter(p1.getModifiers() | Parameter.OPTIONAL, p1.getType(), p1.getName());
      return np;
    }

    String name = p1.name;
    if (name.indexOf(p2.name) == -1 && p2.name.indexOf(name) == -1) {
      name += "_" + p2.name;
    }
    Type t = p1.getType();
    if (t != p2.getType()) {
      t = model.getType("any");
    }
    return new Parameter(p1.modifiers | p2.modifiers, t, name);
  }
    
  public void merge(Model model, Operation merge) {
    mergeOverloads(model, merge);
    // dont merge getters with anything
    if (getSpecial() == Special.NONE) {
      ArrayList<Parameter> merged = new ArrayList<Parameter>();
      int len = Math.max(parameters.size(), merge.parameters.size());
      for (int i = 0; i < len; i++) {
        merged.add(mergeParameter(model, getParameterOrNull(i), merge.getParameterOrNull(i)));
      }
      parameters.clear();
      // Make sure owner is set correctly...
      for (Parameter p : merged) {
        addParameter(p);
      }
    }
  }

  private void mergeOverloads(Model model, Operation merge) {
    Operation overload = overloads.get(merge.signature());
    if (overload == null) {
      overloads.put(merge.signature(), merge);
      return;
    }
    ArrayList<Parameter> merged = new ArrayList<Parameter>();
    int len = Math.max(merge.parameters.size(), overload.parameters.size());
    for (int i = 0; i < len; i++) {
      merged.add(mergeParameter(model, overload.getParameterOrNull(i), merge.getParameterOrNull(i)));
    }
    overload.parameters.clear();
    // Make sure owner is set correctly...
    for(Parameter p: merged) {
      overload.addParameter(p);
    }
  }

  public void clearParmeters() {
    parameters.clear();
  }


  public void setType(Type type) {
    this.type = type;
    
  }

  public void setSpecial(Special special) {
    this.special = special;
  }

  public Special getSpecial() {
    return special;
  }

  public Collection<Operation> getOverloads() {
    return overloads.values();
  }

  public enum Special {GETTER, SETTER, NONE}
}
