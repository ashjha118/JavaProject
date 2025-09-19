package WeekFirst;
import java.util.Scanner;

public class average_percent_mark_in_PCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Maths=94;
		int Physics=95;
		int Chemistry=96;
		double average_marks = ((Maths+Physics+Chemistry)/3)%100;
		System.out.print("Average marks is "+average_marks+"%");
		
		
	}

}
