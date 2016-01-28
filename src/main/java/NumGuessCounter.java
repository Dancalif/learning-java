import java.util.Scanner;
import java.util.Random;

public class NumGuessCounter {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();

		System.out.print("I have chosen a number between 1 and 10. Try to guess it. \n");

		int myNum = (1 + r.nextInt(10));
		int userNum = keyboard.nextInt();
		int tries = 1;

		while (myNum != userNum) {
			System.out.print("\n That is incorrect! Guess again. \n");
			userNum = keyboard.nextInt();
			tries++;
		}
		System.out.printf("\n %s \n %s", "That's right! You are a good guesser!", "It took only " + tries + " tries.");
	}
}