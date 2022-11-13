/** Grading tags in for all lines marked with *		done

        The visitor pattern is used
        Handles bad input with 1 try-catch			done

        Tier 1: running and menu working 			mostly done
        Tier 2: set any object at 0, 0 				done
        Tier 3: handles bad input at this point			done
        Tier 4: set and unset at x, y				done
        Tier 5: default grid displays properly 			done
        Tier 6: count types * 					done

        Tier 7: coloring and menus completed*
        Colors all object correctly *			done
        All input errors handled 	  			done

        Tier 8: merge *						done

        Tier 9: Gravity*
        Any adjacent object removed	  		done
        All adjacent pullable objects removed		done
        At least one pullable objects are pulled inwards	done
        All pullable objects are pulled inwards		done
        Colors still correct				done
        Black holes and empty space ignored		done
        Uses a second visitor, not anything else*		done
 **/


package wilson_adeline;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SpaceStart {

    static Scanner cin;
    public static void main(String[] args) {
        System.out.println();
        Grid grid = new Grid();
        cin = new Scanner(System.in);
        String menu = """
                1) Set Area
                2) Make Default Grid
                3) Count Types
                4) Set Type Color
                5) Merge Nebula into Star
                6) Blackhole Gravitational Pull
                0) Quit
                """;
        int input = -1;
        int selection = -1;
        int locationX = -1;
        int locationY = -1;
        while(input != 0) {
            grid.PrintGrid();
            try {
                System.out.println(menu);
                System.out.print("Choice:> ");

                input = cin.nextInt();
                if(input < 0 || input > 6){
                    throw new CustomExceptions.NotInRange();
                }


                    switch (input) {
                        case 1:
                            //todo: set Area

                            System.out.println("Input area type 0) Empty 1) Planet 2) Star 3) Nebula 4) Black Hole:> ");
                            selection = cin.nextInt();
                            if(selection < 0 || selection > 4){
                                throw new CustomExceptions.WrongSelection();
                            }

                            System.out.println("Input location (x y):> ");
                            locationX = cin.nextInt();
                            locationY = cin.nextInt();

                            if(locationX < 0 || locationX > 7 || locationY < 0 || locationY > 5) {
                                throw new CustomExceptions.WrongLocation();
                            }
                            grid.setArea(locationX,locationY,selection);
                            break;
                        case 2:
                            //todo: Make Default Grid

                             grid.defaultGrid();
                            break;
                        case 3:
                            //todo: Count types

                            //GRADING: COUNT
                            Count visitor = new Count();
                            grid.acceptVisitor(visitor);
                            System.out.println(visitor);
                            break;
                        case 4:
                            //todo: Set type Color

                            System.out.println("Input area type 0) empty 1) pullable 2) black hole:> ");
                            int area = cin.nextInt();
                            if(area < 0 || area > 2){
                                throw new CustomExceptions.WrongSelection();
                            }

                            System.out.println("Input color 0) red 1) yellow 2) blue 3) green 4) black:>");
                            int color = cin.nextInt();
                            if(color < 0 || color > 4){
                                throw new CustomExceptions.WrongSelection();
                            }
                            //GRADING: COLOR
                            ColorVisit colorVisit = new ColorVisit(area, color);
                            grid.acceptVisitor(colorVisit);

                            break;
                        case 5:
                            //todo: Merge Nebula into Star
                            //GRADING: MERGE
                            Merge merge = new Merge(grid);
                            grid.acceptVisitor(merge);
                            break;
                        case 6:
                            //todo: Blackhole Gravitational Pull
                            //GRADING: GRAVITY
                            Gravity gravity = new Gravity(grid);
                            grid.acceptVisitor(gravity);
                            break;
                        case 0:
                            //Quit
                            break;
                    }

            } catch (CustomExceptions.NotInRange nir) {
                System.out.println("Unknown menu option");
            } catch(InputMismatchException characters) {
                System.out.println("Please input an integer");
                cin.nextLine();
            } catch(CustomExceptions.WrongSelection badInputS){
                System.out.println("Invalid selection option");
            } catch (CustomExceptions.WrongLocation | ArrayIndexOutOfBoundsException wrongLocation) {
                System.out.println("Location is out of range");
            }
        }
    }
}
