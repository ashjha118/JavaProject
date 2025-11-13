package GenericProblem;

//Base class
class Fruit {
 String name;

 Fruit(String name) {
     this.name = name;
 }

 public String toString() {
     return name;
 }
}

//Subclass Apple
class Apple extends Fruit {
 Apple() {
     super("Apple");
 }
}

//Subclass Mango
class Mango extends Fruit {
 Mango() {
     super("Mango");
 }
}

//Generic class restricted to Fruit and its subclasses
class FruitBox<T extends Fruit> {
 private java.util.List<T> fruits = new java.util.ArrayList<>();

 // Add fruit to the box
 public void add(T fruit) {
     fruits.add(fruit);
 }

 // Display all fruits in the box
 public void display() {
     System.out.println("FruitBox contains:");
     for (T f : fruits) {
         System.out.println("- " + f);
     }
 }
}

//Test class
public class FruitStorageTest {
 public static void main(String[] args) {
     // Create a FruitBox for fruits
     FruitBox<Fruit> box1 = new FruitBox<>();
     box1.add(new Apple());
     box1.add(new Mango());
     box1.display();

     // You can also make a box just for Apples
     FruitBox<Apple> appleBox = new FruitBox<>();
     appleBox.add(new Apple());
     appleBox.display();

     // ❌ Uncommenting below will cause compile-time error:
     // FruitBox<Car> carBox = new FruitBox<>();  // Error: Car is not a subclass of Fruit
 }
}

//Just to show it won't compile if added:
//class Car { }
