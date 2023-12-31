package homework_week_8;

/**
 * Programme-13
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 */
public class Programme13_SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));  // Should return true
        System.out.println(hasSharedDigit(9, 99));    // Should return false
        System.out.println(hasSharedDigit(15, 55));   // Should return true
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }
        int firstDigitNum1 = num1 % 10;
        int secondDigitNum1 = num1 / 10;
        int firstDigitNum2 = num2 % 10;
        int secondDigitNum2 = num2 / 10;

        return (firstDigitNum1 == firstDigitNum2) || (firstDigitNum1 == secondDigitNum2) ||
                (secondDigitNum1 == firstDigitNum2) || (secondDigitNum1 == secondDigitNum2);
    }

}
