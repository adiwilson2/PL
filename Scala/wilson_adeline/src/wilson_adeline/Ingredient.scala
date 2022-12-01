package wilson_adeline

import scala.collection.mutable.ArrayBuffer
import java.io.FileWriter
import scala.xml.XML


abstract class Ingredient() {

  def addData(ingredients: ArrayBuffer[Ingredient]): Unit

  def displayData(offset : String ): String
}
