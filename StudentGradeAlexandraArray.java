package Project2;

/*
 * Write a program that reads a student’s first and last names followed by five test scores. The 
 * program should output the student’s first name, last name, the five test scores, and the average 
 * test score. Output the average test score with two decimal places.
 * The data to be read is stored in a file named test.txt; the output should be stored in a file named 
 * testavg.txt.
 */

/*
 * @author: Alexandra Ewbank
 * @date: November 18, 2022
 */

/*
 * Algorithm
 * 1. Import necessary java packages (util + io);
 * 2. Declare variables for student's name (Strings) and test scores (double array);
 *    firstName, lastName, score[];
 * 3. Import objects Scanner inFile and PrintReader outFile;
 * 4. Read student name and test scores using Scanner;
 * 5. Create for loop for array
 * 6. Calculate student test score average;
 * 7. Write results using PrintWriter;
 * 8. Close Scanner and PrintWriter;
 * 9. End
*/


// import java packages
import java.util.*;
import java.io.*;

// start StudentGrade class
public class StudentGradeAlexandraArray {
    // main method begins execution
    public static void main(String[] args) throws FileNotFoundException {
        // 1. Declaration phase
        String firstName, lastName;
        double scoreAverage;
        double score[];
        double scoreSum = 0;
    

        // reference variables
        Scanner inFile;
        PrintWriter outFile;

        // 2. Initialization phase
        inFile = new Scanner(new FileReader("C:\\Users\\alexa\\Documents\\School\\2_Programming_1\\Java\\Programming_I_Project_Data_Fall_2022\\Project2\\Data\\testAlexandra.txt"));
        outFile = new PrintWriter("C:\\Users\\alexa\\Documents\\School\\2_Programming_1\\Java\\Programming_I_Project_Data_Fall_2022\\Project2\\Data\\testavgAlexandraArray.txt");

        // first and last name
        firstName = inFile.next();
        lastName = inFile.next();
        
        // array
        score = new double[5];
        for (int counter = 0; counter < score.length; counter++) {
            score[counter] = inFile.nextDouble();
            scoreSum += score[counter];
        }

        // 3. Processing phase
        scoreAverage = scoreSum / score.length;

        // 4. Termination phase
        outFile.println("Student Name: " + firstName + " " + lastName);
        outFile.println("Test scores: " + score[0] + " " + score[1] + " " + score[2] + " " + score[3] + " " + score[4]);
        outFile.printf("Average test score: %.2f", scoreAverage);

        // close inFile and outFile objects
        inFile.close();
        outFile.close();

    } // end main method

} // end StudentGrade class
