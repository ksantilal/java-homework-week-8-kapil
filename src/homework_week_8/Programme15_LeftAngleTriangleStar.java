package homework_week_8;

/**
 *  Programme-15
 *  Display left angle triangle of * using nested for loops
 *           *
 *         * *
 *       * * *
 *     * * * *
 *   * * * * *
 */
public class Programme15_LeftAngleTriangleStar {

    public static void main(String[] args) {
        int n = 5; // Change the value of 'n' to adjust the number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print("  "); // Print spaces for alignment
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}