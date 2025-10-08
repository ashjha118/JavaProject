package Extra_Problem;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");

        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "?");
            String feedback = getUserFeedback();

            switch (feedback.toLowerCase()) {
                case "high" -> high = guess - 1; // guess is too high
                case "low" -> low = guess + 1;   // guess is too low
                case "correct" -> {
                    System.out.println("Hooray! I guessed your number correctly.");
                    guessedCorrectly = true;
                }
                default -> System.out.println("Invalid feedback! Please enter 'high', 'low', or 'correct'.");
            }

            // Check if the range is valid
            if (low > high) {
                System.out.println("Hmm, it seems there is some inconsistency. Let's restart!");
                low = 1;
                high = 100;
            }
        }
    }

    // Function to generate a guess between low and high (inclusive)
    private static int generateGuess(int low, int high) {
        return random.nextInt(high - low + 1) + low;
    }

    // Function to get user feedback
    private static String getUserFeedback() {
        System.out.print("Enter feedback (high, low, correct): ");
        return scanner.nextLine();
    }
}
