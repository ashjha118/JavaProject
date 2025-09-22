package java_Constructors;

class Course {
    String courseName;
    int duration; // in weeks
    double fee;
    static String instituteName;

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
    }

    public static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course.updateInstituteName("Tech Academy");

        Course c1 = new Course("Java Programming", 8, 400);
        Course c2 = new Course("Data Science", 12, 800);

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}
