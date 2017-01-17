import java.util.Scanner;

public class ComparingNumbers {
	public static void main( String[] args) {
		Scanner s=new Scanner(System.in);
		double first, second;
		
		System.out.print("Give me two numbers. First: ");
		first = s.nextDouble();
		System.out.print("Second: ");
		second = s.nextDouble();
		
		if (first < second) 
			System.out.println(first + " is Less Than " + second);
		if (first <= second)
			System.out.println(first + " is Less Than or Equal to " + second);
		if (first == second)
			System.out.println(first + " is Equal to " + second);
		if (first >= second)
			System.out.println(first + " is Less Than or Equal to " + second);
		if (first > second) 
			System.out.println(first + " is Less than to " + second);
		if (first != second) {
			System.out.println(first + " is Not Equal to " + second);
			System.out.println("Hey!");
		}
	}
}

