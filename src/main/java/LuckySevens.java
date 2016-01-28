import java.util.Scanner;

public class LuckySevens {

	public static void main(String[] args) {
		
		Scanner keyboardLenght = new Scanner(System.in);
		Scanner keyboardNums = new Scanner(System.in);
		int totalNum = 0;
		int counter = 0;
		
		System.out.println("Here is a game, my friend! You tell me the numbers and I will check if any 3 consecutive ones give us 7 in a total.");
		System.out.print("How many numbers we wil play with? > ");
		int arrayLenght = keyboardLenght.nextInt();
		int[] ourArray = new int[arrayLenght];
		
		System.out.println("Now let me know the numbers. Type one by one, press Enter after each number please.");
		for (int i = 0; i < arrayLenght; i++) {
			int userNum = keyboardNums.nextInt();
			ourArray[i] = userNum;
		}
		
		for (int i = 0; i <= ourArray.length - 3; i++) {
			int total = ourArray[i] + ourArray[i + 1] + ourArray[i + 2];
				if (total == 7) {
					System.out.println("True!!!");
				} else {
					System.out.println("False!!!");	
				}
		} 
		
	}
}
