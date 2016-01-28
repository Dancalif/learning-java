import java.util.Scanner;

public class AddingValuesForLoop {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Number please: ");
		int userNumber = keyboard.nextInt();
		int y = 0;
		
		for (int i = 1; i <= userNumber; i++) {
			System.out.print(i + " ");
			y = y + i;	
		}
		System.out.print("\n");
		System.out.print("The sum is " + y);
	}
}