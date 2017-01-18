import java.util.Scanner;

public class CoinFlip {
	public static void main( String[] args) {
		Scanner s=new Scanner(System.in);
		String coin, again;
		int streak = 0;
		boolean gotHeads;
		
		do { 
			gotHeads = Math.random() < 0.5;

			if (gotHeads)
				coin = "Heads";
			else
				coin = "Tails";
				
			System.out.println("You flipped a coin and it is... " + coin);
			
		if (gotHeads) {
			streak++;
			System.out.println("\tThat's " + streak + " in a row...");
			System.out.println("\tWould you like to flip again (y/n?)");
			again = s.next();
		}
		else {
			System.out.println("\tYou lost everything!");
			System.out.println("\tShould'vd quit while you were ahead...");
			streak = 0;
			again = "n";
		}
		
		}	
		while (again.equals("y"));
			System.out.println("Final Score: " + streak);
}
}