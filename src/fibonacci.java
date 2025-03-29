import java.util.Scanner;

/**
 * This class provides a recursive function to find the nth Fibonacci number.
 */
public class fibonacci {

    /**
     * Recursively calculates the nth Fibonacci number.
     *
     * Time Complexity: O(2^n) - Exponential time complexity due to repeated calculations.
     * Space Complexity: O(n) - Due to recursion stack.
     *
     * @param n The index of the Fibonacci sequence.
     * @return The nth Fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n == 0) return 0; // Base case: F0 = 0
        if (n == 1) return 1; // Base case: F1 = 1
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive relation: F(n) = F(n-1) + F(n-2)
    }

    /**
     * Main method to read user input and display Fibonacci result.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));

        scanner.close();
    }
}
