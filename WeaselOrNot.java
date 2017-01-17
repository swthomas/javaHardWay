import java.util.Scanner;

public class WeaselOrNot{
	public static void main( String[] args) {
		Scanner s=new Scanner(System.in);
		String word;
		boolean yep, nope;
		
		System.out.println("Type the word \"weasel\", please.");
		word = s.next();
		
		yep = word.equals("weasel");
		nope = !word.equals("weasel");
		
		System.out.println("You typed what was requested: " + yep);
		System.out.println("You ignore polite instructions: " + nope);
		
	}
}