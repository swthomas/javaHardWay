import java.util.Scanner;
	
public class SecretWord {
	public static void main( String[] args) {
		Scanner s=new Scanner(System.in);
		String secret = "please", guess, secret2 = "moguls";
		
		System.out.print("What's the secret word? ");
		guess = s.next();
		
		if (guess.equals(secret) || guess.equals(secret2)) {
			System.out.println("That's Correct!");
		}
		else {
			System.out.println("No, the secret word isn't\"" + guess + "\".");
		}
		if (guess == secret) {
			System.out.println("(this will never ever show, no matter what.)");
		}
			
	}
}
		