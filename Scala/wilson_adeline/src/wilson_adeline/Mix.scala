package wilson_adeline

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.xml.{Elem, Node, Text}
import scala.io.StdIn

class Mix() extends Ingredient() {

  var mixName : String = ""
  def addData(ingredients: ArrayBuffer[Ingredient]) = {
    val recipe = new Recipe("")
    return Mix()
  }

  def displayData(offset : String) : String = {
    var stringStuff : String = ""

    stringStuff += offset
    stringStuff += "("
    stringStuff += mixName
    stringStuff += ")"
    stringStuff += "\n"
    stringStuff
  }

}
