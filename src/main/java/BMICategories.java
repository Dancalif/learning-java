import java.util.Scanner;

public class BMICategories {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("What's your name?");
		String name = keyboard.nextLine();
		System.out.print("\n What's your height in inches, " + name + "?");
		double height = keyboard.nextDouble();
		System.out.print("\n What's your weight in pounds, " + name + "?");
		double weight = keyboard.nextDouble();

		double heightMeter = height * 0.0254;
		double squareHeight = heightMeter * heightMeter;
		double weightKG = weight * 0.45;
		double bMi = weightKG / squareHeight;

		if (bMi < 15.0)
			System.out.print("\n" + name + ", your BMI is " + bMi + "\n You are very severely underweight.");
		if (bMi >= 15.0 && bMi <= 16.0)
			System.out.print("\n" + name + ", your BMI is " + bMi + "\n You are severely underweight.");
		if (bMi >= 16.1 && bMi <= 18.4)
			System.out.print("\n" + name + ", your BMI is " + bMi + "\n You are underweight.");
		if (bMi >= 18.5 && bMi <= 24.9)
			System.out.print("\n" + name + ", your BMI is " + bMi + "\n You have a normal weight.");
		if (bMi >= 25.0 && bMi <= 29.9)
			System.out.print("\n" + name + ", your BMI is " + bMi + "\n You are overweight.");
		if (bMi >= 30.0 && bMi <= 34.9)
			System.out.print("\n" + name + ", your BMI is " + bMi + "\n You are moderately obese.");
		if (bMi >= 35.0 && bMi <= 39.9)
			System.out.print("\n" + name + ", your BMI is " + bMi + "\n You are severely obese.");
		if (bMi >= 40.0)
			System.out.print("\n" + name + ", your BMI is " + bMi + "\n You are very severely (or \"morbidly\") obese.");
	}
}