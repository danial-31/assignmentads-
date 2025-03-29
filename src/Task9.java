import java.util.Scanner;

/**
 * This class calculates the binomial coefficient using recursion.
 */
public class Task9 {

    /**
     * Recursively calculates the binomial coefficient C(n, k).
     *
     * Time Complexity: O(2^n) - Due to repeated recursive calls.
     * Space Complexity: O(n) - Due to recursion stack.
     *
     * @param n The total number of elements.
     * @param k The chosen subset size.
     * @return The binomial coefficient C(n, k).
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) return 1; // Base cases: C(n, 0) = C(n, n) = 1
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    /**
     * Main method to read input and call the recursive function.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter values for n and k: ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println("Result: " + binomialCoefficient(n, k));

        scanner.close();
    }
}
