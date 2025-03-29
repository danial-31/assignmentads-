import java.util.Scanner;

/**
 * This class provides an optimized recursive function to calculate a^n using exponentiation by squaring.
 */
public class Task6 {

    /**
     * Recursively calculates a^n using exponentiation by squaring.
     *
     * Time Complexity: O(log n) - Each step reduces n by half.
     * Space Complexity: O(log n) - Due to recursion stack.
     *
     * @param a The base number.
     * @param n The exponent.
     * @return The result of a^n.
     */
    public static long fastPower(int a, int n) {
        if (n == 0) return 1; // Base case: a^0 = 1
        long half = fastPower(a, n / 2); // Recursively compute half power
        return (n % 2 == 0) ? half * half : half * half * a; // Use squaring
    }

    /**
     * Main method to read user input and display the result of a^n.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter exponent (n): ");
        int n = scanner.nextInt();

        System.out.println(a + "^" + n + " = " + fastPower(a, n));

        scanner.close();
    }
}
