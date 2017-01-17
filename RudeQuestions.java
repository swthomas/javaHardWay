import java.util.Scanner;
	
public class RudeQuestions {
	public static void main( String[] args) {
		String name;
		int age;
		double weight, income, number;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Hello. What is your name? ");
		name = s.next();
		
		System.out.print("Hi, " + name + "! How old are you? ");
		age = s.nextInt();
		
		System.out.println("So you're " + age + ", eh? That's not very old.");
		System.out.print("How much do you weigh, " + name + "? ");
		weight = s.nextDouble();
		
		System.out.println( weight + "! Better keep that quiet!");
		System.out.print("Finally, what's your income, " + name + "? ");
		income = s.nextDouble();
		
		System.out.print("Hopefully that is " + income + " per hour");
		System.out.println(" and not per year!");
		System.out.print("Well, thanks for answering my rude questions, ");
		System.out.println(name + ".\n");
		
		System.out.print("What is your favorite number? ");
		number = s.nextDouble();
		System.out.println("Favorite number: " + number +"\n");
		
	}
}
	// 1. The program would not blow up because an int can be a double but not visa versa
	// 2. The program would not blow up as a String can be a String of any characters
	// 3a. You cannot blow up the program on the first question due to it expecting a String can be anything from a symbol to a letter to a number.  
	// 3b. Any letter, symbol or floating point number will blow up the program
	// 3c. Any letter or symbol will blow up the program for the weight and income questions