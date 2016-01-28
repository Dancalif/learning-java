// Fill-In Functions - Fix the broken functions and function calls.

public class FillInFunctions
{
	public static void main( String[] args )
	{
		// Fill in the function calls where appropriate.

		System.out.println("Watch as we demonstrate functions.\n");

		System.out.println("I'm going to get a random character from A-Z");
		System.out.println("The character is: " + randchar() + "!\n" );

		System.out.println("Now let's count from -10 to 10");
		int begin, end;
		begin = -10;
		end = 10;
		System.out.println(counter(begin, end) + " How was that?\n");

		System.out.println("Now we take the absolute value of a number.");
		int x, y = 99;
		x = -10;
		System.out.println("|" + x + "| = " + abso(x) +"\n");

		System.out.println("That's all.  This program has been brought to you by:");
		credits();
	}


	public static void credits()
	{
		// displays some boilerplate text saying who wrote this program, etc.
		System.out.println();
		System.out.println("programmed by Graham Mitchell");
		System.out.println("modified by [your name here]");
		System.out.print("This code is distributed under the terms of the standard ");
		System.out.println("BSD license.  Do with it as you wish.");
	}
	
	public static char randchar()
	{
		// chooses a random character in the range "A" to "Z"
		int numval;
		char charval;
		// pick a random number from 0 to 25
		numval = (int)(Math.random()*26);
		// now add that offset to the value of the letter 'A'
		charval = (char) ('A' + numval);
		return charval;
	}




	public static int counter(int start, int stop )
	{
		while ( start < stop )
		{
			System.out.print(start + " ");
			start = start+1;
		}
		return start;
	}




	public static int abso(int value)
	{
		// finds the absolute value of the parameter
		int absval;

		if ( value < 0 )
			absval = -value;
		else
			absval = value;

		return absval;
	}


}