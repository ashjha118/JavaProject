package Extra_Problem;

import java.util.Scanner;

public class BasicCalculator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Basic Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose an operation (1-4): ");

        int choice = scanner.nextInt();

        double num1 = getNumber("Enter the first number: ");
        double num2 = getNumber("Enter the second number: ");

        switch (choice) {
            case 1 -> System.out.println("Result: " + add(num1, num2));
            case 2 -> System.out.println("Result: " + subtract(num1, num2));
            case 3 -> System.out.println("Result: " + multiply(num1, num2));
            case 4 -> {
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Result: " + divide(num1, num2));
                }
            }
            default -> System.out.println("Invalid choice! Please select 1-4.");
        }
    }

    // Function to get number input from user
    private static double getNumber(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a numeric value.");
            scanner.next(); // discard invalid input
            System.out.print(prompt);
        }
        return scanner.nextDouble();
    }

    // Addition
    private static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    private static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    private static double multiply(double a, double b) {
        return a * b;
    }

    // Division
    private static double divide(double a, double b) {
        return a / b;
    }
}
