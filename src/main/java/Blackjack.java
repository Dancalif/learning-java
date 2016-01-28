import java.util.Scanner;
import java.util.Random;

public class Blackjack {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();

		System.out.printf("%S", "Welcome to my first game! That's a Blackjack, baby! :) \n");

		String currentPlayer = "user";
		int stayFlag = 0;
		boolean gameOver = false;
		int userNum1 = r.nextInt(10) + 2;
		int userNum2 = r.nextInt(10) + 2;
		int userTotal = userNum1 + userNum2;
		System.out.println("\nYou get a " + userNum1 + " and a " + userNum2);
		System.out.print("Your total is " + userTotal);

		int dealerNum1 = r.nextInt(10) + 2;
		int dealerNum2 = r.nextInt(10) + 2;
		System.out.println(
				"\n\nThe dealer has a " + dealerNum1 + " showing, and a hidden card.\nHis total is hidden too.");
		int dealerTotal = 0;
		do {
			if (currentPlayer == "user") {
				System.out.print("\nWould you like to \"hit\" or \"stay\"? > ");
				String hitStay = keyboard.next();
				if (hitStay.equals("hit")) {
					userNum1 = r.nextInt(10) + 2;
					System.out.println("\nYou drew a " + userNum1);
					userTotal = userNum1 + userTotal;
					System.out.println("Your total is " + userTotal);
				} else if (hitStay.equals("stay")) {
					stayFlag = 1;
					currentPlayer = "dealer";
					if (currentPlayer.equals("dealer")) {
						System.out.println("Ok, it's dealer's turn");
						System.out.println("\nHis hidden card was a " + dealerNum2 + ".");
						dealerTotal = dealerNum1 + dealerNum2;
						System.out.println("His total is " + dealerTotal);
						if (dealerTotal < 18) {
							System.out.println("\nDelear decided to hit again.");
							dealerNum2 = r.nextInt(10) + 2;
							dealerTotal = dealerTotal + dealerNum2;
							System.out.println("\nDealer drew a " + dealerNum2);
							System.out.println("His new total is " + dealerTotal);
						} else if (dealerTotal >= 18) {
							System.out.println("\nDelear decided to stay.");
							stayFlag = 2;
						}
					}
				}
			} else if (currentPlayer.equals("dealer")) {
				if (dealerTotal < 18) {
					System.out.println("\nDelear decided to hit again.");
					dealerNum2 = r.nextInt(10) + 2;
					dealerTotal = dealerTotal + dealerNum2;
					System.out.println("\nDealer drew a " + dealerNum2);
					System.out.println("His new total is " + dealerTotal);
				} else if (dealerTotal >= 18) {
					System.out.println("\nDelear decided to stay.");
					stayFlag = 2;
				}
			}

			if (userTotal == dealerTotal) {
				System.out.printf("\n\n%S", "***The friendship wins!!!*** :)");
				gameOver = true;
			} else if (userTotal > 21 && dealerTotal > 21) {
				System.out.printf("\n\n%S", "***Nice try guys! Nice try! :)***");
				gameOver = true;
			} else if (stayFlag == 2 && (userTotal > 21 || dealerTotal == 21)) {
				System.out.printf("\n\n%S", "***Dealer wins!***");
				gameOver = true;
			} else if (stayFlag == 2 && (dealerTotal > 21 || userTotal == 21)) {
				System.out.printf("\n\n%S", "***User wins!***");
				gameOver = true;
			}

			if (stayFlag == 2 && userTotal > dealerTotal && userTotal < 21) {
				System.out.printf("\n\n%S", "***User wins!***");
				gameOver = true;
			} else if (stayFlag == 2 && dealerTotal > userTotal && dealerTotal < 21) {
				System.out.printf("\n\n%S", "***Dealer wins!***");
				gameOver = true;
			}
		} while (gameOver == false);
	}
}
