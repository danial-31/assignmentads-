import java.util.Scanner;

public class Task1 {

    /**
     * Recursively finds the minimum element in an array.
     *
     * @param arr The array of numbers.
     * @param n The size of the array (number of elements to consider).
     * @return The minimum element in the array.
     */
    static int findMin(int[] arr, int n) {
        if (n == 1) return arr[0]; // Base case: If there's only one element, it's the minimum
        return Math.min(arr[n - 1], findMin(arr, n - 1));
        // Compare the last element of the array with the minimum in the remaining part (recursion)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt(); // Read the number of elements

        int[] arr = new int[n]; // Create an array of the specified size

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Fill the array with user input
        }

        System.out.println("Minimum element: " + findMin(arr, n)); // Call the function and print the result

        sc.close(); // Close the Scanner
    }
}
