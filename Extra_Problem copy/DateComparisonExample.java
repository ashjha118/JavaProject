package Extra_Problem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparisonExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Take first date input
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstInput = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstInput, formatter);

        // Take second date input
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondInput = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(secondInput, formatter);

        // Compare dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println(firstDate + " is before " + secondDate);
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println(firstDate + " is after " + secondDate);
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println(firstDate + " is the same as " + secondDate);
        }
    }
}
