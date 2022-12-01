package wilson_adeline

import java.io.FileWriter
import scala.xml.XML
import scala.collection.mutable.ArrayBuffer

class Recipe(name : String) {

  val ingredients = new ArrayBuffer[Ingredient]()
  var Name = name

  def inputtingData(): Unit = {
    val baked = new Baked()
    val mixed = new Mix()
    val single = new Single()
    var remeasure = new Remeasure()

    println("What ingredient (mix, baked, remeasure, single):> ")
    val input = io.StdIn.readLine().toLowerCase()
    var inputchoice : Int = 0

      if (input == "baked")
        var bakedName = ""
        println("Name:> ")
        bakedName = io.StdIn.readLine()

        println("Expansion Factor:> ")
        baked.expansionFactor = io.StdIn.readDouble()
        baked.bakedName = bakedName
        ingredients.append(baked)
        println("Added baked")
        baked.expansionFactor
        // TODO baked.ingredient = inputtingData()
        inputchoice = 1


      else if (input == "mix")
        var mixedName = ""
        println("Name:> " )
        mixedName = io.StdIn.readLine()
        mixed.mixName = mixedName
        ingredients.append(mixed)
        println("Added mix")
        mixed.mixName
        inputtingData()
        inputchoice = 2

      else if ((input == "single") || (input == "s"))
        single.addData(ingredients)
        inputchoice = 3

      else if (input == "remeasure" )
        remeasure.addData(ingredients)

        remeasure.quantity
        inputtingData()

        println("Added remeasure")
        inputchoice = 4

    inputchoice match {
      case 1 => baked
      case 2 => mixed
      case 3 => single
      case 4 => remeasure
    }
  }

  def displayData(offset : String) : String = {
    var k : String = ""
    for (i <- ingredients) {
      k += i.displayData("  ")
    }
    k
  }

}
