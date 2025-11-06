package exception;

import java.util.Random;

//Custom Exception: Out of Stock
class OutOfStockException extends Exception {
 public OutOfStockException(String message) {
     super(message);
 }
}

//Custom Exception: Payment Failed
class PaymentFailedException extends Exception {
 public PaymentFailedException(String message) {
     super(message);
 }
}

//Main Order System Class
class OnlineOrder {
 public void placeOrder() throws OutOfStockException, PaymentFailedException {
     Random rand = new Random();
     int event = rand.nextInt(3); // 0, 1, or 2

     if (event == 0) {
         throw new OutOfStockException("❌ Product is out of stock! Please try again later.");
     } else if (event == 1) {
         throw new PaymentFailedException("💳 Payment failed! Please check your card or balance.");
     } else {
         System.out.println("✅ Order placed successfully! Your item will be delivered soon. 📦");
     }
 }
}