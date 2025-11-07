package design_principle;

public class AssociationExample1 {
	 public static void main(String[] args) {

	     Bank bank1 = new Bank("State Bank of India");
	     Bank bank2 = new Bank("HDFC Bank");

	     Customer c1 = new Customer("Ananya", 5000);
	     Customer c2 = new Customer("Rohan", 12000);

	     bank1.openAccount(c1);
	     bank1.openAccount(c2);

	     bank2.openAccount(c2);
	     
	     bank1.showAllCustomers();
	     bank2.showAllCustomers();

	     c1.viewBalance();
	     c2.viewBalance();
	 }
	}
