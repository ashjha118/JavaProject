package exception;

import java.util.Scanner;

class InvalidCredentialsException extends Exception {
 public InvalidCredentialsException(String message) {
     super(message);
 }
}

class LoginSystem {
 private final String validUser = "admin";
 private final String validPass = "12345";

 public void validate(String user, String pass) throws InvalidCredentialsException {
     if (!user.equals(validUser) || !pass.equals(validPass)) {
         throw new InvalidCredentialsException("❌ Invalid username or password!");
     } else {
         System.out.println("✅ Login successful! Welcome, " + user + " 👋");
     }
 }
}