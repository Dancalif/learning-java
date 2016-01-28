import java.util.Scanner;

public class HowOldAreYouElseIf {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Hey, What's your name? (Sorry, I keep forgetting).");
		String name = keyboard.next();
		
		System.out.print("Ok, " + name + ", how old are you?");
		int age = keyboard.nextInt();
		
		if (age < 16) {
			System.out.print("You can't drive, " + name);
		} else if (age >= 16 && age <= 17) {
			System.out.print("You can drive but not vote, " + name);
		} else if (age >= 18 && age <= 24) {
			System.out.print("You can vote but not rent a car, " + name);
		} else if (age > 25) {
			System.out.print("You can do pretty much anything, " + name);
		}
		
	}
}