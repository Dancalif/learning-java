import java.util.Random;
import java.util.Scanner;

public class HiLowiLimitedTries {
	public static void main(String[] args) {

		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);

		System.out.print("I'm thinking of a number between 1 - 100. Try to guess it. \n\n You have 7 tries. \n\n");

		int myNum = (1 + r.nextInt(100));
		int userNum = 0;
		int tries = 0;

		while (tries != 7 && userNum != myNum) {
			userNum = keyboard.nextInt();
			tries++;
			if (userNum > myNum) {
				System.out.printf("\n Sorry, that guess is too high. Guess it again! \n");
			} else if (userNum < myNum) {
				System.out.printf("\n Sorry, that guess is too low. Guess it again? \n");
			} else if (userNum == myNum) {
			System.out.print("\n Cool! You got it! \n");
			System.exit(0);
			}
		}
		System.out.print("\n Sorry dude, you had 7 tries... \n");
	}
}