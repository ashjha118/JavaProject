package Extra_Problem;

import java.util.Scanner;

public class FibonacciGenerator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci sequence up to " + n + " terms:");
            generateFibonacci(n);
        }
    }

    // Function to calculate and print Fibonacci sequence
    private static void generateFibonacci(int n) {
        long first = 0, second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println(); // new line at the end
    }
}
