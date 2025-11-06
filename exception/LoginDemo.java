package exception;

import java.util.Scanner;

public class LoginDemo {
	 public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     LoginSystem login = new LoginSystem();
	     boolean success = false;

	     while (!success) {
	         System.out.print("👤 Enter username: ");
	         String user = sc.nextLine();

	         System.out.print("🔑 Enter password: ");
	         String pass = sc.nextLine();

	         try {
	             login.validate(user, pass);
	             success = true;
	         } 
	         catch (InvalidCredentialsException e) {
	             System.out.println(e.getMessage());
	             System.out.println("🔁 Please try again.\n");
	         }
	     }

	     sc.close();
	 }
	}
