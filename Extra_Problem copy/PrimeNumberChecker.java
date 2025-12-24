package Extra_Problem;

import java.util.Scanner;

public class PrimeNumberChecker {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();

        // Check if prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to check prime
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // check up to sqrt(n)
            if (n % i == 0) {
                return false; // divisible by a number other than 1 and itself
            }
        }
        return true; // prime
    }
}
