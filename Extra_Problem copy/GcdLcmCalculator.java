package Extra_Problem;

import java.util.Scanner;

public class GcdLcmCalculator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Input two numbers
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");

        // Calculate GCD and LCM
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);

        // Display results
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    // Function to get input from user
    private static int getInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            scanner.next(); // discard invalid input
            System.out.print(prompt);
        }
        return scanner.nextInt();
    }

    // Function to calculate GCD using Euclidean algorithm
    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM using GCD
    private static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
