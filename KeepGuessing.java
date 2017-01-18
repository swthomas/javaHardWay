import java.util.Scanner;

public class KeepGuessing {
	public static void main( String[] args) {
		Scanner s=new Scanner(System.in);
		int secret, guess;
		
		secret = 1 + (int)(Math.random() * 10);
		
		System.out.println();
		System.out.println("I have chosen a number between 1 and 10.");
		System.out.println("Try and guess it. ");
		System.out.print("Your guess: ");
		guess = s.nextInt();
		
		while (secret != guess) {
			System.out.println("That is incorrect. Guess again.");
			System.out.print("Your guess: ");
			guess = s.nextInt();
		}
		System.out.print("The's right! You're a good guesser.");
	}
}