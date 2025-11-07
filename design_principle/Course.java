package design_principle;

import java.util.*;

//Course class
class Course {
 private String courseName;
 private List<Student> students; // Association: Course ↔ Student

 public Course(String courseName) {
     this.courseName = courseName;
     students = new ArrayList<>();
 }

 // Add student to course
 public void addStudent(Student s) {
     students.add(s);
 }

 public String getCourseName() {
     return courseName;
 }

 // Show all students enrolled in this course
 public void showEnrolledStudents() {
     System.out.println("\nCourse: " + courseName + " → Enrolled Students:");
     for (Student s : students) {
         System.out.println(" - " + s.getName());
     }
 }
}

//Student class
class Student {
 private String name;
 private List<Course> courses; // Association: Student ↔ Course

 public Student(String name) {
     this.name = name;
     courses = new ArrayList<>();
 }

 public String getName() {
     return name;
 }

 // Enroll student in a course (two-way association)
 public void enrollInCourse(Course c) {
     courses.add(c);
     c.addStudent(this); // link both sides
 }

 // View all courses of a student
 public void showCourses() {
     System.out.println("\nStudent: " + name + " → Enrolled Courses:");
     for (Course c : courses) {
         System.out.println(" - " + c.getCourseName());
     }
 }
}

//School class (Aggregation: School has Students)
class School {
 private String schoolName;
 private List<Student> students;

 public School(String schoolName) {
     this.schoolName = schoolName;
     students = new ArrayList<>();
 }

 public void addStudent(Student s) {
     students.add(s);
 }

 public void showStudents() {
     System.out.println("\nSchool: " + schoolName + " → Students List:");
     for (Student s : students) {
         System.out.println(" - " + s.getName());
     }
 }
}
