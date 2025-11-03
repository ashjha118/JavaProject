package College;

import College.Student;
import College.Faculty;

public class MainClass {
    public static void main(String[] args) {
        Student s1 = new Student("Amit Sharma", 101);
        Faculty f1 = new Faculty("Dr. Meena", "Computer Science");

        System.out.println("--- Student Details ---");
        s1.displayStudentDetails();

        System.out.println("\n--- Faculty Details ---");
        f1.displayFacultyDetails();
    }
}
