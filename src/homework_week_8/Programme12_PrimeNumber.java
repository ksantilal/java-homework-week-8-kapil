package homework_week_8;
/**
 * Programme-12
 * Write a programme to input any number and check if it is prime or not.
 */

import java.util.Scanner;

public class Programme12_PrimeNumber {
    public static void main(String[] args) {
        int x;
        boolean isPrime = true;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = s.nextInt();
        s.close();

        for (int i = 2; i <= num / 2; i++) {
            x = num % i;
            if (x == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
        //s.close();
    }
}

