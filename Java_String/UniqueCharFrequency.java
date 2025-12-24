package Java_String;

import java.util.Scanner;

public class UniqueCharFrequency {

    public static char[] uniqueCharacters(String str) {
        int length = str.length();
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }

        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    public static String[][] frequencyOfUniqueChars(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(str);

        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = Character.toString(uniqueChars[i]);
            result[i][1] = Integer.toString(freq[uniqueChars[i]]);
        }

        return result;
    }

    public static void displayTable(String[][] table) {
        System.out.printf("%-10s%-10s%n", "Character", "Frequency");
        System.out.println("-------------------");
        for (String[] row : table) {
            System.out.printf("%-10s%-10s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] frequency = frequencyOfUniqueChars(input);

        System.out.println("\nFrequency of Unique Characters:");
        displayTable(frequency);

        sc.close();
    }
}
