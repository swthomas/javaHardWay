import java.util.Scanner;
	
public class BMICalculator {
	public static void main( String[] args) {
		Scanner s = new Scanner(System.in);
		double m, kg, bmi, f, i;
		
		System.out.print("Your height in feet: ");
		f = s.nextDouble();
		
		System.out.print("Your height in inches: ");
		i = s.nextDouble();
		
		m = ((f*12) + i) * .0254; 
		
		System.out.print("Your weight in lbs: ");
		kg = s.nextDouble();
		
		kg = 0.45359237 * kg;
		
		bmi = kg / (m*m);
		
		System.out.println("Your BMI is " + bmi);
		
	}
}