package WeekFirst;

public class volume_of_earth{
    public static void main(String[] args) {
        double radius = 6371.0; // radius of Earth in km
        double pi = Math.PI;

        double volumekm = (4.0 / 3.0) * pi * Math.pow(radius, 3);

        double radiusMiles = radius * 0.621371;
        double volumeMiles3 = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is "+volumekm+" and cubic miles is "+volumeMiles3);
        
    }
}
