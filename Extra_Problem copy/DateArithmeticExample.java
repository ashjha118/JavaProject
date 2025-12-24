package Extra_Problem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmeticExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Take date input from user
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        // Parse input date
        LocalDate date = LocalDate.parse(inputDate, formatter);
        System.out.println("Original Date: " + date.format(formatter));

        // Add 7 days, 1 month, and 2 years
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After adding 7 days, 1 month, 2 years: " + modifiedDate.format(formatter));

        // Subtract 3 weeks
        LocalDate finalDate = modifiedDate.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + finalDate.format(formatter));
    }
}
