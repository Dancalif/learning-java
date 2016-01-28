import java.util.Scanner;

public class ForgetfulMachine
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Give me your favorite color!");
		String color = keyboard.next();
		
		System.out.println("Give me your favorite number!");
		String number = keyboard.next();
		
		System.out.println("Your favorite color is " + color + " and your favorite number is " + number + ".");
	}
}