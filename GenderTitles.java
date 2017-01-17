import java.util.Scanner;

public class GenderTitles {
	public static void main( String[] args) {
		Scanner s=new Scanner(System.in);
		String title = "Error";
		
		System.out.println();
		System.out.print("First name: " );
		String first = s.next();
		System.out.print("Last name: ");
		String last = s.next();
		System.out.print("Gender (M/F): ");
		String gender = s.next();
		System.out.print("Age: ");
		int age = s.nextInt();
		
		if (age < 20) {
			title = first;
		}
		else {
			if (gender.equals("F")) {
				System.out.print("Are you married, " + first + "? (Y/N/): ");
				String married = s.next();
				if (married.equals("Y")) {
					title = "Mrs.";
				}
				else {
					title = "Ms.";
				}
			}
			else {
				title = "Mr.";
			}
		}
		System.out.println("\n" + title + " " + last);
		System.out.println();
	}
}