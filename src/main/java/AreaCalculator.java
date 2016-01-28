import java.util.Scanner;

public class AreaCalculator {
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please, choose the option below to calculate the area of element.");
		System.out.printf("\n%s\n%s\n%s\n%s\n%s", "\n1) Triangle", "2) Rectangle", "3) Square", "4) Circle", "5) Quit");
		System.out.print("\n\nWhat shape? > ");
		int userInput = keyboard.nextInt();
		
		if (userInput == 1){
			System.out.print("Side lenght? > ");
			int sideLenght = keyboard.nextInt();
			System.out.println("The area is " + area_circle(sideLenght));
		} else if (userInput == 2){
			System.out.print("Side lenght? > ");
			int length = keyboard.nextInt();
			System.out.print("Side width? > ");
			int width = keyboard.nextInt();
			System.out.println("The area is " + area_rectangle(length, width));
		} else if (userInput == 3){
			System.out.print("Side length? > ");
			int length = keyboard.nextInt();
			System.out.println("The area is " + area_square(length));
		} else if (userInput == 4){
			System.out.print("Base? > ");
			int base = keyboard.nextInt();
			System.out.print("Height? > ");
			int height = keyboard.nextInt();
			System.out.println("The area is " + area_triangle(base, height));
		} else if (userInput == 5){
			System.out.println("Thank you for playing with us!");
		}
	}
	
		public static double area_circle(int a) {
			double A;
			A = 3.14 * (a * a); //A = πr²
			return A;
		}
		public static double area_rectangle(int a, int b) {
			double A;
			A = a * b; //A = l × w
			return A;
		}
		public static double area_square(int a) {
			double A;
			A = a * a; //A = s²
			return A;
		}
		public static double area_triangle(int a, int b) {
			double A;
			A = (a * b)/2; //A = ½bh
			return A;
		}
		
}
