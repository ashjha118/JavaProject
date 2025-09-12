package com.demo;
import java.util.Scanner;
import static java.lang.System.out;

public class oneDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[4];  

      
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }

        
        System.out.println("Elements in the array:");
        for(int num : numbers){
            System.out.println(num);
        }
    }
}

