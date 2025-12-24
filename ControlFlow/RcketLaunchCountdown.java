package ControlFlow;

import java.util.Scanner;

public class RcketLaunchCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();

        System.out.println("Rocket Launch Countdown:");

        while (counter >= 1) {
            System.out.println(counter);
            counter--; 
        }

        System.out.println("Liftoff! 🚀");

        sc.close();
    }
}
