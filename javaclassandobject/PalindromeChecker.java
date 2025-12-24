package javaclassandobject;

import java.util.Scanner;

class PalindromeChecker {
    String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public void displayResult() {
        if (isPalindrome()) System.out.println(text + " is a palindrome.");
        else System.out.println(text + " is not a palindrome.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker(input);
        checker.displayResult();

        sc.close();
    }
}
