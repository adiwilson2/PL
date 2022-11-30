/*
0. Got it running						done
1. Add + Display*	36
Prompts correct 						______
Adds each item 						 	______
Above displays correctly formatted 		______


2A) Remove + Display*	10
Prompts correct							______
Removes and displays correctly 			______


2B) Add + XML save*	14
Console added items saved correctly 		______
Console added multiples is saved correctly 	______


2C) XML load + XML save*	14
1 XML file loaded and saved correctly 	______
2+ XML file loaded and saved correctly	______


2D) XML load + Display*	12
1 XML file loaded and displays correctly 	______
2+ XML file loaded and displays correctly	______


2E) XML+ Display with bad file handing	10
All errors handled 							______


3.	Stress test for above*	12
                      Loads in file, adds data, and displays/saves correctly			______
Appends a file and displays/saves correctly 					______
Removes ingredient after edits, and displays/saves correctly 	______


4. Find ingredient*	16
CoR format at least there						______
First item found and output formatted correctly	______
Handles “not found case”						______


5A.	Calculate calories*	7
Correct with no remeasuring		______
Correct with remeasuring		______
Parallelized* 					______

5B.  Calculate volume 7						______
Correct with no remeasuring or baking		______
Correct with remeasuring and baking 		______
Parallelized* 								______


6. Calculate density count 6				______


Every Line with a * has its grading tag: ______
*/
package wilson_adeline

import java.io.FileWriter
import java.text.DecimalFormat
import scala.io.StdIn
import scala.xml.XML


object MainStarter {
    def main(args: Array[String]) = {
        val format = new DecimalFormat("0.#")
        val menu: String =
            """
              |1) Add Data
              |2) Display Data
              |3) Remove Recipe
              |4) Load XML
              |5) Write XML
              |6) Find Ingredient in Recipe
              |7) Calculate Calories
              |8) Calculate Volume
              |9) Calculate Calorie Density
              |0) Quit
              |
              |Choice:> """.stripMargin
        var choice: Any = -1

        var temp = ""
        var data = new RecipeBook()

        while (choice != 0) {
            try {
                print(menu)
                // strip out empty lines
                temp = StdIn.readLine()
                while (temp.isEmpty)
                    temp = StdIn.readLine()
                choice = temp.toInt

                choice match {
                    case 0 => None
                    //GRADING: ADD
                    case 1 => data.addData()
                    //GRADING: PRINT
                    case 2 => println(data.displayData())
                    // case 3 => data.removeData()
                    //GRADING: READ
                   //  case 4 => data.loadXML()
                    //GRADING: WRITE
                   // case 5 => data.writeXML()
                    //GRADING: FIND
                   // case 6 => data.find()
                    //case 7 => data.sumCalories()
                   // case 8 => data.sumVolume()
                    //case 9 => data.sumDensity()
                    case _ => println("Invalid option")
                }
            } catch {
                {
                    case e: Throwable => print(e)
                }
            }
        }
    }

}