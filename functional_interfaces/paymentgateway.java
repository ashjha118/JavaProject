package functional_interfaces;

	interface PaymentProcessor{
	
	    void processPayment(double amount);

		    default void refund(double amount) {
	        System.out.println("Refund of ₹" + amount + " processed (default implementation).");
	    }
	}

		class PaytmGateway implements PaymentProcessor {
	
	    public void processPayment(double amount) {
	        System.out.println(" Payment of ₹" + amount + " done via Paytm.");
	    }
	
	}

	
	class RazorpayGateway implements PaymentProcessor {
	    
	    public void processPayment(double amount) {
	        System.out.println(" Payment of ₹" + amount + " done via Razorpay.");
	    }

	   
	    public void refund(double amount) {
	        System.out.println(" Refund of ₹" + amount + " initiated through Razorpay API.");
	    }
	}

	public class paymentgateway {
	    public static void main(String[] args) {
	        PaymentProcessor paytm = new PaytmGateway();
	        PaymentProcessor razorpay = new RazorpayGateway();

	        System.out.println("=== Payment Gateway Integration ===");

	        paytm.processPayment(1200);
	        paytm.refund(500); 
	        razorpay.processPayment(2500);
	        razorpay.refund(1000);
	    }
	}