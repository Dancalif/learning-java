import java.util.Random;
import java.util.Scanner;

public class ShorterDoubleDice {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int roll1;
		int roll2;
		System.out.printf("%30S", "Here comes the dice! \n");
		
		do {
			System.out.print("Roll #1: ");
			roll1 = keyboard.nextInt();
			System.out.print("Roll #2: ");
			roll2 = keyboard.nextInt();
			System.out.print("The total is " + (roll1 + roll2) + "! \n\n");
		} while (roll1 != roll2);
	}
}