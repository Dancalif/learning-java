
import java.util.Scanner;

public class AddingValuesLoop {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("I will add up the numbers you give me. \nNumber: ");
		int userNum = keyboard.nextInt();
		int tries = 0;
		int pastSum = 0;
		
		while (userNum != 0)
				if (tries == 0) {
					System.out.print("\nThe total so far is " + (userNum));
					pastSum = userNum;
					tries++;
				} else {
					System.out.print("\nNumber: ");
					userNum = keyboard.nextInt();
					System.out.print("\nThe total so far is " + (pastSum + userNum));
					pastSum = pastSum + userNum;
				}
		System.exit(0);
	}
}