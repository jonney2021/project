/**
 * @author Matthew Harbour
 * @date 19/11/2022
 * @version 1.0
 */
import java.util.Scanner;

public class MovieTicketSaleMat {

    public static void main(String args[])
    {
        double adultTicket, adultSold, childTicket, 
            childSold, grossAmount, percentDonation, 
            donateCharity, netSale;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Adult Ticket Price: ");
        adultTicket = sc.nextDouble();

        System.out.print("Enter No of Adult Ticket Sold: ");
        adultSold = sc.nextDouble();

        System.out.print("Enter Child Ticket Price: ");
        childTicket = sc.nextDouble();

        System.out.print("Enter No of Child Ticket Sold: ");
        childSold = sc.nextDouble();;

        System.out.print("Enter No of Percent Donation: ");
        percentDonation = sc.nextDouble();

        grossAmount = grossAmount(adultTicket, adultSold, childTicket, childSold);
        donateCharity = donateCharity(percentDonation , grossAmount);
        netSale = netSales(grossAmount, donateCharity);

        System.out.println(" ");

        System.out.println("The Gross Amount is: " + grossAmount);
        System.out.println("The Donated to the Charity is: " + donateCharity);
        System.out.println("The Net Sale is: " + netSale +"\n");

        sc.close();
    }
    
    public static double grossAmount(double a, double b, double c, double d)
    {
        double gross = a * b + c * d;
        return gross;
    }
    
    public static double donateCharity(double a, double b)
    {
        double donate = (b * a);
        return donate;
    }
    
    public static double netSales(double a, double b)
    {
        double sales = a - b;
        return sales;
    }
}
