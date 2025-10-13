package functional_interfaces;
interface Vehicle {
  
    void displaySpeed();

    default void displayBattery() {
        System.out.println(" Battery information not available for this vehicle.");
    }
}

class Car implements Vehicle {
    
    public void displaySpeed() {
        System.out.println(" Car speed: 80 km/h");
    }
    
}


class ElectricCar implements Vehicle {
  
    public void displaySpeed() {
        System.out.println(" Electric Car speed: 60 km/h");
    }

    public void displayBattery() {
        System.out.println(" Battery: 75% remaining");
    }
}

public class smartvehicle {
    public static void main(String[] args) {
        Vehicle regularCar = new Car();
        Vehicle tesla = new ElectricCar();

        System.out.println("=== Smart Vehicle Dashboard ===");

        regularCar.displaySpeed();
        regularCar.displayBattery(); 

        System.out.println();

        tesla.displaySpeed();
        tesla.displayBattery(); 
    }
}