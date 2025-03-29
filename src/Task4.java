import java.util.Scanner;

/**
 * This program calculates the factorial of a given number using recursion.
 * It also measures the execution time of the computation.
 */
public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        double startTime = System.nanoTime(); // Start time measurement
        int result = factorial(n); // Calculate factorial
        double endTime = System.nanoTime(); // End time measurement

        double duration = (endTime - startTime) / 1_000_000; // Convert to milliseconds
        System.out.println("Factorial of " + n + " is: " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * This method calculates the factorial of a given number using recursion.
     * Base case: If n is 0 or 1, return 1.
     * Recursive case: n! = n * (n - 1)!
     *
     * Time Complexity: O(n), since the function is called recursively n times.
     * Space Complexity: O(n), due to the recursive call stack.
     *
     * @param n The number for which the factorial is to be calculated.
     * @return The factorial of the given number.
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1) { // Base case
            return 1;
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }
}
