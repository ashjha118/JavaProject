package design_principle;

import java.util.*;

class Employee {
 private String empName;
 private String empId;

 public Employee(String empName, String empId) {
     this.empName = empName;
     this.empId = empId;
 }

 public void showEmployee() {
     System.out.println("   Employee Name: " + empName + ", ID: " + empId);
 }
}

class Department {
 private String deptName;
 private List<Employee> employees;

 public Department(String deptName) {
     this.deptName = deptName;
     employees = new ArrayList<>();
 }

 public void addEmployee(String empName, String empId) {
     employees.add(new Employee(empName, empId));
 }

 public void showDepartment() {
     System.out.println(" Department: " + deptName);
     for (Employee e : employees) {
         e.showEmployee();
     }
 }
}

class Company {
 private String companyName;
 private List<Department> departments;

 public Company(String companyName) {
     this.companyName = companyName;
     departments = new ArrayList<>();
 }

 public void addDepartment(Department dept) {
     departments.add(dept);
 }

 public void showCompanyStructure() {
     System.out.println("Company: " + companyName);
     for (Department d : departments) {
         d.showDepartment();
     }
 }

 public void deleteCompany() {
     System.out.println("\nDeleting company " + companyName + "...");
     departments.clear();
     System.out.println("All departments and employees removed.");
 }
}
