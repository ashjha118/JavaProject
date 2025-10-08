package Extra_Problem;

import java.util.Scanner;

public class MaximumOfThree {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Find the maximum of three numbers.");

        // Take inputs
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        int num3 = getInput("Enter the third number: ");

        // Calculate maximum
        int max = findMaximum(num1, num2, num3);

        // Display result
        System.out.println("The maximum number is: " + max);
    }

    // Function to take input from the user
    private static int getInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            scanner.next(); // discard invalid input
            System.out.print(prompt);
        }
        return scanner.nextInt();
    }

    // Function to find maximum of three numbers
    private static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
}
