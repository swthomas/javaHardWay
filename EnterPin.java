import java.util.Scanner;

public class EnterPin {
	public static void main( String[] args) {
		Scanner s=new Scanner(System.in);
		int pin = 12345;
		int entry;
		String password2;
		String password = "purple";
		
		System.out.println("Welcome to the bank of Java.");
		System.out.print("Please Enter Your Password: ");
		password2 = s.next();
		
		while (! password2.equals(password)) {
			System.out.println("\nIncorrect Password. Try Again");
			System.out.print("Please Enter Your Password: ");
			password2 = s.next();
		}
		
		
		System.out.println("Welcome to the bank of Java.");
		System.out.print("Please Enter Your Pin: ");
		entry = s.nextInt();
		
		while (entry != pin) {
			System.out.println("\nIncorrect Pin. Try Again");
			System.out.print("Please Enter Your Pin: ");
			entry = s.nextInt();
		}
		
		System.out.println("\nPin Accepted. Your Account Balance Is $456.34\n");
	}
}
		
	