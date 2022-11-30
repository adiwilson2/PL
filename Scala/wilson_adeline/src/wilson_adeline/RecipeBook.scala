package wilson_adeline

import scala.collection.mutable
import scala.xml.{Elem, Text}
import scala.collection.mutable.ArrayBuffer


class RecipeBook {

  val recipeTitle = new ArrayBuffer[String]()


  def addData(): Unit = {
    var recipe = new Recipe()
    printf("What recipe:> ")
    val recipeName = io.StdIn.readLine()
    recipeTitle += recipeName
    //println(recipeTitle.last)
    //println(recipeTitle.length)
    recipe.addData()
  }
  def displayData(): Unit = {
    var recipe = new Recipe()
    println("Recipe: " + recipeTitle(0))
    println("==================================")
    print("  ")


    println("______" + recipeTitle(0) + "______")
    println(recipe.ingredients.last(0))
    println(printBaked())

  }

  def printBaked() = {
    var bakedInfo = new Baked
    print("  " + bakedInfo)
  }

  def printMix() = {
    var mixInfo = new Mix
    print(" " + mixInfo)
  }

  def printRemeasured() = {
    var remeasuredInfo = new Remeasure
    print(" " + remeasuredInfo)
  }

  def printSingle() = {
    var singledInfo = new Single
    print(" " + singledInfo)
  }
}
