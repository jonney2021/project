/**
 * @author Matthew Harbour
 * @date 19/11/2022
 * @version 1.0
 */

/**Algorithm
 * Import Scanner
 * Declare variables as double, int and String data type
 * Initialize Scanner
 * Prompt user for input of Adult/Child ticket prices/amount sold.
 * calculate amounts of tickets sold, gross amount, amount donated and net total via 4 methods.
 * Use array
 * print out results.*/

import java.util.*; // import scanner

public class MovieTicketSale { // Begin class MovieTicketSaleMat

    public static void main(String args[]) // Begin main method
    {
        // declare variables
        double  adultTicket, childTicket, grossAmount, percentDonation, 
                donateAmount, netSale;
        int     adultTicketsSold, childTicketsSold, ticketsSold;
        String movieTitle = "Dino King: Journey to fire Mountain";

        // Initialize Scanner
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input for Adult ticket price
        System.out.print("Enter Adult Ticket Price: ");
        adultTicket = sc.nextDouble();
        // Prompt user for input for Adult tickets sold
        System.out.print("Enter No of Adult Ticket Sold: ");
        adultTicketsSold = sc.nextInt();
        // Prompt user for input for Child ticket price
        System.out.print("Enter Child Ticket Price: ");
        childTicket = sc.nextDouble();
        // Prompt user for input for Child tickets sold
        System.out.print("Enter No of Child Ticket Sold: ");
        childTicketsSold = sc.nextInt();
        // Prompt user for amount for donation in %. 
        System.out.print("Enter No of Percent Donation: ");
        percentDonation = sc.nextDouble();

        // calculate totals. 
        ticketsSold = totalTickets(adultTicketsSold,childTicketsSold);
        grossAmount = grossAmount(adultTicket, adultTicketsSold, childTicket, childTicketsSold);
        donateAmount = donateCharity(percentDonation , grossAmount);
        netSale = netSales(grossAmount, donateAmount);
        // use array
        double array[] = {adultTicket, adultTicketsSold, childTicket, childTicketsSold, grossAmount, percentDonation, donateAmount, ticketsSold, netSale};
        // print results
        System.out.println("\nMovie name: " + movieTitle);
        System.out.println("Number of tickets sold: " + array[7]);
        System.out.println(String.format("Gross Amount: $%.2f" , array[4]) + "");
        System.out.println("Percentage of Gross Amount Donated: " + array[5] + "%");
        System.out.println(String.format("Amount Donated: $%.2f" , array[6]) + "");
        System.out.println(String.format("The Net Sale: $%.2f" , array[8]) +"\n");
        // close scanner
        sc.close();
    }

    // method 1 for gross amount
    static double grossAmount(double a, double b, double c, double d)
    {
        double gross = a * b + c * d;
        return gross;
    }
    // method 2 for donate amount
    static double donateCharity(double a, double b)
    {
        double donate = (b * a ) / 100;
        return donate;
    }
    // method 3 for net sales
    static double netSales(double a, double b)
    {
        double sales = a - b;
        return sales;
    }
    // method 4 for total tickets sold
    static int totalTickets(int a, int b)
    {
        int sales = a+b;
        return sales;
    }
}
