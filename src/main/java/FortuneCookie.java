import java.util.Scanner;
import java.util.Random;

public class FortuneCookie {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int randomNum = 1 + r.nextInt(6);
		String response = "";
		
		if (randomNum == 1)
			response = "New carrier is coming soon!";
		else if (randomNum == 2)
			response = "Take care of your health!";
		else if (randomNum == 3)
			response = "You will win a lotto soon!";
		else if (randomNum == 4)
			response = "A lot of happinies!";
		else if (randomNum == 5)
			response = "Keep learning whatever you started!";
		else if (randomNum == 6)
			response = "You should get luck soon!";
		System.out.print("Fortune cookies says: " + response);
		System.out.print("\n" + (1 + r.nextInt(54)) + " - " + (1 + r.nextInt(54)) + " - " + (1 + r.nextInt(54)) + " - " + (1 + r.nextInt(54)) + " - " + (1 + r.nextInt(54)) + " - " + (1 + r.nextInt(54)));
	}
}