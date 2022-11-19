"""
Grading tags in for all lines marked with *		done

Tierless str meets D in SOLID (hidden test)*		done
Check if done, but not all tiers are passing		done

1. Initial Show system \ Got it compiling
Menu \ initial system working				    done
Bad input handled								done

2. Add Default Box
Added and shown properly						done
Second+ box ignored								done

3. Basic Update
Moves along belts								done
Moves to next station\belt						done
Drops off the end when reached					done
String format correct							done
Iterator used*									done

4. Multi Update
Updates correct amount							done
Bad input handled								done
String format correct							done

5. Show station details (default)
Shows stations details properly 				done
Iterator used*									done

6. Add box
Added and shown properly						done
Second+ box ignored								done
Bad input handled								done

7. Tester Conveyer part 1
Initial system and station details correct 		done
A single box still able to be added				___
Update with one default box works				___
Loading works 									___
Formatting correct 								___

8. Tester Conveyer part 2
Packaging works 								not done
Formatting correct 								not done
Strategy pattern for loading*					not done
Strategy pattern for packaging*					not done


9. Custom belt **
String formatting correct						not done
Everything still works 							not done
Bad input handled 								not done


** This tier has 3 tests associated with it. 9A tests all belt/station orderings. 9B tests all combinations of packaging and fill. 9C tests error checking.
"""
from wilson_adeline.Conveyer import Conveyer
from wilson_adeline.Box import Box

def cleanInput(prompt):
    result = input(prompt)
    # strips out blank lines in input
    while result == '':
        result = input()

    return result


def main():
    global conveyer
    menu = "\n" \
           "1) Add Default Box\n" \
           "2) Move Belt One Time Unit\n" \
           "3) Move Belt X Time Units\n" \
           "4) Show Station Details\n" \
           "5) Add Box\n" \
           "6) Make Tester Conveyer Belt\n" \
           "7) Make New Conveyer Belt\n" \
           "0) Quit\n"

    conveyer = Conveyer()
    print(conveyer)
    box = Box()


    choice = -1

    while choice != 0:

        try:
            print(menu)
            choice = cleanInput("Choice:> ")
            choice = int(choice)
            if choice < 0 or choice > 7:
                print("Input an option1 in the range 0-7")
        except:
            print("Please, input a positive integer")

        # add default box
        if choice == 1:
            conveyer.add_box(box)


        # update one time
        elif choice == 2:
            print("TODO")

        # update X number of times
        elif choice == 3:
            print("TODO")

        # print out station details
        elif choice == 4:
            print("TODO")

        # make a new box of any size
        elif choice == 5:
            print("TODO")

        # make new system
        elif choice == 6:
            print("TODO")

        # make new system
        elif choice == 7:
            print("TODO")

        # debug/check for D in SOLID in __str__
        elif choice == -1:
            print("TODO")

        elif choice == 0:
            choice = 0
        else:
            print("Input an option in the range 0-7")


if __name__ == '__main__':
    main()
