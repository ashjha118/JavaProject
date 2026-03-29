package functional_interfaces;

interface Backupable { }


class Employee implements Backupable {
 String name;
 int id;

 Employee(String name, int id) {
     this.name = name;
     this.id = id;
 }

 public String toString() {
     return "Employee{name='" + name + "', id=" + id + "}";
 }
}


class Department {
 String deptName;

 Department(String deptName) {
     this.deptName = deptName;
 }


 public String toString() {
     return "Department{deptName='" + deptName + "'}";
 }
}

public class DataSerialization {
 public static void main(String[] args) {
     Object emp = new Employee("Rohit", 101);
     Object dept = new Department("IT");

     processBackup(emp);
     processBackup(dept);
 }

 static void processBackup(Object obj) {
     if (obj instanceof Backupable) {
         System.out.println(" Backing up: " + obj);
     } else {
         System.out.println("Cannot backup: " + obj + " (Not Backupable)");
     }
 }
}