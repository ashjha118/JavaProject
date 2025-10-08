package inheritance;

//Superclass
class Animal {
 public void makeSound() {
     System.out.println("Some generic animal sound");
 }
}

//Subclass overriding makeSound()
class Dog extends Animal {
 @Override
 public void makeSound() {  // Explicitly overriding
     System.out.println("Dog barks");
 }
}

class Cat extends Animal {
 @Override
 public void makeSound() {
     System.out.println("Cat meows");
 }
}

//Main class
public class Main {
 public static void main(String[] args) {
     Animal dog = new Dog();
     Animal cat = new Cat();

     dog.makeSound(); // Output: Dog barks
     cat.makeSound(); // Output: Cat meows
 }
}
