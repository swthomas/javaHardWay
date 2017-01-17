import java.util.Scanner;

public class ShallowGrandma {
	public static void main( String[] args) {
		
		Scanner s=new Scanner(System.in);
		int age;
		double income, cute, happy;
		boolean allowed, allowed2;
		
		System.out.println();
		System.out.print("Enter your age: ");
		age = s.nextInt();
		
		System.out.print("Enter your yearly income: ");
		income = s.nextDouble();
		
		System.out.print("How happy do you make them, on a scale from 0.0 to 10.0: ");
		happy = s.nextDouble();
		
		System.out.print("How cute are you, on a scale from 0.0 to 10.0: ");
		cute = s.nextDouble();
		
		allowed = ((age > 25 && age < 40) && (income > 50000 || cute >= 8.5));
		
		allowed2 = ((happy >= 7 && happy <= 10) && (age > 25 && age < 40));
		
		System.out.println("Allowed to date my grandchild? " + allowed);
		
		System.out.println("Second Grandma's position: " + allowed2);
		System.out.println();
	}
}