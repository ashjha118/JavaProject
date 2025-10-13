package functional_interfaces;
import java.util.function.Function;
public class Stringlengthchecker {


	
	    public static void main(String[] args) {

	        int lim = 20;


	        Function<String, Integer> lenCalculator = str -> str.length();

	     
	        String msg1 = "Hello Rohit bhaiya!";
	        String msg2 = "This message is definitely too long.";

	        checkMessage(msg1, lim, lenCalculator);
	        checkMessage(msg2, lim, lenCalculator);
	    }

	    static void checkMessage(String message, int limit, Function<String, Integer> func) {
	        int length = func.apply(message);

	        if (length > limit) {
	            System.out.println(" Message exceeds limit! (" + length + " characters)");
	        } else {
	            System.out.println(" Message within limit (" + length + " characters)");
	        
	    }
	}


}