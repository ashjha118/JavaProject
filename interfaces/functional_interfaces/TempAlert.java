package functional_interfaces;

import java.util.function.Predicate;
public class TempAlert {

	    public static void main(String[] args) {
	    
	        double threshold = 37.5;
	        
	        Predicate<Double> HighAlert = temp -> temp > threshold;

	     
	        double[] temps = {36.5, 37.0, 38.2, 39.5, 35.8};

	        System.out.println("=== Temperature Alert System ===");

	   
	        for (double t : temps) {
	            if (HighAlert.test(t)) {
	                System.out.println(" Alert! Temperature " + t + "°C crossed the threshold!");
	            } else {
	                System.out.println(" Temperature " + t + "°C is normal.");
	            }
	        }
	    }
	


}