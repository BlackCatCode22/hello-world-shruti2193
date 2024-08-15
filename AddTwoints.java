// This is a comment
/*
* Shruti
* 8/15/2024
*  AddTwoInts
 */

import java.util.Scanner;  // Import the Scanner class

public class AddTwoints {
    public static void main(String[] args) {
        System.out.println(" \n Welcome to the Double Int Program");
        int firstnum = 0;
        int secondnum = 0;
        int sumOfBothNumbers = 0;

        System.out.println(" \n The value of sumOfBothNumbers is:" + sumOfBothNumbers);

        // Create a scanner object
        Scanner myscannerObject = new Scanner(System.in);
        // Ask user for the first int
        System.out.println("\n\n Please enter a whole number:");
        firstnum = myscannerObject.nextInt();

        // Unit text for first user input
        System.out.println("\n The value of firstnum is: " + firstnum);
        // Ask user for the second int
        System.out.println("\n\n Please enter a whole number:");
        secondnum = myscannerObject.nextInt();

        // Unit text for second user input
        System.out.println("\n The value of secondnum is: " + secondnum);

        // Processing
        // Add the two ints from the user
        // the total of firstnum and second num will be stored in
        // the variable named: sumOfBothNumbers

        sumOfBothNumbers = firstnum + secondnum;
         // Output the value of the variable named: sumOfBothNumbers
        System.out.println("\n The value of sumOfBothNumbers is: " + sumOfBothNumbers);



    }
}