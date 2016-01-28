import java.util.Scanner;

public class CollatzSequence {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Starting number, please: ");
		int userInput = keyboard.nextInt();
		int countInput = -1;
		int countRows = 0;
		int result = 0;
		int countSteps = 0;
		int largestValue = 0;
		
		do {
			if (countInput == -1) {
				System.out.print("\n");
				System.out.printf("%10s", userInput + "   ");
				countInput++;
				countRows++;
				if (userInput % 2 == 0) {
					result = (userInput / 2);
					System.out.printf("%10s", result + "   ");
					if (result > userInput) {
						largestValue = result;
					}
					countSteps++;
				} else {
					result = (userInput * 3) + 1;
					System.out.printf("%10s", result + "   ");
					if (result > userInput) {
						largestValue = result;
					}
					countSteps++;
				}
			} else if (result % 2 == 0) {
				countRows++;
					if (countRows == 10) {
						System.out.print("\n");
						countRows = 0;
					}
					result = (result / 2);
					System.out.printf("%10s", result + "   ");
						if (result > largestValue) {
							largestValue = result;
						}
					countSteps++;
				} else {
					countRows++;
					if (countRows == 10) {
						System.out.print("\n");
						countRows = 0;
					}
					result = (result * 3) + 1;
					System.out.printf("%10s", result + "   ");
					if (result > largestValue) {
						largestValue = result;
					}
					countSteps++;
				}
		} while (result != 1);
			System.out.print("\n\n");
			System.out.print("Terminated after " + countSteps + " steps.");
			System.out.print("\n");
			System.out.print("The largest value is " + largestValue + ".");
	}
}