package WeekFirst;

public class pen_per_student {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;

        int pensEach = totalPens / students;
        int remaining = totalPens % students;

        System.out.println(" The Pen Per Student is "+pensEach+ " and the remaining pen not distributed is "+remaining);
    }
}
