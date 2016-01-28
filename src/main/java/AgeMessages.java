import java.util.Scanner;
 
public class AgeMessages {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Your name please?");
		String name = keyboard.nextLine();
		System.out.print("\n Your age, " + name + " please?");
		int age = keyboard.nextInt();
		
		if (age < 16) {
			System.out.print("\n You cannot drive, " + name + ".");
		}
		if (age >= 16 && age <= 17) {
			System.out.print("\n You can drive but not vote, " + name + ".");
		}
		if (age >= 18 && age <= 24) {
			System.out.print("\n You can vote but not rent a car, " + name + ".");
		}
		if (age >= 25) {
			System.out.print("\n You can do pretty much anything, " + name + ".");
		}
	}
}