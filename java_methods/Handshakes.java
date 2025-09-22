package java_methods;

import java.util.Scanner;

public class Handshakes {

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        int maxHandshakes = calculateHandshakes(numberOfStudents);
        System.out.println("Maximum number of handshakes: " + maxHandshakes);

        sc.close();
    }
}
