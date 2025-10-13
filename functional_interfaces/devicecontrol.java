package functional_interfaces;

public class devicecontrol {

	    interface SmartDevice {
	        void turnOn();
	        void turnOff();
	    }

	    static class Light implements SmartDevice {
	        public void turnOn() {
	            System.out.println("Light is turned ON.");
	        }

	        public void turnOff() {
	            System.out.println("Light is turned OFF.");
	        }
	    }

	    static class AirConditioner implements SmartDevice {
	        public void turnOn() {
	            System.out.println("Air Conditioner is turned ON.");
	        }

	        public void turnOff() {
	            System.out.println("Air Conditioner is turned OFF.");
	        }
	    }
 
	    static class Television implements SmartDevice {
	        public void turnOn() {
	            System.out.println("TV is turned ON.");
	        }

	        public void turnOff() {
	            System.out.println("TV is turned OFF.");
	        }
	    }

	
	    public static void main(String[] args) {
	        SmartDevice light = new Light();
	        SmartDevice ac = new AirConditioner();
	        SmartDevice tv = new Television();

	       
	        light.turnOn();
	        ac.turnOn();
	        tv.turnOn();

	        light.turnOff();
	        ac.turnOff();
	        tv.turnOff();
	    
	}


}