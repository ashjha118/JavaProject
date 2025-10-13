package functional_interfaces;

public class digitalpay {
	interface DigitalPay{
		void pay();
		
	}
	static class UPI implements DigitalPay{
		public void pay(){
		System.out.println("UPI Pay");
		
	}}
	static class CreditCard implements DigitalPay{
		public void pay() {
			System.out.println("Credit Card Pay");
		}
	}
	static class Wallet implements DigitalPay{
		public void pay() {
			System.out.println("Wallet Pay");
		}
	}
	public static void main(String[] abcd) {
		DigitalPay upi = new UPI();
		DigitalPay creditcard = new CreditCard();
		DigitalPay wallet = new Wallet();
		
		upi.pay();
		creditcard.pay();
		wallet.pay();
	
	
	}
	
	
	

}