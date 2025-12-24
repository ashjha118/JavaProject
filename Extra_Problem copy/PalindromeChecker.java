package Extra_Problem;

import java.util.Scanner;

public class PalindromeChecker {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Get input
        String input = getInput();

        // Check palindrome
        boolean isPalindrome = checkPalindrome(input);

        // Display result
        displayResult(input, isPalindrome);
    }

    // Function to get input from user
    private static String getInput() {
        System.out.print("Enter a word or phrase: ");
        return scanner.nextLine().replaceAll("\\s+", "").toLowerCase(); // Remove spaces and ignore case
    }

    // Function to check if the input is a palindrome
    private static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Function to display the result
    private static void displayResult(String originalInput, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + originalInput + "\" is a palindrome.");
        } else {
            System.out.println("\"" + originalInput + "\" is not a palindrome.");
        }
    }
}
