package project;
/*
 * ◼ Project-3 Movie Ticket Sale and Donation to Charity (MovieTicketSale.java)
A movie in a local theater is in great demand. The theater owner has decided to donate to a local charity a portion of the gross amount generated from the movie.
This project case designs and implements a program that prompts the user to input the movie name, adult ticket price, child ticket price, number of adult tickets sold, number of child tickets sold, and percentage of the gross amount to be donated to the charity.
Note that the decimal numbers are output with two decimal places.
Input: The input to the program consists of the movie name, adult ticket price, child ticket price, number of adult tickets sold, number of child tickets sold, and percentage of the gross amount to be donated to the charity.
Output: See below the Sample run.
 */

import java.util.Scanner;

/**
 * @author Yeming Hu
 * @version 1.0
 * @since November 18, 2022
 */
// import java package

// class declaration
public class MovieTicketSale {

    public static void main(String[] args) {
        // Declare variables
        String movieName;
        double adultTicketPrice, childTicketPrice;
        int noOfChildTicketsSold, noOfAdultTicketsSold;
        double percentDonation;
        double grossAmount, amountDonated, netSaleAmount;
        String outputStr; // store the output information

        // Create a scanner object to receive user input.
        Scanner console = new Scanner(System.in);

        // Prompt user to input the information.
        System.out.print("Enter the movie name: ");
        movieName = console.nextLine();
        System.out.println();
        System.out.print("Enter the price of an adult ticket: ");
        adultTicketPrice = console.nextDouble();
        System.out.print("Enter the price of a child ticket: ");
        childTicketPrice = console.nextDouble();
        System.out.print("Enter the number of adult ticket sold: ");
        noOfAdultTicketsSold = console.nextInt();
        System.out.print("Enter the number of child ticket sold: ");
        noOfChildTicketsSold = console.nextInt();
        System.out.print("Enter the percentage of the donation: ");
        percentDonation = console.nextInt();

        // Formulas to caiculate the grossAmount, amountDonated and netSaleAmount.
        grossAmount = adultTicketPrice * noOfAdultTicketsSold + childTicketPrice * noOfChildTicketsSold;
        amountDonated = grossAmount * percentDonation / 100;
        netSaleAmount = grossAmount - amountDonated;
       
        System.out.println();
        // OutputStr to store and format all of the output information.
        outputStr = "Movie Name: " + movieName + "\n" + "Number of Tickets Sold: "
                + (noOfAdultTicketsSold + noOfChildTicketsSold) + "\n"
                + String.format("Gross Amount: $%.2f%n", grossAmount)
                + String.format("Percentage of the Gross Amount Donated: %.2f%%%n", percentDonation)
                + String.format("Amount Donated: $%.2f%n", amountDonated)
                + String.format("Net Sale: $%.2f%n", netSaleAmount);
        // Output the information.        
        System.out.println(outputStr);

        // Close the scanner object.
        console.close();

    } // end method main

} // end class MovieTicketSale


/*
 * Step-by-step algorithm:
 * Step 1: Start
 * Step 2: Define variables to store the movie name, adult ticket price, child
 * ticket price, number of adult tickets sold,
 * number of child tickets sold, percentage of the gross amount donated to the
 * charity, gross amount, amount donated, and net sale amount.
 * Step 3: Create a scanner object to receive user input.
 * Step 4: Prompt user to input the movie name, adult ticket price, child ticket
 * price, number of adult tickets sold, number of child tickets sold, and
 * percentage of the gross amount to be donated to the charity.
 * Step 5: Use formulas to caiculate the grossAmount, amountDonated and netSaleAmount.
 *         grossAmount = adultTicketPrice * noOfAdultTicketsSold + childTicketPrice * noOfChildTicketsSold;
           amountDonated = grossAmount * percentDonation / 100;
           netSaleAmount = grossAmount - amountDonated;
 * Step 6: Use a String variable to store and format all of the output information.
 * Step 7: Output the information.
 * Step 8: End.
 */
