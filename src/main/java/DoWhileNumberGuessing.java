import java.util.Random;
import java.util.Scanner;

public class DoWhileNumberGuessing {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int myNum = r.nextInt(10);
		int count = 0;
		
		System.out.printf("%S", "I have chosen a number between 1 and 10. Try to guess it. You can try 4 times. \n\n");
		
		do {
			count++;
			System.out.print("Your guess: ");
			int userGuess = keyboard.nextInt();
			if (userGuess != myNum) {
				System.out.print("That is incorrect. Guess again.\n");
			} else {
				System.out.print("That's right! You are a good guesser. \n");
				System.out.print("It took only " + count + " tries.");
				System.exit(0);
			}
		} 
		while (count < 4);
		System.out.print("Your tries are over!");
		System.exit(0);
	}
}