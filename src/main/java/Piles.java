import java.util.Scanner;

public class Piles {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int firstA = 1;
		int firstB = 1;
		int firstC = 1;
		
		System.out.printf("%s %10s %10s\n", "A: " + firstA, "B: " + firstB, "C: " + firstC);
		
		do {
			
			System.out.print("\n");
			System.out.print("Choose a pile: ");
			String userPileSelection = keyboard.next();
			System.out.print("How many to remove from pile " + userPileSelection + ": ");
			int userNumberSelection = keyboard.nextInt();
			System.out.print("\n");
			
			if (userPileSelection.equals("A")) {
				firstA = firstA - userNumberSelection;
				System.out.printf("%s %10s %10s\n", "A: " + firstA, "B: " + firstB, "C: " + firstC);
			} else if (userPileSelection.equals("B")) {
				firstB = firstB - userNumberSelection;
				System.out.printf("%s %10s %10s\n", "A: " + firstA, "B: " + firstB, "C: " + firstC);
			} else if (userPileSelection.equals("C")) {
				firstC = firstC - userNumberSelection;
				System.out.printf("%s %10s %10s\n", "A: " + firstA, "B: " + firstB, "C: " + firstC);
			}
		}
		//while (!(firstA == 0 && firstB == 0 && firstC == 0));
		while (firstA + firstB + firstC != 0);
		System.out.print("\n");
		System.out.print("All piles are empty. Good job!");
	}
}