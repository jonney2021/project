// package project;
/*
 * ◼ Project-1 Classify Numbers (ClassifyNumbers.java)
This program reads a given set of integers and then prints the number of odd integers, the number of even integers, and the number of zeros.
The program reads 20 integers, but you can easily modify it to read any set of numbers. In fact, you can modify the program so that it first prompts the user to specify how many integers are to be read.
Input: A 20 integers—positive, negative, or zeros.
Output: The number of zeros, even numbers, and odd numbers.
 */

/**
 * @author Yeming Hu
 * @version 1.0
 * @since November 18, 2022
 */

// import java package
import java.util.Scanner;

// class declaration 
public class ClassifyNumbers {
    // main method begins execution of the Java app.
    public static void main(String[] args) {
        // declare variables
        int evens, odds, zeros;
        int numberToRead; // specify how many integers are to be read
        int counter;
        int[] array; // an integer array to store the integer values entered by user

        // Create a scanner object to receive user input.
        Scanner console = new Scanner(System.in);

        // Initialize variables
        evens = 0;
        odds = 0;
        zeros = 0;

        // Prompt user to specify how many integers are to be read.
        System.out.print("Please enter the number of integer digits you want to enter: ");

        numberToRead = console.nextInt();
        // Store the integers entered by the user into the array.
        array = new int[numberToRead];
        // Prompt the user to enter specific integer values
        System.out.println("Please enter " + numberToRead + " integers, positive, negative, or zeros:");
        // Use a for loop to iterate through the array.
        for (counter = 0; counter < array.length; counter++) {
            array[counter] = console.nextInt();
            System.out.print(array[counter] + " ");
            // Switch block to decide whether number is odd or even or zero.
            switch (array[counter] % 2) {
                case 0: // number is even
                    evens++;
                    if (array[counter] == 0) {
                        zeros++;
                    }
                    break;
                case 1: // number is positive
                case -1: // number is negative
                    odds++;
                    break;
            }// end switch block

        } // end for loop

        // output the information.
        System.out.println();
        System.out.println("There are " + evens + " evens, which also includes " + zeros + " zeros");
        System.out.println("Total number of odds is: " + odds);

        // close scanner object
        console.close();

    }// end method main

}// end class ClassifyNumbers

/*
 * Step-by-step algorithm:
 * Step 1: Start
 * Step 2: Define variables (odds, evens, zeros) to store odd numbers, even
 * numbers and zero numbers.
 * Step 3: Define a variable to store how many integers are to be read.
 * Step 4: Defines an integer array to store the integer values entered by the
 * user.
 * Step 5: Create a Scanner object to receive user input.
 * Step 6: Initialize the variables zeros, evens, and odds to zero.
 * Step 7: Prompt the user to enter relevant information.
 * Step 8: Use an array to receive integer values entered by the user.
 * Step 9: Use for loop to loop through the array to get each integer value
 * (array[counter]).
 * Step 10: Use switch statement to decide whether number is odd or even or
 * zero.
 * Step 11: If array[counter] % 2 ==0, the value of evens is incremented by 1.
 * Step 12: Then if array[counter] == 0, the value of zeros is incremented by 1.
 * Step 13: If array[counter] % 2 == -1, indicates that this integer is an odd
 * number that is negative,
 * the value of odds is incremented by 1.
 * Step 14: If array[counter] % 2 == 1, indicates that this integer is an odd
 * number that is positive.
 * Step 15: Output the result information.
 * Step 16: Close the scanner object.
 * Step 17: End.
 */