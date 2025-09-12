package com.demo;
import java.util.Scanner;


public class LeapYearCheck {

   
    public static boolean isLeapYear(int year) {
       
        if (year < 1582) {
            return false; 
        }

       
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        
        if (year < 1582) {
            System.out.println("Year is before Gregorian calendar, not valid for Leap Year check.");
        } else if (isLeapYear(year)) {
            System.out.println("Year " + year + " is a Leap Year.");
        } else {
            System.out.println("Year " + year + " is NOT a Leap Year.");
        }

        sc.close();
    }
}
v