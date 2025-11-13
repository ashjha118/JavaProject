package GenericProblem;
//Generic Box class
class Box<T> {
 private T value;

 // set() method
 public void set(T value) {
     this.value = value;
 }

 // get() method
 public T get() {
     return value;
 }
}

//Test class
public class GenericBoxTest {
 public static void main(String[] args) {
     // Box for Integer
     Box<Integer> intBox = new Box<>();
     intBox.set(100);
     System.out.println("Integer Value: " + intBox.get());

     // Box for String
     Box<String> strBox = new Box<>();
     strBox.set("Hello Generics!");
     System.out.println("String Value: " + strBox.get());

     // Box for Double
     Box<Double> doubleBox = new Box<>();
     doubleBox.set(99.99);
     System.out.println("Double Value: " + doubleBox.get());
 }
}

