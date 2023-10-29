package homework_week_8;

import java.util.Scanner;

/**
 * 1.Read 10 numbers from the console entered by the user and print the sum of those numbers.
 * use the hasNextInt()method from the scanner to check if the user has entered int value.
 * If has NextInt() return false, print the message Invalid Number. Continue reading until you have read 10 numbers.
 * use the nextInt() method to get the number and add it to the sum.
 * Before the user enters each number, print the message Enter number #x:where x represents the count i.e 1,2,3,4, etc.
 * For example, the first message printed to the user would be Enter number #1:,the next enter number #2:, and so on.
 * Hint:
 * use a while loop
 * Use a counter variable for counting valid numbers.
 * lose the scanner after you don't need it anymore.
 */
public class Programme1_ReadingUserInputChallenge {

    public static void main(String[] args) {//main method
        Scanner scanner = new Scanner(System.in);//scannrr declaration

        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.println("Please enter a number: " + count);
            {
                boolean validateNumber = scanner.hasNextInt();
                if (validateNumber) {
                    int number = scanner.nextInt();
                    sum += number;
                    count++;
                } else {
                    System.out.println("Invalid number");
                }
                scanner.nextLine();
            }
            System.out.println("Sum of all numbers is = " + sum);

            scanner.close();//closing scanner
        }

    }
}