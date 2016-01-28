import java.util.Scanner;

public class NameAgeSalaryScanner
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What's your name?");
		String name = keyboard.next();
		
		System.out.print("How old are you?");
		int age = keyboard.nextInt();
		
		System.out.print("So, you are " + age + "!" + " That's not old at all! What is your salary? " + name);
		float salary = keyboard.nextFloat();
		
		System.out.print(salary + "! I hope that's for hour! Not for year, " + name + " LOL :)");
	}
}