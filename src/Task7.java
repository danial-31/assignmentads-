import java.util.Scanner;

/**
 * This class contains a recursive function to print numbers in reverse order
 * without using an array.
 */
public class Task7 {

    /**
     * Recursively prints numbers in reverse order.
     *
     * Time Complexity: O(n) - Each number is processed once.
     * Space Complexity: O(n) - Due to recursion stack.
     *
     * @param n The number of elements.
     * @param scanner The Scanner object to read input.
     */
    public static void printReverse(int n, Scanner scanner) {
        if (n == 0) return; // Base case: stop recursion
        int num = scanner.nextInt(); // Read number
        printReverse(n - 1, scanner); // Recursive call before printing
        System.out.print(num + " "); // Print in reverse order
    }

    /**
     * Main method to read input and call the recursive function.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter elements:");
        printReverse(n, scanner); // Start recursion

        scanner.close();
    }
}
