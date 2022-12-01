package wilson_adeline

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.xml.{Elem, Node, Text}
import scala.io.StdIn

class Baked() extends Ingredient() {

  var ingredient = new Single()
  var expansionFactor : Double = 1.0

  var bakedName : String = ""

  def addData(ingredients: ArrayBuffer[Ingredient]) = {
    var bakedName = ""
    println("Name:> ")
    bakedName = io.StdIn.readLine()

    println("Expansion Factor:> ")
    expansionFactor = io.StdIn.readDouble()
  }

  def displayData(offset : String) : String = {

    var stringStuff : String = ""
    stringStuff = offset
    stringStuff += "("
    stringStuff += expansionFactor
    stringStuff += ")"
    stringStuff += "\n"
    stringStuff += ingredient.displayData(offset + "  ")
    stringStuff
  }

}
