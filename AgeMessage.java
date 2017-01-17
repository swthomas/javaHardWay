import java.util.Scanner;

public class AgeMessage {
	public static void main( String[] args){
		Scanner s=new Scanner(System.in);
		int age;
		
		System.out.print("How old are you? ");
		age = s.nextInt();
		
		System.out.println("You are: ");
		if (age < 13) {
			System.out.println("\tToo young to create a Facebook account!");
		}
		if (age > 13) {
			System.out.println("\tOld enough to create a Facebook account!");
			}
		if (age < 16) {
			System.out.println("\tToo young to get a driver's license!");
		}
		if (age > 16) {
			System.out.println("\tOld enough to get a driver's license!");
		}
		if (age < 18) {
			System.out.println("\tToo young to get a tattoo!");
		}
		if (age > 18) {
			System.out.println("\tOld enough to get a tattoo!");
		}
		if (age < 21) {
			System.out.println("\tToo young to drink alcohol!");
		}
		if (age > 21) {
			System.out.println("\tOld enough to drink alcohol!");
		}
		if (age < 35) {
			System.out.println("\tToo young to run for President of the U.S.!");
			System.out.println("\t\tHow Sad!");		
		}
		if (age > 35) {
			System.out.println("\tOld enough to run for President of the U.S.!");		
		}
		if (age > 65) {
			System.out.println("\tYou are old enough to retire!");
		}
		if (age < 65) {
			System.out.println("\tToo young to retire!");
		}
	}
}
		
			
		