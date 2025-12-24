package inheritance;

//Superclass
class Animal {
 public void eat() {
     System.out.println("This animal eats food.");
 }
}

//Subclass that "is-a" Animal
class Dog extends Animal {
 public void bark() {
     System.out.println("Dog barks.");
 }
}

class Cat extends Animal {
 public void meow() {
     System.out.println("Cat meows.");
 }
}

//Main class
public class Main {
 public static void main(String[] args) {
     Dog dog = new Dog();
     dog.eat();   // Inherited behavior
     dog.bark();  // Specific behavior

     Cat cat = new Cat();
     cat.eat();   // Inherited behavior
     cat.meow();  // Specific behavior
 }
}
