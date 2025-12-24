package WeekFirst;
import java.util.Scanner;

public class find_age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d_o_b=2000;
		int prsent_age_of_Harry = sc.nextInt();
		int current_age = prsent_age_of_Harry-d_o_b;
		
		if(prsent_age_of_Harry>2000) {
			System.out.print("Current age of Harry is "+current_age);
		}
		else if(prsent_age_of_Harry<2000) {
			System.out.print("Not a valid date");
		}
		
		
	}

}
