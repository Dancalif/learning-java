import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		Random r = new Random();
		int numVar = 1 + r.nextInt(10);
		
		System.out.printf("%40s", "THE WORST NUMBER GUESSING GAME EVER!!!");
		System.out.print("\n I'm thinking of a number from 1 - 10. Try to guess!");
		int numGuess = keyboard.nextInt();
		
		if (numGuess == numVar)
			System.out.print("\n Wow! You are absolutely right!!!");
		else
			System.out.print("\n Nope. Sorry dude!");
			
	}
}