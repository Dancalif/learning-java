import java.util.Scanner;

public class RightTriangleChecker {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter three integers: \n");
		int side1, side2, side3;
		int countSides = 0;

		while (countSides != 3) {
			System.out.print("Side 1: ");
			side1 = keyboard.nextInt();
			countSides++;
			System.out.print("Side 2: ");
			side2 = keyboard.nextInt();
			while (side2 < side1) {
				System.out.print(side2 + " is smaller than " + side1 + ". Try again. \n");
				System.out.print("Side 2: ");
				side2 = keyboard.nextInt();
				if (side2 >= side1) {
					countSides++;
				}
			}
			System.out.print("Side 3: ");
			side3 = keyboard.nextInt();
			while (side3 < side1 || side3 < side2) {
				System.out.print(side2 + " is smaller than " + side1 + " and/or " + side2 + ". Try again. \n");
				System.out.print("Side 3: ");
				side3 = keyboard.nextInt();
			}
			if (side3 >= side2 && side3 >= side1) {
				countSides++;
			}
			if (((side1*side1) + (side2*side2)) == (side3*side3)) {
				System.out.print("These sides *do* make a right triangle.");
				System.exit(0);
			} else {
				System.out.print("No! These sides do not make  right triangle.");
				System.exit(0);
				
			}
		}
		
	}
}
