package design_principle;

public class CompositionExample {
public static void main(String[] args) {
   Company comp = new Company("TechSoft Pvt. Ltd.");

   Department d1 = new Department("IT");
   Department d2 = new Department("HR");

   d1.addEmployee("Ravi", "E101");
   d1.addEmployee("Sneha", "E102");

   d2.addEmployee("Amit", "E201");
   
   comp.addDepartment(d1);
   comp.addDepartment(d2);

   comp.showCompanyStructure();

   comp.deleteCompany();
}
}
