package wilson_adeline

import scala.collection.mutable
import scala.xml.{Elem, Text}
import scala.collection.mutable.ArrayBuffer


class RecipeBook {

  val recipes = new ArrayBuffer[Recipe]()
  val string : String = ""
  var recipeName: String = ""

  def addData(): Unit = {
    val recipe = new Recipe("")
    printf("What recipe:> ")
    recipeName = io.StdIn.readLine()

    if(findInRecipeBook() == true )
      printf(recipeName + " is already in the book \n")
    else
      recipe.Name = recipeName
      recipe.inputtingData()
      recipes.append(recipe)
  }


  def displayData(): String = {
    var recipe = new Recipe(name = "")
    var k: String = ""

    for (i <- recipes) {
      k += "Recipe: "
      k += i.Name
      k += "\n==================================\n"

      k += i.displayData( "  ")
    }
    k
  }

  def findInRecipeBook(): Boolean = {
    var found: Boolean = false
    var string: String = ""

    for (i <- recipes) {
      if (i.Name == recipeName) {
        found = true
      }
      else {
        found = false
      }
    }
      found
  }

  def returnAlreadyExists() : String = {
    var string : String = ""
    string += recipeName
    string += " is already in the book \n"
    string
  }
}




