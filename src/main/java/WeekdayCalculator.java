import java.util.Scanner;

public class WeekdayCalculator {
	public static boolean is_leap(int year) {
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if (year % 400 == 0)
			result = true;
		else if (year % 100 == 0)
			result = false;
		else if (year % 4 == 0)
			result = true;
		else
			result = false;

		return result;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to Mr. Dan's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12, 10, 2003));
		System.out.println(" 2 13 1976 => " + weekday(2, 13, 1976));
		System.out.println(" 2 13 1977 => " + weekday(2, 13, 1977));
		System.out.println(" 7  2 1974 => " + weekday(7, 2, 1974));
		System.out.println(" 1 15 2003 => " + weekday(1, 15, 2003));
		System.out.println("10 13 2000 => " + weekday(10, 13, 2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();

		weekday(mm, dd, yyyy);
		System.out.println("You were born on ");
	}

	// paste your functions from MonthName, WeekdayName, and MonthOffset here

	public static String weekday(int mm, int dd, int yyyy) {
		int yy, total;
		String date = "";

		// bunch of calculations go here

		yy = yyyy - 1900;
		total = (yy / 4) + yy + dd;

		// date = month_name(mm) + ", " + yyyy;

		// Divide the number of years since 1900 by 4. Put the quotient in a
		// variable called total. For example, if the person was born in 1983,
		// divide 83 by 4 and store 20 in total.
		// Also add the number of years since 1900 to total.
		// Add the day of the month to total.

		// Using the function month_offset() you wrote, find the "month offset"
		// and add it to total.
		// If the year is a leap year and if the month you are working with is
		// either January or February, then subtract 1 from the total. You can
		// use the function is_leap() provided to determine if the year is a
		// leap year.
		// Find the remainder when total is divided by 7. Pass this remainder to
		// the function weekday_name() you wrote to determine the day of the
		// week the person was born.
		// Finally, build up a single String value containing the whole date
		// (day of week, month, day, year). You'll need to use the function
		// month_name() you wrote to show the month name rather than its number.
		// Return that String value.

		return date;
	}
}