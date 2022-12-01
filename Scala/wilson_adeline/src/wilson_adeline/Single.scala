package wilson_adeline

import java.text.DecimalFormat
import scala.collection.mutable
import scala.xml.{Elem, Node, Text}
import scala.io.StdIn
import scala.collection.mutable.ArrayBuffer

class Single() extends Ingredient() {
 var cups: Double = 1
 var calories: Double = 100
 var singleName: String = ""
 val format = new DecimalFormat("0.##")

  def addData(ingredients: ArrayBuffer[Ingredient]) = {
    printf("Name:> ")
    singleName  = io.StdIn.readLine()

    println("Calories:> " )
    calories = io.StdIn.readLine().toDouble

    println("Cups:> " )
    cups = io.StdIn.readLine().toDouble

    println("Added single")
    ingredients.append(this)
  }


  def displayData(offset : String) : String = {
    var stringStuff : String = ""

    stringStuff += offset
    stringStuff += "______"
    stringStuff += singleName
    stringStuff += "______\n"

    stringStuff += offset
    stringStuff += "cups: "

    stringStuff += format.format(cups)
    stringStuff += "\n"

    stringStuff += offset
    stringStuff += "calories: "
    stringStuff += format.format(calories)
    stringStuff += "\n"
    stringStuff
  }


}
