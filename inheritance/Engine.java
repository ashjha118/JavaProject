package inheritance;

//Engine class
class Engine {
 public void start() {
     System.out.println("Engine started");
 }
}

//GPS class
class GPS {
 public void navigate(String destination) {
     System.out.println("Navigating to " + destination);
 }
}

//Car class uses Engine and GPS via composition
class Car {
 private Engine engine;
 private GPS gps;

 public Car() {
     this.engine = new Engine(); // Car "has-a" Engine
     this.gps = new GPS();       // Car "has-a" GPS
 }

 public void startCar() {
     engine.start();
     System.out.println("Car is ready to go!");
 }

 public void goTo(String destination) {
     gps.navigate(destination);
 }
}

//Main class
public class Main {
 public static void main(String[] args) {
     Car myCar = new Car();
     myCar.startCar();
     myCar.goTo("Delhi");
 }
}
