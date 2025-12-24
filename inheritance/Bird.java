package inheritance;

//Superclass
class Bird {
 public void fly() {
     System.out.println("Bird is flying");
 }
}

//Subclass that follows LSP
class Sparrow extends Bird {
 @Override
 public void fly() {
     System.out.println("Sparrow is flying swiftly");
 }
}

class Crow extends Bird {
 @Override
 public void fly() {
     System.out.println("Crow is flying high");
 }
}

//Main class
public class Main {
 public static void makeBirdFly(Bird bird) {
     bird.fly(); // Works for any Bird
 }

 public static void main(String[] args) {
     Bird sparrow = new Sparrow();
     Bird crow = new Crow();

     makeBirdFly(sparrow); // Output: Sparrow is flying swiftly
     makeBirdFly(crow);    // Output: Crow is flying high
 }
}
