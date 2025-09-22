package Java_String;

public class NullPointerDemo {

    public static void generateException() {
        String text = null;
        

        System.out.println("Length of text: " + text.length());
    }

    public static void handleException() {
        String text = null;
        try {
            
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException!");
            System.out.println("Exception message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Generating NullPointerException ===");
        try {
            generateException(); // This will throw the exception
        } catch (NullPointerException e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n=== Handling NullPointerException ===");
        handleException(); // Exception handled inside the method
    }
}
