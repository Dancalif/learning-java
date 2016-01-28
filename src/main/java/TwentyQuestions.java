import java.util.Scanner;

public class TwentyQuestions {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.printf("%20s", "TWO QUESTIONS!");
		System.out.print("\n\n Think of an object, and I'll try to guess it.");

		System.out.print("\n\n Question 1) Is it animal, vegetable, or mineral?");
		String question1 = keyboard.nextLine();

		System.out.print("\n Question 2) Is it bigger than a breadbox?");
		String question2 = keyboard.nextLine();

		if (question1.equals("animal"))
			if (question2.equals("no")) {
				System.out.print("\n My guess is that you are thinking of a squirrel.");
			} else {
				System.out.print("\n My guess is that you are thinking of a moose.");
			}

		if (question1.equals("vegetable"))
			if (question2.equals("no")) {
				System.out.print("\n My guess is that you are thinking of a carrot.");
			} else {
				System.out.print("\n My guess is that you are thinking of a watermelon.");
			}

		if (question1.equals("mineral"))
			if (question2.equals("no")) {
				System.out.print("\n My guess is that you are thinking of a paper clip.");
			} else {
				System.out.print("\n My guess is that you are thinking of a Camaro.");
			}
	}
}
