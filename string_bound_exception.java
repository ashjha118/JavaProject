package com.demo;
import java.util.Scanner;

public class string_bound_exception {
    public static void generateException(String text) {
        System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
    }
    public static void handleException(String text) {
        try {
            System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: " + e);
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