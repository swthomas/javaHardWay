import static java.lang.System.*;
import java.util.Scanner;

public class CollegeAdmission {
	public static void main( String[] args) {
		Scanner s=new Scanner(System.in);
		int math;
		
		out.println();
		out.println("Welcome to the UT Austin College Admissions Interface!");
		out.print("Please enter your SAT math score (200-800): ");
		math = s.nextInt();
		
		out.print("Admittance status: ");
		
		if (math >= 790)
			out.print("Certain");
		else if (math >= 710)
			out.print("Safe");
		else if (math >= 580)
			out.print("Probable");
		else if (math >= 500)
			out.print("Uncertain");
		else if (math >= 390)
			out.print("Unlikely");
		else 
			out.print("Denied");
		
			
		out.println();
	}
}