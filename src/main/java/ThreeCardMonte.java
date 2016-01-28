import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("\n Where is a double A?");
		
		int myNum = (1 + r.nextInt(3));
		
		System.out.printf("\n\n%30s \n%30s \n%21d %3d %3d", "##  ##  ##", "##  ##  ##", 1, 2, 3);
		System.out.print("\n");
		int aceGuess = keyboard.nextInt();
		
		if (myNum == 1 && myNum == aceGuess) {
			System.out.print("You are absolutely right!!!");
			System.out.printf("\n\n%30s \n%30s \n%21d %3d %3d", "AA  ##  ##", "AA  ##  ##", 1, 2, 3);
		} else if (myNum == 2 && myNum == aceGuess) {
			System.out.print("You are absolutely right!!!");
			System.out.printf("\n\n%30s \n%30s \n%21d %3d %3d", "##  AA  ##", "##  AA  ##", 1, 2, 3);
		} else if (myNum == 3 && myNum == aceGuess) {
			System.out.print("You are absolutely right!!!");
			System.out.printf("\n\n%30s \n%30s \n%21d %3d %3d", "##  ##  AA", "##  ##  AA", 1, 2, 3);
		} else {
			System.out.print("Too bad!!! You couldn't find it!!!");
			System.exit(0);
		}
		System.exit(0);
	}
}