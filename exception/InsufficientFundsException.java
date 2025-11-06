package exception;

class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

class ATM {
 private int balance = 10000;

 public void withdraw(int amount) throws InsufficientFundsException {
     if (amount > balance) {
         throw new InsufficientFundsException("❌ Insufficient funds! Your balance is ₹" + balance);
     } else {
         balance -= amount;
         System.out.println("✅ Withdrawal successful! Amount withdrawn: ₹" + amount);
         System.out.println("💰 Remaining balance: ₹" + balance);
     }
 }
}

