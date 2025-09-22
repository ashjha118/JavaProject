package java_Constructors;

class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0 && cgpa <= 10) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA.");
        }
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    public void displayPostgraduateDetails() {
        System.out.println("Roll Number: " + rollNumber);  // public accessible
        System.out.println("Name: " + name);              // protected accessible
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA: " + getCgpa());        // private accessed via public method
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 8.5);
        s1.displayStudentDetails();
        System.out.println();

        PostgraduateStudent pg = new PostgraduateStudent(201, "Bob", 9.0, "Data Science");
        pg.displayPostgraduateDetails();
    }
}
