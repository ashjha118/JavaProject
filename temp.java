package com.demo;
import java.util.Scanner;
public class temp {
	public static double digit(double a, double b) {
		double windchill = 35.74 + 0.6215 * a +(0.4275* a - 35.75)*b;
		return windchill;
	}
	public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Temperature: ");
	        double a = input.nextDouble();
	        System.out.print("Windchill: ");
	        double b = input.nextDouble();
	        
	        double w = digit(a,b);
	        System.out.printf("Windchill Temperature  " +w);
	  }
}