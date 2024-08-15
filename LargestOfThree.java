//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// This is a comment
/*
 * Shruti
 * 8/15/2024
 *  AddTwoInts
 */

import java.util.Scanner;  // Import the Scanner class

public class LargestOfThree {
    public static void main(String[] args) {
        System.out.println(" \n Welcome to the largest of three  Program");
        int firstnum = 0;
        int secondnum = 0;
        int thirdnum = 0;
        int largestOfThree = 0;




        // Create a scanner object
        Scanner myscannerObject = new Scanner(System.in);
        // Ask user for the first int
        System.out.println("\n\n Please enter a whole number:");
        firstnum = myscannerObject.nextInt();


        // Ask user for the second int
        System.out.println("\n\n Please enter a second whole number:");
        secondnum = myscannerObject.nextInt();

        // Ask user for the third int
        System.out.println("\n\n Please enter a third whole number:");
        thirdnum = myscannerObject.nextInt();



        // Processing
        // compare the inputs with nested if statements

        if (firstnum > secondnum)
        {
            if (firstnum > thirdnum)
            {
                largestOfThree = firstnum;
            }
            else
            {
                largestOfThree = thirdnum;

            }
        }
        else {
            if (secondnum > thirdnum) {
                largestOfThree = secondnum;
            } else {
                largestOfThree = thirdnum;
            }

        }
        // largest of three
        System.out.println(" \n  largest of three is:" + largestOfThree);





    }
}