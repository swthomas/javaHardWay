import java.util.Scanner;

public class SafeSquareRoot {
	public static void main( String[] args) {
		Scanner s=new Scanner(System.in);
		double x, y;
		String i = "yes";
		String j;
		
		System.out.println();
		System.out.println("Are you ready to find the square root of a number? (yes/no)");
		j = s.next();
		
		while ( ! i.equals(j)) {
			System.out.println("Are you ready yet? (yes/no)");
			j = s.next();
		}
		
		System.out.println("Give me a number, and I'll find it's square root.");
		System.out.print("No negatives, please: ");
		x = s.nextDouble();
		
		while (x < 0 ) {
			System.out.println("I won't take he square root of a negative.");
			System.out.println("New Number: ");
			x = s.nextDouble();
		}

		y = Math.sqrt(x);

		System.out.println("The square root of " + x + " is " + y);
		System.out.print("\n");
	}
}