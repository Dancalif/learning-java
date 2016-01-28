import java.util.Scanner;

public class UserInput
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please, enter the following information so I can sell it for a profit");
		
		System.out.print("What's your first name?");
		String firstName = keyboard.next();
		System.out.print("Last name please");
		String lastName = keyboard.next();
		System.out.print("Grade?");
		int grade = keyboard.nextInt();
		System.out.print("You will be surprised but I need your Student ID");
		String studentID = keyboard.next();
		System.out.print("Finally, what's your Login ID?");
		String loginID = keyboard.next();
		System.out.print("Last questions is your GPA please");
		float gpa = keyboard.nextFloat();
		
		System.out.println("Your information:");
		System.out.printf("\n %-15s %-10s", "Login: ", loginID);
		System.out.printf("\n %-15s %-10s", "ID: ", studentID);
		System.out.printf("\n %-15s %-10s%s", "Name: ", firstName, lastName);
		System.out.printf("\n %-15s %-10f", "GPA: ", gpa);
		System.out.printf("\n %-15s %-10d", "Grade: ", grade);
	}
}