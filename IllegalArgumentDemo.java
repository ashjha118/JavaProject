package com.demo;
import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void handleException(String text) {
        try {
            if (text.length() < 5) {
                throw new IllegalArgumentException("Text too short for substring");
            }
            System.out.println("Substring: " + text.substring(2, 5));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        handleException(input);

        sc.close();
    }
}
