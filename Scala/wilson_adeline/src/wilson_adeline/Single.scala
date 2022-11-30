package wilson_adeline

import scala.collection.mutable
import scala.xml.{Elem, Node, Text}
import scala.io.StdIn
import scala.collection.mutable.ArrayBuffer

class Single {

  def inputSingle(): Unit = {
    val ingredientList = new ArrayBuffer[String]()

    printf("Name:> ")
    val singleName = io.StdIn.readLine()

    println("Calories:> " )
    val calories = io.StdIn.readLine()

    println("Cups:> " )
    val cups = io.StdIn.readLine()
    ingredientList.append(singleName, calories, cups)

    println("Added single")

  }
}
