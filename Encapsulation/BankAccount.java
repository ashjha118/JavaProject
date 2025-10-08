package Encapsulation;

import java.util.ArrayList;
import java.util.List;

// Abstract class BankAccount
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Encapsulation: getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Abstract method
    public abstract double calculateInterest();

    // Display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

// Interface for loanable accounts
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate; // e.g., 4% annual

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public void applyForLoan(double amount) {
        if(calculateLoanEligibility()) {
            System.out.println("Loan approved for SavingsAccount: " + amount);
        } else {
            System.out.println("Loan denied for SavingsAccount!");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000; // Eligible if balance >= 5000
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest: " + calculateInterest());
        System.out.println("---------------------------");
    }
}

// CurrentAccount subclass
class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate; // usually lower or 0%
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double interestRate, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public void applyForLoan(double amount) {
        if(calculateLoanEligibility()) {
            System.out.println("Loan approved for CurrentAccount: " + amount);
        } else {
            System.out.println("Loan denied for CurrentAccount!");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000; // Eligible if balance >= 10000
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Overdraft Limit: " + overdraftLimit);
        System.out.println("Interest: " + calculateInterest());
        System.out.println("---------------------------");
    }
}

// Main class to demonstrate polymorphism
public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        SavingsAccount sa1 = new SavingsAccount("S101", "Alice", 15000, 4);
        CurrentAccount ca1 = new CurrentAccount("C201", "Bob", 50000, 2, 10000);

        accounts.add(sa1);
        accounts.add(ca1);

        // Polymorphism: process different account types
        for(BankAccount account : accounts) {
            account.displayDetails();
            account.deposit(2000);
            account.withdraw(1000);
            System.out.println("Updated Balance: " + account.getBalance());

            // Apply for loan if account implements Loanable
            if(account instanceof Loanable loanableAccount) {
                loanableAccount.applyForLoan(10000);
            }

            System.out.println("==============================");
        }
    }
}
