package Extra_Problem;

import java.util.Scanner;

public class TemperatureConverter {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                double celsius = getTemperature("Enter temperature in Celsius: ");
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println(celsius + "°C = " + fahrenheit + "°F");
            }
            case 2 -> {
                double fahrenheit = getTemperature("Enter temperature in Fahrenheit: ");
                double celsius = fahrenheitToCelsius(fahrenheit);
                System.out.println(fahrenheit + "°F = " + celsius + "°C");
            }
            default -> System.out.println("Invalid choice! Please select 1 or 2.");
        }
    }

    // Function to take temperature input
    private static double getTemperature(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a numeric value.");
            scanner.next(); // discard invalid input
            System.out.print(prompt);
        }
        return scanner.nextDouble();
    }

    // Function to convert Celsius to Fahrenheit
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to convert Fahrenheit to Celsius
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

