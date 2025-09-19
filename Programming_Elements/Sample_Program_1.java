package WeekFirst;
import java.util.Scanner;

public class Sample_Program_1 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		String name = "Sam";
		char result = 'P';
		int roll_number=1;
		double percent_marks = 99.99;
		System.out.print("Dispalying result :- "+ name + 
				"With Roll Number " + 
				roll_number + "has scored " + 
				percent_marks + "% marks and rsult is "+result);
		
	}

}
