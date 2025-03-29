import java.util.Scanner;

/**
 * 2-task
 * This class contains a recursive function to calculate 
 * the average of an array of numbers.
 */
public class Task2 {
    /**
     * Recursively calculates the sum of an array.
     * Time Complexity: O(n) - Linear recursion.
     * Space Complexity: O(n) - Due to recursion stack.
     * 
     * @param arr The input array.
     * @param n The number of elements.
     * @return The sum of elements in the array.
     */
    public static double recursiveSum(int[] arr, int n) {
        if (n == 0) return 0; // Base case
        return arr[n - 1] + recursiveSum(arr, n - 1);
    }

    /**
     * Calculates the average of an array using recursion.
     * Time Complexity: O(n) - Since it calls recursiveSum().
     * Space Complexity: O(n) - Due to recursion stack.
     * 
     * @param arr The input array.
     * @param n The number of elements.
     * @return The average of the array elements.
     */
    public static double findAverage(int[] arr, int n) {
        if (n == 0) return 0; // Prevent division by zero
        return recursiveSum(arr, n) / n;
    }

    /**
     * Main function to read input and display output.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        double average = findAverage(arr, n);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
