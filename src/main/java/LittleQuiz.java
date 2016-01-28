import java.util.Scanner;

public class LittleQuiz {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int correctAnswers = 0;

		System.out.print("Are you ready for a quiz?");
		String readyYesNo = keyboard.next();

		if (readyYesNo.equals("Yes") || readyYesNo.equals("yes")) {
			System.out.print("Okay, here it comes!");
		} else {
			System.out.print("Sorry. Please come back later on.");
			System.exit(0);
		}

		System.out.printf("\n \n %s \n %20s \n %20s \n %17s", "Q1) What is the capital of Alaska?", "1) Melbourne",
				"2) Anchorage", "3) Juneau");
		String question1 = keyboard.next();
		if (question1.equals("3") || question1.equals("Juneau")) {
			correctAnswers = correctAnswers + 1;
			System.out.print("That's right!");
		} else {
			System.out.print("Oops!");
		}

		System.out.printf("\n\n %s \n %20s \n %22s", "Q2) Can you store the value \"cat\" in a variable of type int?",
				"1) Yes", "2) No");
		String question2 = keyboard.next();
		if (question2.equals("1") || question2.equals("yes") || question2.equals("Yes")) {
			System.out.print("Sorry, \"cat\" is a string. ints can only store numbers.");
		} else {
			correctAnswers = correctAnswers + 1;
			System.out.print("That's right!");
		}

		System.out.printf("\n\n %s \n %20s \n %20s \n %22s", "Q3) What's the result of 9+6/3?", "1) 5", "2) 11",
				"3) 15/3");
		String question3 = keyboard.next();
		if (question3.equals("1") || question3.equals("5")) {
			correctAnswers = correctAnswers + 1;
			System.out.print("That's right! \n \n");
		} else {
			System.out.print("Oops! \n \n");
		}

		System.out.print("Overal, you got " + correctAnswers + " out of 3 correct. \n Thanks for playing!");
	}
}