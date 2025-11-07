package design_principle;

public class AssociationAggregationExample {
public static void main(String[] args) {
   School school = new School("Sunrise Public School");

   Student s1 = new Student("Aarav");
   Student s2 = new Student("Diya");

   school.addStudent(s1);
   school.addStudent(s2);

   Course c1 = new Course("Mathematics");
   Course c2 = new Course("Science");
   Course c3 = new Course("English");

   s1.enrollInCourse(c1);
   s1.enrollInCourse(c2);

   s2.enrollInCourse(c2);
   s2.enrollInCourse(c3);

   school.showStudents();

   s1.showCourses();
   s2.showCourses();

   c1.showEnrolledStudents();
   c2.showEnrolledStudents();
   c3.showEnrolledStudents();
}
}

