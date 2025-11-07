package design_principle;

import java.util.*;

class Customer {
 private String name;
 private double balance;

 public Customer(String name, double balance) {
     this.name = name;
     this.balance = balance;
 }

 public void viewBalance() {
     System.out.println(name + "'s Balance: ₹" + balance);
 }

 public String getName() {
     return name;
 }
}

class Bank {
 private String bankName;
 private List<Customer> customers;
 
 public Bank(String bankName) {
     this.bankName = bankName;
     customers = new ArrayList<>();
 }

 public void openAccount(Customer c) {
     customers.add(c);
     System.out.println("Account opened for " + c.getName() + " in " + bankName);
 }

 public void showAllCustomers() {
     System.out.println("\nCustomers of " + bankName + ":");
     for (Customer c : customers) {
         System.out.println("- " + c.getName());
     }
 }
}

