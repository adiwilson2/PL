package wilson_adeline

import java.io.FileWriter
import scala.xml.XML
import scala.collection.mutable.ArrayBuffer
class Recipe() {

  val ingredients = new ArrayBuffer[String]()

  def addData(): Unit = {
    val baked = new Baked()
    val mixed = new Mix()
    val single = new Single()
    val remeasure = new Remeasure()
    val ingredient = new Ingredient()


    println("What ingredient (mix, baked, remeasure, single):> ")
    val input = io.StdIn.readLine()

    if(input == "baked")
      baked.inputBaked()

    else if(input == "mix")
      mixed.inputMix()

    else if(input == "single")
      single.inputSingle()

    else if(input == "remeasure")
      remeasure.inputRemeasure()

  }






}
