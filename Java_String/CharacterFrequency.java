package Java_String;

import java.util.Scanner;

public class CharacterFrequency {

    public static String[][] findFrequency(String str) {
        int[] freq = new int[256];
        
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) uniqueCount++;
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = Integer.toString(freq[i]);
                index++;
            }
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

        String[][] frequency = findFrequency(input);

        System.out.println("\nCharacter Frequency:");
        displayTable(frequency);

        sc.close();
    }
}
