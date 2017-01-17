public class MathOperations {
	public static void main( String[] args) {
		int a, b, c, d, e, f, g, acre;
		double x, y, z, feet;
		String one, two, unit, both;
		
		a = 10;
		b = 27;
		System.out.println("a is " + a + ", b is " + b);
		
		c = a + b;
		System.out.println("a+b is " + c);
		d = a - b;
		System.out.println("a-b is " + d);
		e = a+b*3;
		System.out.println("a+b*3 is " + e);
		f = b/2;
		System.out.println(" b/2 is " + f);
		g = b % 10;
		System.out.println("b%10 is " + g);
		
		x = 1.1;
		System.out.println("/nx is " + x);
		y = x*x;
		System.out.println("x*x is " + y);
		z = b/2;
		System.out.println("b/2 is " + z);
		System.out.println();
		
		one = "dog";
		two = "house";
		both = one + two;
		System.out.println(both);
		
		feet = 12;
		acre = 43506;
		unit = "square inches";
		System.out.println("There are " + feet * acre + " " + unit + " in an acre.");
		System.out.println("There are " + feet * acre /12 + " square feet in an acre.");
		System.out.println("There is " + 365%7 + " extra day in a year.\n");

	}
}