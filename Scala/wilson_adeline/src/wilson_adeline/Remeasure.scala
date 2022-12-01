package wilson_adeline

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.xml.{Elem, Node, Text}
import scala.io.StdIn

class Remeasure() extends Ingredient() {

  var quantity : Double = 1.0

  def addData(ingredients: ArrayBuffer[Ingredient]) = {
    println("New Quantity:> ")
    quantity = io.StdIn.readDouble()

    ingredients.append(this)
  }

  def displayData(offset : String) : String = {

    var stringStuff : String = ""
    stringStuff += offset
    stringStuff += "remeasure to "
    stringStuff += quantity
    stringStuff += " cups"
    stringStuff += "\n"
    stringStuff += offset
    //stringStuff += ingredient.displayData(offset + "  ")
    stringStuff
  }


}
