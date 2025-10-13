package functional_interfaces;

interface SecurityUtils {
    
    static boolean isStrongPassword(String password) {
   
        if (password.length() < 8)
            return false;

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch))
                hasUpper = true;
            else if (Character.isLowerCase(ch))
                hasLower = true;
            else if (Character.isDigit(ch))
                hasDigit = true;
            else
                hasSpecial = true;
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}

public class passstrengthvalidator {
    public static void main(String[] args) {
        String pass1 = "Rohit@123";
        String pass2 = "weakpass";

        System.out.println("Password: " + pass1 + " → " +
                (SecurityUtils.isStrongPassword(pass1) ? "Strong" : "Weak"));

        System.out.println("Password: " + pass2 + " → " +
                (SecurityUtils.isStrongPassword(pass2) ? "Strong" : "Weak"));
    }
}