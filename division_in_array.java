package com.demo;
import java.util.Scanner;
import static java.lang.System.out;

public class division_in_array {
    public static void main(String[] abc) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {5, 6, 9, 12, 15, 17, 20};

        for (int num : numbers) {
            if (num % 2 == 0 && num % 3 == 0) {
                System.out.println(num + " it is divisible by both 2 and 3");
            } else if (num % 2 == 0) {
                System.out.println(num + " it is divisible by 2");
            } else if (num % 3 == 0) {
                System.out.println(num + " it is divisible by 3");
            } else {
                System.out.println(num + " it is not divisible by 2 or 3");
            }
        }
    }
}
