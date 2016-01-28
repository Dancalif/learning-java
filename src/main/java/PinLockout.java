import java.util.Scanner;

public class PinLockout {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;
		int tries = 0;
		
		System.out.printf("%S", "Welcome to the Bank of Mitchell.");
		System.out.printf("%S", "enter you pin!");
		int entry = keyboard.nextInt();
		tries++;
		
		while (entry != pin && tries < 3) {
			System.out.println("\n Incorrect Pin. Try again.");
			System.out.printf("%S", "enter you pin!");
			entry = keyboard.nextInt();
			tries++;
		}
		if (entry == pin) 
			System.out.println("\n Pin Accepted. Now you have an access to your account");
		else if (tries >= 3)
			System.out.println("\n You have run out of tries. Account is locked.");
	}
}