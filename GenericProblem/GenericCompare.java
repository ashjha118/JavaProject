package GenericProblem;

public class GenericCompare {

    // Generic method to compare two values
    public static <T> boolean isEqual(T a, T b) {
        if (a == null && b == null) return true;  // both null → equal
        if (a == null || b == null) return false; // one null → not equal
        return a.equals(b); // use .equals() for comparison
    }

    public static void main(String[] args) {
        // Integer comparison
        System.out.println(isEqual(10, 10));   // true
        System.out.println(isEqual(10, 20));   // false

        // String comparison
        System.out.println(isEqual("Hello", "Hello")); // true
        System.out.println(isEqual("Hi", "Bye"));      // false

        // Double comparison
        System.out.println(isEqual(12.5, 12.5)); // true
        System.out.println(isEqual(12.5, 15.0)); // false
    }
}
