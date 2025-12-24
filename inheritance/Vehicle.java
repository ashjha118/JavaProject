package inheritance;

class Vehicle {
    public void start() { System.out.println("Vehicle started"); }
}

class Car extends Vehicle {
    public void drive() { System.out.println("Car is driving"); }
}

class SportsCar extends Car {
    public void turboBoost() { System.out.println("Turbo boost activated"); }
}

class RacingCar extends SportsCar {
    public void drift() { System.out.println("Racing car is drifting"); }
}

public class Main {
    public static void main(String[] args) {
        RacingCar rc = new RacingCar();
        rc.start();
        rc.drive();
        rc.turboBoost();
        rc.drift();
    }
}
