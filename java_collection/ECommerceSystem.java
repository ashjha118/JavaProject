package java_collection;

import java.util.*;

class Order {
    int orderId;
    String customerName;

    Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return orderId == order.orderId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }

    @Override
    public String toString() {
        return "OrderID: " + orderId + ", Customer: " + customerName;
    }
}

public class ECommerceSystem {
    public static void main(String[] args) {
        List<Order> allOrders = new ArrayList<>();
        allOrders.add(new Order(101, "Amit"));
        allOrders.add(new Order(102, "Priya"));
        allOrders.add(new Order(103, "Ravi"));
        allOrders.add(new Order(101, "Amit")); // duplicate
        allOrders.add(new Order(104, "Sita"));

        System.out.println("All Orders:");
        allOrders.forEach(System.out::println);

        // Remove duplicate orders
        Set<Order> uniqueOrders = new LinkedHashSet<>(allOrders);

        // Process orders in sequence (FIFO)
        Queue<Order> processingQueue = new LinkedList<>(uniqueOrders);

        // Stack for failed orders
        Stack<Order> failedOrders = new Stack<>();

        System.out.println("\nProcessing Orders:");
        while (!processingQueue.isEmpty()) {
            Order order = processingQueue.poll();
            System.out.println("Processing " + order);

            // Simulate random failure
            if (order.orderId % 2 == 0) {
                System.out.println("❌ Order failed: " + order.orderId);
                failedOrders.push(order);
            } else {
                System.out.println("✅ Order completed: " + order.orderId);
            }
        }

        System.out.println("\nRe-processing Failed Orders:");
        while (!failedOrders.isEmpty()) {
            Order failed = failedOrders.pop();
            System.out.println("Retrying " + failed);
            System.out.println("✅ Order re-processed successfully: " + failed.orderId);
        }

        System.out.println("\nAll orders processed successfully!");
    }
}

