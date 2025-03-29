import java.util.Scanner;

/**
 * This class contains a recursive function to check
 * whether a string consists only of digits.
 */
public class Task8 {

    /**
     * Recursively checks if the string consists only of digits.
     *
     * Time Complexity: O(n) - Each character is checked once.
     * Space Complexity: O(n) - Due to recursion stack.
     *
     * @param s The input string.
     * @param index The current index being checked.
     * @return true if all characters are digits, false otherwise.
     */
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true; // Base case: all checked
        if (!Character.isDigit(s.charAt(index))) return false; // Found a non-digit
        return isAllDigits(s, index + 1); // Recursive call
    }

    /**
     * Main method to read input and call the recursive function.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.next();

        System.out.println(isAllDigits(s, 0) ? "Yes" : "No");

        scanner.close();
    }
}
