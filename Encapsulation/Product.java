package Encapsulation;

import java.util.ArrayList;
import java.util.List;

// Abstract class Product
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters (encapsulation)
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method to calculate discount
    public abstract double calculateDiscount();

    // Concrete method to display product details
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

// Interface for taxable products
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Electronics class (taxable)
class Electronics extends Product implements Taxable {
    private double discountPercentage;
    private double taxPercentage;

    public Electronics(int productId, String name, double price, double discountPercentage, double taxPercentage) {
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
        this.taxPercentage = taxPercentage;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * (discountPercentage / 100);
    }

    @Override
    public double calculateTax() {
        return getPrice() * (taxPercentage / 100);
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: " + taxPercentage + "%";
    }
}

// Clothing class (taxable)
class Clothing extends Product implements Taxable {
    private double discountPercentage;
    private double taxPercentage;

    public Clothing(int productId, String name, double price, double discountPercentage, double taxPercentage) {
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
        this.taxPercentage = taxPercentage;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * (discountPercentage / 100);
    }

    @Override
    public double calculateTax() {
        return getPrice() * (taxPercentage / 100);
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: " + taxPercentage + "%";
    }
}

// Groceries class (not taxable)
class Groceries extends Product {
    private double discountPercentage;

    public Groceries(int productId, String name, double price, double discountPercentage) {
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * (discountPercentage / 100);
    }
}

// Main class
public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Electronics e1 = new Electronics(101, "Laptop", 50000, 10, 18);
        Clothing c1 = new Clothing(201, "Jeans", 2000, 20, 12);
        Groceries g1 = new Groceries(301, "Rice", 1000, 5);

        products.add(e1);
        products.add(c1);
        products.add(g1);

        calculateFinalPrices(products);
    }

    // Polymorphism: process list of Product to calculate final price
    public static void calculateFinalPrices(List<Product> products) {
        for (Product p : products) {
            double discount = p.calculateDiscount();
            double tax = 0;

            if (p instanceof Taxable taxable) {
                tax = taxable.calculateTax();
                System.out.println(taxable.getTaxDetails());
            }

            double finalPrice = p.getPrice() + tax - discount;
            System.out.println("Product: " + p.getName());
            System.out.println("Original Price: " + p.getPrice());
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("--------------------------");
        }
    }
}
