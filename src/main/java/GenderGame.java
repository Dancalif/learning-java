import java.util.Scanner;

public class GenderGame {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("\n What is your gender (M or F)?");
		String gender = keyboard.next();
		System.out.print("\n First Name please?");
		String firstName = keyboard.next();
		System.out.print("\n Last name please?");
		String lastName = keyboard.next();
		System.out.print("\n How young are you?");
		int age = keyboard.nextInt();

		if (gender.equals("F") && age >= 20) {
			System.out.print("\n Are you married, " + firstName + "?");
			String marriageStatus = keyboard.next();
			if (marriageStatus.equals("y")) {
				System.out.print("\n Nice to meet you Mrs. " + lastName);
			} else {
				System.out.print("\n Welcome Ms." + lastName);
			}
		} else if (gender.equals("F") && age < 20) {
			System.out.print("\n Glad to see you, " + firstName + " " + lastName);
		} else if (gender.equals("M") && age >= 20) {
			System.out.print("\n Good afternoon Mr. " + firstName);
		} else {
			System.out.print("\n Hello, hello, " + firstName + " " + lastName);
		}

	}
}