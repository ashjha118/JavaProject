package functional_interfaces;

public class vehiclerental_interface {
	public interface RentableVehicle {
	    void rent();
	    void returnVehicle();
	}
	static class Car implements RentableVehicle{
		public void rent() {
			System.out.println("Car at Rent");
		}
		public void returnVehicle() {
			System.out.println("Car has returned");
		}
		
		
	}
	static class Bike implements RentableVehicle{
		public void rent() {
			System.out.println("Bike at Rent");
		}
		public void returnVehicle() {
			System.out.println("Bike has returned");
		}
		
		
	}
	
	static class Bus implements RentableVehicle{
		public void rent() {
			System.out.println("Bus at Rent");
		}
		public void returnVehicle() {
			System.out.println("Bus has returned");
		}
		
		
	}
	public static void main(String[] args) {
		 RentableVehicle car = new Car();
		 RentableVehicle bike = new Bike();
		 RentableVehicle bus = new Bus();
		 
		
	
	  car.rent();
	  bike.rent();
	  bus.rent();
	  
	  car.returnVehicle();
	  bike.returnVehicle();
	  bus.returnVehicle();
	
	

}}