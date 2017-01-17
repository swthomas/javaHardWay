import java.util.Scanner;

public class DictionaryOrder {
	public static void main( String[] args) {
		Scanner s=new Scanner(System.in);
		String name;
		
		System.out.print("Make up the name of a programming language: ");
		name = s.nextLine();
		
		if (name.compareToIgnoreCase("c++") < 0)
			System.out.println(name + " comes Before c++");
		if (name.compareToIgnoreCase("c++") == 0) 
			System.out.println("c++ isn't a made-up language!");
		if (name.compareToIgnoreCase("c++") > 0)
			System.out.println(name + " comes After c++");
		
		if (name.compareToIgnoreCase("go") < 0)
			System.out.println(name + " comes Before go");
		if (name.compareToIgnoreCase("go") == 0)
			System.out.println("go isn't a made-up language!");
		if (name.compareToIgnoreCase("go") > 0)
			System.out.println(name + " comes After go");
			
		if (name.compareToIgnoreCase("java") < 0)
			System.out.println(name + " comes Before java");
		if (name.compareToIgnoreCase("java") == 0)
			System.out.println("java isn't a made-up language!");
		if (name.compareToIgnoreCase("java") > 0)
			System.out.println(name + " comes After java");
			
		if (name.compareToIgnoreCase("lisp") < 0)
			System.out.println(name + " comes Before lisp");
		if (name.compareToIgnoreCase("lisp") == 0)
			System.out.println("lisp isn't a made-up language!");
		if (name.compareToIgnoreCase("lisp") > 0)
			System.out.println(name + " comes After lisp");
			
		if (name.compareToIgnoreCase("python") < 0)
			System.out.println(name + " comes Before python");
		if (name.compareToIgnoreCase("python") == 0)
			System.out.println("python isn't a made-up language!");
		if (name.compareToIgnoreCase("python") > 0)
			System.out.println(name + " comes After python");
		
		if (name.compareToIgnoreCase("ruby") < 0)
			System.out.println(name + " comes Before ruby");
		if (name.compareToIgnoreCase("ruby") == 0)
			System.out.println("ruby isn't a made-up language!");
		if (name.compareToIgnoreCase("ruby") > 0)
			System.out.println(name + " comes After ruby");
			
		if (name.compareToIgnoreCase("visualbasic") < 0)
			System.out.println(name + " comes Before visualbasic");
		if (name.compareToIgnoreCase("visualbasic") == 0)
			System.out.println("visualbasic isn't a made-up language!");
		if (name.compareToIgnoreCase("visualbasic") > 0)
			System.out.println(name + " comes After visualbasic");
	
	}
}		