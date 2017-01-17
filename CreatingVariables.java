public class CreatingVariables {
	public static void main( String[] args) {
		int x, y, age, chapter;
		double seconds, e, checking, pages;
		String firstName, lastName, title, firstOne, secondOne;
		
		x = 10;
		y = 400;
		age = 39;
		chapter = 5;
		
		seconds = 4.61;
		e = 2.71828182845904523536;
		checking = 1.89;
		pages = 35;
		
		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		firstOne = "chapter";
		secondOne = "page";
		
		System.out.println("\nThe variable contains " + x);
		System.out.println("The value " + y + " is stored in the variable y.");
		System.out.println("The experiment took " + seconds + " seconds.");
		System.out.println("A favorite irratoinal # is Euler's number: " + e);
		System.out.println("Hopfully you have more the $" + checking + "!");
		System.out.println("My name's " + title + " " + firstName + " " + lastName);
		System.out.println("This is the " + chapter + "th " + firstOne + ". We are on the " + pages + "th " + secondOne + ".\n"); 
		
	}
}