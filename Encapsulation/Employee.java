package Encapsulation;

pimport java.util.ArrayList;
import java.util.List;

//Abstract class Employee
abstract class Employee {
 // Encapsulated fields
 private int employeeId;
 private String name;
 private double baseSalary;

 // Constructor
 public Employee(int employeeId, String name, double baseSalary) {
     this.employeeId = employeeId;
     this.name = name;
     this.baseSalary = baseSalary;
 }

 // Getter and Setter methods
 public int getEmployeeId() {
     return employeeId;
 }

 public void setEmployeeId(int employeeId) {
     this.employeeId = employeeId;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public double getBaseSalary() {
     return baseSalary;
 }

 public void setBaseSalary(double baseSalary) {
     this.baseSalary = baseSalary;
 }

 // Abstract method to calculate salary
 public abstract double calculateSalary();

 // Concrete method to display details
 public void displayDetails() {
     System.out.println("Employee ID: " + employeeId);
     System.out.println("Name: " + name);
     System.out.println("Salary: " + calculateSalary());
 }
}

//Interface Department
interface Department {
 void assignDepartment(String departmentName);
 String getDepartmentDetails();
}

//FullTimeEmployee subclass
class FullTimeEmployee extends Employee implements Department {
 private String department;
 private double bonus;

 public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
     super(employeeId, name, baseSalary);
     this.bonus = bonus;
 }

 public double getBonus() {
     return bonus;
 }

 public void setBonus(double bonus) {
     this.bonus = bonus;
 }

 // Implement abstract method
 @Override
 public double calculateSalary() {
     return getBaseSalary() + bonus;
 }

 // Implement Department interface
 @Override
 public void assignDepartment(String departmentName) {
     this.department = departmentName;
 }

 @Override
 public String getDepartmentDetails() {
     return department;
 }

 // Override displayDetails to include department
 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Department: " + department);
     System.out.println("-------------------------");
 }
}

//PartTimeEmployee subclass
class PartTimeEmployee extends Employee implements Department {
 private String department;
 private int workHours;
 private double hourlyRate;

 public PartTimeEmployee(int employeeId, String name, double hourlyRate, int workHours) {
     super(employeeId, name, 0); // baseSalary is 0 for part-time
     this.hourlyRate = hourlyRate;
     this.workHours = workHours;
 }

 public int getWorkHours() {
     return workHours;
 }

 public void setWorkHours(int workHours) {
     this.workHours = workHours;
 }

 public double getHourlyRate() {
     return hourlyRate;
 }

 public void setHourlyRate(double hourlyRate) {
     this.hourlyRate = hourlyRate;
 }

 // Implement abstract method
 @Override
 public double calculateSalary() {
     return workHours * hourlyRate;
 }

 // Implement Department interface
 @Override
 public void assignDepartment(String departmentName) {
     this.department = departmentName;
 }

 @Override
 public String getDepartmentDetails() {
     return department;
 }

 // Override displayDetails to include department
 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Department: " + department);
     System.out.println("-------------------------");
 }
}

//Main class to demonstrate polymorphism
public class EmployeeManagementSystem {
 public static void main(String[] args) {
     List<Employee> employees = new ArrayList<>();

     FullTimeEmployee fte1 = new FullTimeEmployee(101, "Alice", 50000, 5000);
     fte1.assignDepartment("HR");

     PartTimeEmployee pte1 = new PartTimeEmployee(201, "Bob", 200, 80);
     pte1.assignDepartment("IT");

     FullTimeEmployee fte2 = new FullTimeEmployee(102, "Charlie", 60000, 10000);
     fte2.assignDepartment("Finance");

     employees.add(fte1);
     employees.add(pte1);
     employees.add(fte2);

     // Polymorphism: process list using Employee reference
     for (Employee emp : employees) {
         emp.displayDetails();
     }
 }
}
