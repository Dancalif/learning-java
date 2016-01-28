import java.util.Scanner;
import java.util.Random;

public class OneShotHiLo {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int myNum = (1 + r.nextInt(100));
		
		System.out.print("I'm thinking of the nub=mber between 1 - 100. Try to guess it!");
		int guessNum = keyboard.nextInt();
		
		if (guessNum > myNum)
			System.out.print("Too high my friend!");
		else if (guessNum < myNum)
			System.out.print("Too low buddy!");
		else if (guessNum == myNum)
			System.out.print("Krasava!");
		
	}
}