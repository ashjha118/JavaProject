package functional_interfaces;
interface UnitConverter {

    static double kmToMiles(double km) {
        return km * 0.621371;
    }


    static double milesToKm(double miles) {
        return miles / 0.621371;
    }

    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }


    static double lbsToKg(double lbs) {
        return lbs / 2.20462;
    }
}

public class unitconversiontool {
    public static void main(String[] args) {
        double km = 10;
        double kg = 5;

        System.out.println("=== Unit Conversion Tool ===");
        System.out.println(km + " km = " + UnitConverter.kmToMiles(km) + " miles");
        System.out.println(kg + " kg = " + UnitConverter.kgToLbs(kg) + " lbs");


        System.out.println("6.2 miles = " + UnitConverter.milesToKm(6.2) + " km");
        System.out.println("11 lbs = " + UnitConverter.lbsToKg(11) + " kg");
    }
}