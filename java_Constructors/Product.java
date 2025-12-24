package java_Constructors;

class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200);
        Product p2 = new Product("Phone", 800);
        Product p3 = new Product("Tablet", 500);

        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
        System.out.println();
        p3.displayProductDetails();
        System.out.println();

        Product.displayTotalProducts();
    }
}
