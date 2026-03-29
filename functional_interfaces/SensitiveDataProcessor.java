package functional_interfaces;
interface SensitiveData { 
   
}

class UserCredentials implements SensitiveData {
    String username;
    String password;

    UserCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

  
    public String toString() {
        return "UserCredentials{username='" + username + "', password='" + password + "'}";
    }
}

class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String toString() {
        return "Product{productName='" + productName + "', price=" + price + "}";
    }
}

public class SensitiveDataProcessor {
    public static void main(String[] args) {
        Object user = new UserCredentials("Rohit", "mySecret123");
        Object product = new Product("Laptop", 75000);

        processData(user);
        processData(product);
    }

    static void processData(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data: " + obj);
        } else {
            System.out.println("Not sensitive: " + obj);
        }
    }
}