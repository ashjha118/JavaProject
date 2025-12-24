package javaclassandobject;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> cart = new ArrayList<>();

    public void addItem(CartItem item) {
        cart.add(item);
        System.out.println(item.itemName + " added to cart.");
    }

    public void removeItem(String itemName) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).itemName.equalsIgnoreCase(itemName)) {
                System.out.println(cart.get(i).itemName + " removed from cart.");
                cart.remove(i);
                return;
            }
        }
        System.out.println(itemName + " not found in cart.");
    }

    public void displayTotalCost() {
        double total = 0;
        for (CartItem item : cart) {
            total += item.getTotalPrice();
        }
        System.out.println("Total cost: $" + total);
    }

    public void displayCartItems() {
        System.out.println("Cart Items:");
        for (CartItem item : cart) {
            System.out.println(item.itemName + " - $" + item.price + " x " + item.quantity + " = $" + item.getTotalPrice());
        }
    }
}

public class ShoppingCartDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new CartItem("Apple", 2.5, 4));
        cart.addItem(new CartItem("Banana", 1.2, 6));
        cart.displayCartItems();
        cart.displayTotalCost();

        System.out.print("\nEnter item to remove: ");
        String removeItem = sc.nextLine();
        cart.removeItem(removeItem);

        cart.displayCartItems();
        cart.displayTotalCost();

        sc.close();
    }
}
