package java_methods;

public class UnitConverter {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        double km = 10;
        double miles = 6.2;
        double meters = 5;
        double feet = 16.4;

        System.out.println("10 km in miles: " + convertKmToMiles(km));
        System.out.println("6.2 miles in km: " + convertMilesToKm(miles));
        System.out.println("5 meters in feet: " + convertMetersToFeet(meters));
        System.out.println("16.4 feet in meters: " + convertFeetToMeters(feet));
    }
}
