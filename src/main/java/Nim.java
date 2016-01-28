import java.util.Scanner;
import java.util.Random;

public class Nim {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();

		System.out.print("Player 1, enter your name: ");
		String player1 = keyboard.next();
		System.out.print("Player 2, enter your name: ");
		String player2 = keyboard.next();
		int pileA = 1;
		int pileB = 1;
		int pileC = 1;
		String currentPlayer = "";
		Boolean blnFinal = false;
		int playerAccess = 1;
		int selectPlayer = 0;
		int tries = 1;
		String currentPile = "";
		int removeValue = 0;

		System.out.printf("\n%s %10s %10s", "A: " + pileA, "B: " + pileB, "C: " + pileC);

		do {

			if (selectPlayer == 1 || tries == 1) {
				tries++;
				playerAccess++;
				if (playerAccess % 2 == 0) {
					currentPlayer = player1;
				} else {
					currentPlayer = player2;
				}
				System.out.print("\n\n");
				System.out.print(currentPlayer + ", choose a pile: ");
				currentPile = keyboard.next();
				System.out.print("How many to remove from " + currentPile + ": ");
				removeValue = keyboard.nextInt();
			}

		///// If the amount to remove > than pile has or pile == 0
			if (removeValue <= 0) {
				System.out.print("You must choose at least 1. How many? ");
				removeValue = keyboard.nextInt();
				selectPlayer = 0;
				continue;
			} 
			
				if (currentPile.toUpperCase().equals("A") && removeValue > pileA && pileA > 0) {
						System.out.print(currentPlayer + " doesn't have that many. Try again: ");
						removeValue = keyboard.nextInt();
						selectPlayer = 0;
						continue;
					} else if (currentPile.toUpperCase().equals("B") && removeValue > pileB && pileB > 0) {
						System.out.print(currentPlayer + " doesn't have that many. Try again: ");
						removeValue = keyboard.nextInt();
						selectPlayer = 0;
						continue;
					} else if (currentPile.toUpperCase().equals("C") && removeValue > pileC && pileC > 0) {
						System.out.print(currentPlayer + " doesn't have that many. Try again: ");
						removeValue = keyboard.nextInt();
						selectPlayer = 0;
						continue;
					} else if (currentPile.toUpperCase().equals("A") && pileA == 0) {
				System.out.print(
						"Nice try, " + currentPlayer + ". The pile " + currentPile + " is empty. Choose again: ");
				currentPile = keyboard.next();
				selectPlayer = 0;
				continue;
			} else if (currentPile.toUpperCase().equals("B") && pileB == 0) {
				System.out.print(
						"Nice try, " + currentPlayer + ". The pile " + currentPile + " is empty. Choose again: ");
				currentPile = keyboard.next();
				selectPlayer = 0;
				continue;
			} else if (currentPile.toUpperCase().equals("C") && pileC == 0) {
				System.out.print(
						"Nice try, " + currentPlayer + ". The pile " + currentPile + " is empty. Choose again: ");
				currentPile = keyboard.next();
				selectPlayer = 0;
				continue;
			}
			
			if (currentPile.toUpperCase().equals("A")) {
				pileA = pileA - removeValue;
				currentPile = "";
			} else if (currentPile.toUpperCase().equals("B")) {
				pileB = pileB - removeValue;
				currentPile = "";
			} else if (currentPile.toUpperCase().equals("C")) {
				pileC = pileC - removeValue;
				currentPile = "";
			}

			System.out.printf("\n%s %10s %10s", "A: " + pileA, "B: " + pileB, "C: " + pileC);
			System.out.print("\n");
			selectPlayer = 1;
			continue;

		} while (!(pileA == 0 && pileB == 0 && pileC == 0));
		if (currentPlayer == player1) {
			System.out.print("\n");
			System.out.printf(player1 + ", you must take the last remaning counter, so you lose." + player2 + " wins!");
			System.out.print("\n");
			System.out.printf(player2 + ", you must take the last remaning counter, so you lose." + player1 + " wins!");
		}
	}
}