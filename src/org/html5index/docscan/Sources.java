package org.html5index.docscan;

import org.html5index.model.DocumentationProvider;

public class Sources {
  public static final DocumentationProvider[] SOURCES = {
    new ExplicitIdlSpecScan("ECMAScript", 
        "http://www.ecma-international.org/ecma-262/5.1/", "/idl/ecmascript.idl"),
    new Html5SpecScan("DOM", "http://dom.spec.whatwg.org/",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/dom.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/elements.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/semantics.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/sections.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/grouping-content.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/text-level-semantics.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/edits.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/embedded-content-1.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/the-iframe-element.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/the-map-element.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/links.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/tabular-data.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/scripting-1.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/forms.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/the-input-element.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/the-button-element.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/association-of-controls-and-forms.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/interactive-elements.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/commands.html")
      .addTutorial("A dive into plain Javascript", "http://blog.adtile.me/2014/01/16/a-dive-into-plain-javascript/"),
    new Html5SpecScan("Browser",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/browsers.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/history.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/webappapis.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/timers.html")
      .addTutorial("Treehouse: Getting started with the History API", "http://blog.teamtreehouse.com/getting-started-with-the-history-api")
      .addTutorial("Dive into HTML5: Manipulating history for fun &amp; profit", "http://diveintohtml5.info/history.html"),
    new Html5SpecScan("Drag and Drop",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/dnd.html")
      .addTutorial("MDN Drag and Drop Tutorial", "https://developer.mozilla.org/en-US/docs/DragDrop/Drag_and_Drop")
      .addTutorial("HTML 5 Rocks Drag and Drop Tutorial", "http://www.html5rocks.com/en/tutorials/dnd/basics/"),
    new Html5SpecScan("Web Sockets and Messaging",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/comms.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/network.html",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/web-messaging.html")
      .addTutorial("Treehouse Websocket Introduction", "http://blog.teamtreehouse.com/an-introduction-to-websockets")
      .addTutorial("HTML 5 Rocks Websocket Tutorial", "http://www.html5rocks.com/en/tutorials/websockets/basics/"),
    new Html5SpecScan("Media", 
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/the-video-element.html")
      .addTutorial("HTML 5 Rocks Video Tutorial", "http://www.html5rocks.com/en/tutorials/video/basics/")
      .addTutorial("MDN: Using HTML5 Video and Audio", "https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/Using_HTML5_audio_and_video"),
    new Html5SpecScan("Offline", 
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/offline.html")
      .addTutorial("HTML 5 Rocks: A Beginner's Guide to Using the Application Cache", "http://www.html5rocks.com/en/tutorials/appcache/beginner/"),
    new Html5SpecScan("Canvas", 
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/the-canvas-element.html")
      .addTutorial("MDN Canvas Tutorial", "https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/Canvas_tutorial"),
    new Html5SpecScan("Web Workers", 
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/workers.html")
      .addTutorial("MDN Web Worker Tutorial", "https://developer.mozilla.org/en-US/docs/Web/Guide/Performance/Using_web_workers")
      .addTutorial("HTML 5 Rocks Web Worker Tutorial", "http://www.html5rocks.com/en/tutorials/workers/basics/"),
    new Html5SpecScan("Web Storage",
        "http://www.whatwg.org/specs/web-apps/current-work/multipage/webstorage.html"),
    new Html5SpecScan("File API", "http://www.w3.org/TR/FileAPI/",
        "http://www.w3.org/TR/file-writer-api/")
      .addTutorial("HTML 5 Rocks: File Tutorial", "http://www.html5rocks.com/en/tutorials/file/dndfiles/")
      .addTutorial("Treehouse: FileReader Tutorial", "http://blog.teamtreehouse.com/reading-files-using-the-html5-filereader-api"),
    new Html5SpecScan("File System API", "http://www.w3.org/TR/file-system-api/")
      .addTutorial("HTML 5 Rocks: Exploring the FileSystem APIs", "http://www.html5rocks.com/en/tutorials/file/filesystem/"),
    new Html5SpecScan("Fullscreen", "http://www.w3.org/TR/fullscreen/")
      .addTutorial("MDN: Fullscreen Tutorial", "https://developer.mozilla.org/en-US/docs/Web/Guide/API/DOM/Using_full_screen_mode")
      .addTutorial("David Walsch's Fullscreen Tutorial", "http://davidwalsh.name/fullscreen"),
    new Html5SpecScan("Selectors", "http://www.w3.org/TR/selectors-api/")
      .addTutorial("MDN: Locating DOM elements using selectors", "https://developer.mozilla.org/en-US/docs/Web/Guide/API/DOM/Locating_DOM_elements_using_selectors"),
    new Html5SpecScan("Shadow DOM", "http://www.w3.org/TR/shadow-dom/")
      .addTutorial("HTML 5 Rocks: Shadow DOM 101", "http://www.html5rocks.com/en/tutorials/webcomponents/shadowdom/"),
    new Html5SpecScan("CSS Object Model", "http://www.w3.org/TR/cssom/")
      .addTutorial("Divya Manian: CSS Object Model", "http://nimbupani.com/css-object-model.html"),
    new ExplicitIdlSpecScan("Typed Arrays", 
        "http://www.khronos.org/registry/typedarray/specs/latest/", 
        "https://www.khronos.org/registry/typedarray/specs/latest/typedarray.idl")
    .addTutorial("MDN Typed Arrays Tutorial", "https://developer.mozilla.org/en-US/docs/Web/JavaScript/Typed_arrays")
    .addTutorial("HTML 5 Rocks: Binary Data in the Browser", "http://www.html5rocks.com/en/tutorials/webgl/typed_arrays/"),
   new ExplicitIdlSpecScan("WebGL", 
       "http://www.khronos.org/registry/webgl/specs/latest/1.0/", 
       "https://www.khronos.org/registry/webgl/specs/latest/1.0/webgl.idl")
    .addTutorial("HTML 5 Rocks: WebGL Fundamentals", "http://www.html5rocks.com/en/tutorials/webgl/webgl_fundamentals/")
    .addTutorial("MDN: Getting Started with WebGL", "https://developer.mozilla.org/en-US/docs/Web/WebGL/Getting_started_with_WebGL")
    .addTutorial("Learning WebGL: The Lessons", "http://learningwebgl.com/blog/?page_id=1217"),
  };
}
