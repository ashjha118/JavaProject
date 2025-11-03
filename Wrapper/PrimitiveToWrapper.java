package Wrapper;
import java.util.Scanner;

public class PrimitiveToWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int num = sc.nextInt(); 
        
        Integer objNum = Integer.valueOf(num);
        
        System.out.println("\n--- Displaying Values ---");
        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper (Integer object) value: " + objNum);

        sc.close();
    }
}
