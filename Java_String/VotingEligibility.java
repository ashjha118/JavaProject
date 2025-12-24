package Java_String;

import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(100); 
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = Integer.toString(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote (Invalid Age)";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    public static void displayTable(String[][] table) {
        System.out.printf("%-10s%-20s%n", "Age", "Voting Eligibility");
        System.out.println("---------------------------------");
        for (String[] row : table) {
            System.out.printf("%-10s%-20s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] ages = new int[n];

        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        String[][] eligibility = checkVotingEligibility(ages);

        System.out.println("\nVoting Eligibility of Students:");
        displayTable(eligibility);

        sc.close();
    }
}
