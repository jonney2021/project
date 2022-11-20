import java.util.*;
import java.util.Scanner;

public class ClassifyNumbersMat {

    public static void main(String[] args) {
        int zero = 0;
        int even = 0;
        double odd = 0;
        int array[];

        System.out.println("Enter length of array(1-20 inputs) :");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        array = new int[answer];
        
        System.out.println("Enter positive or negative integers elements, including 0 :");
        for (int i = 0; i < answer; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) 
        { System.out.printf(array[i] + " ");
            if (array[i] == 0) 
            {
                zero++;
                continue;
            }
            if (array[i] % 2 == 1) 
            {
                odd++;
                continue;
            }
            if (array[i]%2 != 1) 
            {
                even++;
            }
        }
        System.out.println("the amount of even numbers is: " + even);
        System.out.println("the amount of odd numbers is: " + odd);
        System.out.println("the amount of zeros are: " + zero);
    }
}    

