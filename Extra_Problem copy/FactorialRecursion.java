package Extra_Problem;

import java.util.Scanner;

public class FactorialRecursion {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Get input
        int number = getInput();

        // Calculate factorial using recursion
        long factorial = calculateFactorial(number);

        // Display result
        displayResult(number, factorial);
    }

    // Function to get input from user
    private static int getInput() {
        System.out.print("Enter a non-negative integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            scanner.next(); // discard invalid input
            System.out.print("Enter a non-negative integer: ");
        }
        int num = scanner.nextInt();
        while (num < 0) {
            System.out.print("Number must be non-negative. Enter again: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next(); // discard invalid input
            }
            num = scanner.nextInt();
        }
        return num;
    }

    // Recursive function to calculate factorial
    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    // Function to display result
    private static void displayResult(int number, long factorial) {
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
