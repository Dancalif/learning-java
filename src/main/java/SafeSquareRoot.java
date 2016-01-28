import java.util.Scanner;

public class SafeSquareRoot {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.printf("%S", "square root!!! \n\n");

		System.out.print("Enter the number: ");
		int userNum = keyboard.nextInt();

		int tries = 0;

		while (tries == 0) {
			if (tries == 0 && userNum >= 0) {
				tries++;
				System.out.print("The square root of " + userNum + " is " + Math.sqrt(userNum) + "\n");
			} else if (userNum >= 0) {
					tries++;
					System.out.print("The square root of " + userNum + " is " + Math.sqrt(userNum) + "\n");
			} else if (userNum < 0) {
				System.out.print("You cannot take a square root from negative number, silly. \nTry again! \n");
				System.out.print("Enter the number: ");
				userNum = keyboard.nextInt();
			}
		}
	}
}