import java.util.Scanner;
import java.util.Random;

public class BabyBlackjack {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();

		System.out.printf("%20S\n\n", "Baby Blackjack!!!");

		int dealerNum1 = r.nextInt(10);
		int dealerNum2 = r.nextInt(10);
		int dealerTotal = dealerNum1 + dealerNum2;
		System.out.println("The dealer's numbers are " + dealerNum1 + " and " + dealerNum2);
		System.out.println("The dealer's total is " + dealerTotal + "\n");
		int userNum1 = r.nextInt(10);
		int userNum2 = r.nextInt(10);
		int userTotal = userNum1 + userNum2;
		System.out.println("The user's numbers are " + userNum1 + " and " + userNum2);
		System.out.println("The user's total is " + userTotal + "\n");

		if (dealerTotal == userTotal) {
			System.out.printf("%15S", "Friendship wins!!!");
		} else if (dealerTotal > userTotal) {
			System.out.printf("%15S", "Dealer wins!!!");
		} else {
			System.out.printf("%15S", "User wins!!!");
		}
	}
}