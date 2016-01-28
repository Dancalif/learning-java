import java.util.Scanner;

public class DumbCalculator
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What's your first number?");
		float firstNum = keyboard.nextFloat();
		System.out.print("What's your second number?");
		float secondNum = keyboard.nextFloat();
		System.out.print("What's your third number?");
		float thirdNum = keyboard.nextFloat();
		
		System.out.print("(" + firstNum + " + " + secondNum + " + " + thirdNum + ")" + "/2 is " + (firstNum + secondNum + thirdNum));
	}
}