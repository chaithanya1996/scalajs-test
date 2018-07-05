package tutorial.webapp

import org.scalajs.dom
import dom.document
import scala.scalajs.js.annotation.JSExportTopLevel
import org.querki.jquery._


object TutorialApp {

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }
  def addClickedMessage(): Unit = {
    appendPar(document.body, "You clicked the button!")
  }
  def main(args: Array[String]): Unit = {
    $("body").append("<p>Adapa Is king</p>")
    $("#click-me-button").click(() => addClickedMessage())

  }
}