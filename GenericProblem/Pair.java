package GenericProblem;

//Generic Pair class
class Pair<T, U> {
 private T first;
 private U second;

 // Constructor
 public Pair(T first, U second) {
     this.first = first;
     this.second = second;
 }

 // getFirst() method
 public T getFirst() {
     return first;
 }

 // getSecond() method
 public U getSecond() {
     return second;
 }
}

//Test class
public class GenericPairTest {
 public static void main(String[] args) {
     // Example 1: String + Integer
     Pair<String, Integer> student = new Pair<>("Amol", 20);
     System.out.println("Name: " + student.getFirst());
     System.out.println("Age: " + student.getSecond());

     // Example 2: Integer + Double
     Pair<Integer, Double> marks = new Pair<>(101, 88.5);
     System.out.println("\nRoll No: " + marks.getFirst());
     System.out.println("Marks: " + marks.getSecond());

     // Example 3: String + String
     Pair<String, String> country = new Pair<>("India", "New Delhi");
     System.out.println("\nCountry: " + country.getFirst());
     System.out.println("Capital: " + country.getSecond());
 }
}
