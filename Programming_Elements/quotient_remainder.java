package WeekFirst;

import java.util.Scanner;

public class quotient_remainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        if (number2 != 0) {
            
            int quotient = number1 / number2;
            int remainder = number1 % number2;

            System.out.println("The Quotient is " + quotient +
                               " and Remainder is " + remainder +
                               " of two number " + number1 + " and " + number2);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
