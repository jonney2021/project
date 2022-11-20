import java.util.*;
import java.io.*;

public class StudentGradeMat {

    public static void main(String[] args) throws FileNotFoundException {
        String firstName, lastName;
        double[] testScore = new double[5];        
        //double grade1, grade2, grade3, grade4, grade5;

        Scanner inFile;
        PrintWriter outFile;
        inFile = new Scanner(new FileReader("C:\\ICA8\\test.txt"));
        outFile = new PrintWriter("C:\\ICA8\\StudentGrade.txt");

        do  
        {
            firstName = inFile.next();
            lastName = inFile.next();
            testScore[0] = inFile.nextDouble();
            testScore[1] = inFile.nextDouble();
            testScore[2] = inFile.nextDouble();
            testScore[3] = inFile.nextDouble();
            testScore[4] = inFile.nextDouble();
        } 
        while (inFile.hasNext());

        outFile.println("Student Name: " + firstName + " " + lastName);
        outFile.println("Test Scores: " + testScore[0] + " "  + testScore[1] + " " +  testScore[2] + " " +  testScore[3] + " " + testScore[4] + " ");
        outFile.println("Average test score: " + (testScore[0] + testScore[1] + testScore[2] + testScore[3] + testScore[4])/5);
       
    inFile.close();
    outFile.close();
    }
}
