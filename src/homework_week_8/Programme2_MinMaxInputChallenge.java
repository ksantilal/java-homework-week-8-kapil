package homework_week_8;
/**
 * Programme 2
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 */
import java.util.Scanner;

public class Programme2_MinMaxInputChallenge {

    public static void main(String[] args) {
        minMax();
    }

    public static void minMax() {
        Scanner s = new Scanner(System.in);
        int num1, num2, max, min;
        System.out.println("Enter first number: ");
        num1 = s.nextInt();
        System.out.println("Enter second number: ");
        num2 = s.nextInt();

        max = Math.max(num1, num2);
        min = Math.min(num1, num2);

        while (num2 != 0) {
            System.out.println("Enter a number or 0 to stop: ");
            num2 = s.nextInt();
            if (num2 != 0) {
                max = Math.max(max, num2);
                min = Math.min(min, num2);
            }
        }
        System.out.println("Largest number is: " + max);
        System.out.println("Smallest number is: " + min);
        s.close();
    }
}

