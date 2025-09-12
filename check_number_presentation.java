package com.demo;
import java.util.Scanner;
import static java.lang.System.out;

public class check_number_presentation {
    public static void main(String[] abc) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10,20,30,40,50};
        System.out.print("Enter number to search: ");
        int num = sc.nextInt();

        boolean found = false;
        for (int x : arr) {
            if (x == num) { found = true; break; }
        }

        System.out.println(found ? "Present" : "Not Present");
        sc.close();
    }
}
