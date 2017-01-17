import java.util.Scanner;

public class BooleanExpressions {
	public static void main( String[] args) {
		Scanner s = new Scanner(System.in);
		boolean a, b, c, d, e, f;
		double x, y;
		
		System.out.print("Give me two numbers. First: ");
		x = s.nextDouble();
		System.out.print("Second: ");
		y = s.nextDouble();
		
		a = (x < y);
		b = (x <= y);
		c = (x == y);
		d = (x != y);
		e = (x > y);
		f = (x >= y);
		
		System.out.println(x + " is Less Than " + y + ": " + a);
		System.out.println(x + " is Less Than or Equal to " + y + ": " + b);
		System.out.println(x + " is Equal to " + y + ": " + c);
		System.out.println(x + " is Not Equal to " + y + ": " + d);
		System.out.println(x + " is Greater Than " + y + ": " + e);
		System.out.println(x + " is Greater Than or Equal to " + y + ": " + f);
		
		System.out.println(!(x < y) + " " + (x >= y));
		System.out.println(!(x <= y) + " " + (x>y));
		System.out.println(!(x==y) + " " + (x!=y));
		System.out.println(!(x!=y) + " " + (x==y));
		System.out.println(!(x>y) + " " + (x<=y));
		System.out.println(!(x>=y) + " " + (x<y));
	
	}
}

// less than -- <
// greater than -- >
// less than or equal <=
// greater than or qual >=
// equal to -- ==
// not qual to == !=