package WeekFirst;
import java.util.Scanner;

public class Sample_Program_2 {
	
	public static void main(String [] args) {
		
		double Chennai_to_Vellore_distance=156.6;
		double Chennai_to_Vellore_time_taken=4*60+4;
		double Vellore_to_Bangalore_distance=211.8;
		double Vellore_to_Bangalore_time_taken=4*60+25;
		double total_distance=Chennai_to_Vellore_distance+
				Vellore_to_Bangalore_distance;
		double total_time_taken=Chennai_to_Vellore_time_taken+
				Vellore_to_Bangalore_time_taken;
		System.out.print("Total Distance is "+ total_distance +"\n"
				+ "Total time taken to rich "
				+ "Chennai to Bangalore is "+ total_time_taken);
		
	}
	
	
}