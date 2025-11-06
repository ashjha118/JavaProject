package exception;

import java.util.Scanner;


public class ATMSystem {
	 public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     ATM atm = new ATM();

	     System.out.print("Enter amount to withdraw: ₹");
	     int amount = sc.nextInt();

	     try {
	         atm.withdraw(amount);
	     } 
	     catch (InsufficientFundsException e) {
	         System.out.println(e.getMessage());
	     }

	     System.out.println(" Thank you for using our ATM!");
	     sc.close();
	 }
	}
