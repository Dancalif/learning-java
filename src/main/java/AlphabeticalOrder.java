import java.util.Scanner;

public class AlphabeticalOrder {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What's your last name?");
		String lastName = keyboard.next();
		
		if (lastName.compareTo("Carswell") <= 0)
			System.out.print("You don't have to wait long");
		else if (lastName.compareTo("Jones") <= 0)
			System.out.print("That's not bad");
		else if (lastName.compareTo("Smith") <= 0)
			System.out.print("Looks like a bit of a wait");
		else if (lastName.compareTo("Young") <= 0)
			System.out.print("It's gonna be a while");
		else if (lastName.compareTo("Young") > 0)
			System.out.print("Not going anywhere for a while?");
	}
}
