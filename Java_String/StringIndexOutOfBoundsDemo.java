package Java_String;

import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void generateException(String text) {
       
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }

    
    public static void handleException(String text) {
        try {
          
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException!");
            System.out.println("Exception message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("\n=== Generating StringIndexOutOfBoundsException ===");
        try {
            generateException(input);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n=== Handling StringIndexOutOfBoundsException ===");
        handleException(input);

        sc.close();
    }
}
