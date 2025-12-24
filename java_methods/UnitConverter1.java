package java_methods;

public class UnitConverter1 {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        double fahrenheit = 100;
        double celsius = 37;
        double pounds = 150;
        double kilograms = 68;
        double gallons = 5;
        double liters = 10;

        System.out.println("100°F in Celsius: " + convertFahrenheitToCelsius(fahrenheit));
        System.out.println("37°C in Fahrenheit: " + convertCelsiusToFahrenheit(celsius));
        System.out.println("150 pounds in kilograms: " + convertPoundsToKilograms(pounds));
        System.out.println("68 kilograms in pounds: " + convertKilogramsToPounds(kilograms));
        System.out.println("5 gallons in liters: " + convertGallonsToLiters(gallons));
        System.out.println("10 liters in gallons: " + convertLitersToGallons(liters));
    }
}
