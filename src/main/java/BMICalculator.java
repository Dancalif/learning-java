import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What's your height (feet only)?");
		double heightFeet = keyboard.nextFloat();
		System.out.print("What's your height (inches only)?");
		double heightInch = keyboard.nextDouble();
		System.out.print("What's your weight in pounds?");
		float weightPound = keyboard.nextFloat();
		
		double correctHeight = (heightFeet * 0.3) + (heightInch * 0.0254);
				
		System.out.print("Your BMI is " + ((weightPound * 0.4) / (correctHeight * correctHeight)));
	}
}