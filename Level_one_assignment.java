// Q.1

//package com.demo;
//import static java.lang.System.out;
//
//public class Level_one_assignment {
//    public static void main(String[] args) {
//        String str1 = "HelloWorld", str2 = "HelloWorld";
//
//        boolean charAtResult = str1.length() == str2.length();
//        for(int i = 0; charAtResult && i < str1.length(); i++)
//            if(str1.charAt(i) != str2.charAt(i)) charAtResult = false;
//
//        boolean equalsResult = str1.equals(str2);
//
//        out.println("Comparison using charAt(): " + charAtResult);
//        out.println("Comparison using equals(): " + equalsResult);
//    }
//}

// Q.2

//package com.demo;
//import java.util.Scanner;
//
//public class Level_one_assignment {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String text = sc.nextLine();
//        System.out.print("Enter start index: ");
//        int start = sc.nextInt();
//        System.out.print("Enter end index: ");
//        int end = sc.nextInt();
//        
//        String subCharAt = "";
//        for(int i = start; i < end; i++) subCharAt += text.charAt(i);
//
//        
//        String subBuiltIn = text.substring(start, end);
//
//        
//        System.out.println("\ncharAt(): " + subCharAt);
//        System.out.println("substring(): " + subBuiltIn);
//        System.out.println("Equal? " + subCharAt.equals(subBuiltIn));
//
//        sc.close();
//    }
//}


// Q.3 


package com.demo;
import java.util.Scanner;
import java.util.Arrays;

public class Level_one_assignment {

    
    public static char[] getChars(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        
        char[] charsCustom = getChars(text);

        
        char[] charsBuiltIn = text.toCharArray();

        
        System.out.println("User-defined method: " + Arrays.toString(charsCustom));
        System.out.println("Built-in toCharArray(): " + Arrays.toString(charsBuiltIn));

        
        System.out.println("Are both arrays equal? " + Arrays.equals(charsCustom, charsBuiltIn));

        sc.close();
    }
}






