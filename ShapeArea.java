import java.util.Scanner;

public class ShapeArea {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int choice;
		double area = 0;
		
		System.out.print("Shape Area Calculator Version 0.1");
		System.out.println("(c) 2017 LJTHW Sample Output, Inc.");
		
		do {
			System.out.println("\n=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_\n");
			System.out.println("1) Triangle");
			System.out.println("2) Circle");
			System.out.println("3) Rectangle");
			System.out.println("4) Square");
			System.out.println("5) Quit");
			System.out.print("> ");
			choice = s.nextInt();
			
			if (choice == 1) {
				System.out.print("\nBase: ");
				int b = s.nextInt();
				System.out.print("\nHeight: ");
				int h = s.nextInt();
				area = computeTriableArea(b,h);
				System.out.print("The area is " + area);
			}
			else if ( choice == 2 ) {
				System.out.print("\nRadius: ");
				int radius = s.nextInt();
				area = computeCircleArea(radius); 
				System.out.println("The area is " + area);
			}
			else if (choice == 3) {
				System.out.print("\nLength: ");
				int q = s.nextInt();
				System.out.print("\nWidth: ");
				int w = s.nextInt();
				System.out.print("The area is " + computeRectangleArea(q,w));
			}
			else if (choice == 4) {
				System.out.print("\nWidth/Height: ");
				int q = s.nextInt();
				System.out.print("The area is " + computeSquareArea(q));
			}
			else if (choice != 5) {
				System.out.print("ERROR");
			}	
		} while (choice != 5);
	}	
	
	public static double computeTriableArea(int base, int height) {
		double A;
		A = .5 * base * height;
		return A;
	}
	
	public static double computeCircleArea(int radius) {
		double A;
		A = Math.PI * radius * radius;
		return A;
	}	
					
	public static double computeRectangleArea(int length, int width) {
		return(length*width);
	}
	public static double computeSquareArea(int width) {
		return(width * width);
	}
}		
				
				
				
				
				
				
				