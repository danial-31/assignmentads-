import java.util.Scanner;

public class Task3 {
    // Recursive function to check if a number is prime
    public static boolean isPrimeRecursive(int n, int divisor) {
        if (n < 2) return false; // Numbers less than 2 are not prime
        if (divisor * divisor > n) return true; // No divisors found, so it's prime
        if (n % divisor == 0) return false; // If divisible, it's composite
        return isPrimeRecursive(n, divisor + 1); // Check next divisor
    }

    public static String checkPrime(int n) {
        return isPrimeRecursive(n, 2) ? "Prime" : "Composite";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Result: " + checkPrime(n));

        scanner.close();
    }
}
