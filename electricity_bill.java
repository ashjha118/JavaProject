package com.demo;
import java.util.Scanner;

public class electricity_bill {
    public static void main(String[] abc) {
        Scanner sc = new Scanner(System.in);
        
        int a= sc.nextInt();
        
        if(a<=100) {
        	System.out.println(10*a);
        }
        else if(a>=100 && a<=200) {
        	int b= a-100;
        	int bill =100*10 + b*15;
        	System.out.print("Total Bill: " +bill);
        }
        else {
        	int d=a-200;
        	int bi=100*10 +100*15 +d*20;
        	System.out.print("Total Bill: " +bi);
        	
        }
        
        
        
    }
}