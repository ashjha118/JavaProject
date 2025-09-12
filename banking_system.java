package com.demo;
import java.util.Scanner;
import static java.lang.System.out;

public class banking_system {
    public static void main(String[] abc) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000; // Example starting balance

        System.out.println("Banking System Menu");
        System.out.println("1. Check Balance");
        System.out.println("2. Transfer Funds");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your current balance is: ₹" + balance);
                break;

            case 2:
                System.out.println("\n--- Transfer Funds ---");
                System.out.println("1. Savings Account");
                System.out.println("2. Current Account");
                System.out.print("Choose account type: ");
                int subChoice = sc.nextInt();

                switch (subChoice) {
                    case 1:
                        System.out.println("Funds transferred to Savings Account ✅");
                        break;
                    case 2:
                        System.out.println("Funds transferred to Current Account ✅");
                        break;
                    default:
                        System.out.println("Invalid account type ❌");
                }
                break;

            case 3:
                System.out.println("Thank you for using our Banking System. 👋");
                break;

            default:
                System.out.println("Invalid choice ❌");
        }

        sc.close();
    }
}

