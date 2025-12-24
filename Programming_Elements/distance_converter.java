package WeekFirst;

import java.util.Scanner;

public class distance_converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / 3;

        double distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance in yards is " + distanceInYards + 
                           " while the distance in miles is " + distanceInMiles);
    }
}
