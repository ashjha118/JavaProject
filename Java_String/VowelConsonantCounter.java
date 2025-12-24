package Java_String;

import java.util.Scanner;

public class VowelConsonantCounter {

    public static String checkChar(char ch) {
       
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static int[] countVowelsConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            String result = checkChar(str.charAt(i));
            if (result.equals("Vowel")) vowels++;
            else if (result.equals("Consonant")) consonants++;
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] counts = countVowelsConsonants(input);

        System.out.println("\nNumber of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);

        sc.close();
    }
}
