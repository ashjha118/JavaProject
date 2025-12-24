package Java_String;

import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt()
    public static String substringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i); // Append each character to result
        }
        return result;
    }

    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String text = sc.next();
        
        System.out.print("Enter the start index: ");
        int start = sc.nextInt();
        
        System.out.print("Enter the end index: ");
        int end = sc.nextInt();

        String subCharAt = substringUsingCharAt(text, start, end);

        String subBuiltin = text.substring(start, end);

        boolean areEqual = compareUsingCharAt(subCharAt, subBuiltin);

        System.out.println("\nSubstring using charAt(): " + subCharAt);
        System.out.println("Substring using built-in method: " + subBuiltin);
        System.out.println("Are both substrings equal? " + areEqual);

        sc.close();
    }
}
