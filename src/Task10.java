import java.util.Scanner;

/**
 * This class finds the GCD of two numbers using recursion.
 */
public class Task10 {

    /**
     * Recursively calculates the greatest common divisor (GCD) using Euclidean algorithm.
     *
     * Time Complexity: O(log(min(a, b))) - Because in each step, the larger number is reduced.
     * Space Complexity: O(log(min(a, b))) - Due to recursion depth.
     *
     * @param a First number.
     * @param b Second number.
     * @return The GCD of a and b.
     */
    public static int gcd(int a, int b) {
        if (b == 0) return a; // Base case: when remainder is 0, return a
        return gcd(b, a % b); // Recursive call
    }

    /**
     * Main method to read input and call the recursive function.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("GCD: " + gcd(a, b));

        scanner.close();
    }
}
