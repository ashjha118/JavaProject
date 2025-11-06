package exception;

public class OnlineOrderSystem {
	 public static void main(String[] args) {
	     OnlineOrder order = new OnlineOrder();

	     try {
	         order.placeOrder(); // may throw either exception
	     } 
	     catch (OutOfStockException e) {
	         System.out.println(e.getMessage());
	     } 
	     catch (PaymentFailedException e) {
	         System.out.println(e.getMessage());
	     } 
	     finally {
	         System.out.println("🛒 Thank you for shopping with us!");
	     }
	 }
	}
