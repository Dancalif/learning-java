import java.util.Scanner;

public class AskingQuestions
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		String feet;
		String inch;
		double weight;
		
		System.out.print("How ald are you?");
		age = keyboard.nextInt();
		System.out.print("How many feet tall are you?");
		feet = keyboard.next();
		System.out.print("And how many inches?");
		inch = keyboard.next();
		System.out.print("How much do you weigh?");
		weight = keyboard.nextDouble();
		
		System.out.printf("So, you are %d old, %s'%s\" tall and %.0f kg heavy", age, feet, inch, weight);
		
		//System.out.printf("%d'%n\"", height);
	}
}