// package project;
/*
 * ◼ Project-2 Student Grade (StudentGrade.java)
Write a program that reads a student’s first and last names followed by five test scores. The program should output the student’s first name, last name, the five test scores, and the average test score. Output the average test score with two decimal places.
The data to be read is stored in a file named test.txt; the output should be stored in a file named testavg.txt.
Input: A file containing the student’s first name, last name, and the five test scores.
Output: The student’s first name, last name, five test scores, and the average of the five
test scores, saved to a file.
 */

/**
 * @author Yeming Hu
 * @version 1.0
 * @since November 18, 2022
 */

// import java package
import java.util.Scanner;
import java.io.*;

// class declaration.
public class StudentGrade {
    // main method begins execution of the Java app.
    public static void main(String[] args) throws FileNotFoundException {
        // declare variables
        String firstName, lastName;
        // double firstScore,secondScore,thirdScore,fourthScore,fifthScore;
        double sumScore;
        double avgScore;
        double[] score;

        // Create the scanner object and outFile object.
        Scanner inFile = new Scanner(new FileReader("data/test.txt"));
        PrintWriter outFile = new PrintWriter("data/testavg.txt");

        // Initialize variables
        sumScore = 0.0;
        score = new double[5];

        // Read first name and last name of the student from the file test.txt.
        firstName = inFile.next();
        lastName = inFile.next();

        // firstScore = inFile.nextDouble();
        // secondScore = inFile.nextDouble();
        // thirdScore = inFile.nextDouble();
        // fourthScore = inFile.nextDouble();
        // fifthScore = inFile.nextDouble();

        // Iterate over the array read five scores from the file test.txt and calculate the sumScore.
        for (int counter = 0; counter < score.length; counter++) {
            score[counter] = inFile.nextDouble();
            sumScore += score[counter];
        }

        // Calculate the average score.
        // avgScore = (firstScore + secondScore + thirdScore + fourthScore + fifthScore)
        // / 5;
        avgScore = sumScore / score.length;

        // Output the results to the testavg.txt file
        outFile.printf("Student name: %s %s%n", firstName, lastName);
        outFile.printf("Test scores: %.2f %.2f %.2f %.2f %.2f%n", score[0], score[1], score[2], score[3], score[4]);
        outFile.printf("Average test score: %.2f%n", avgScore);

        // close the scanner and outFile object.
        inFile.close();
        outFile.close();
    } // end method main

} // end class StudentGrade

/*
 * Step-by-step algorithm:
 * Step 1: Start
 * Step 2: Define variables for the student’s first name, last name, sumScore,
 * avgScore, and use an array to store five scores.
 * Step 3: Create the scanner object and outFile object.
 * Step 4: Read the students' first and last names from the file test.txt.
 * Step 5: Iterate over the array read five scores from the file test.txt and calculate the sumScore.
 * Setp 6: Calculate the average score by sumScore dividing by the length of the array.
 * Step 7: Output the results to the testavg.txt file.
 * Step 8: Close the scanner and outFile object.
 * Step 9: End
 */