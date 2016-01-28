import java.util.Scanner;

public class SpaceBoxing {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter your current earth weight: ");
		int weight = keyboard.nextInt();
		double gravity = 0;
		String planetName = "";
		System.out.print("I have information for the following planets: ");
		System.out.printf("\n\n%20s%15s%15s \n %20s%15s%15s", "1. Venus", "2. Mars", "3. Jupiter", "4. Saturn", "5. Uranus", "6. Neptune");
		System.out.println("\n");
		System.out.print("Which planet are you visiting?");
		String planet = keyboard.next();
		
		if (planet.equals("1") || planet.equals("Venus")) {
				planetName = "Venus";
				gravity = 0.78;
		} else if (planet.equals("2") || planet.equals("Mars")) {
				planetName = "Mars";
				gravity = 0.39;
		} else if (planet.equals("3") || planet.equals("Jupiter")) {
				planetName = "Jupiter";
				gravity = 2.65;
		} else if (planet.equals("4") || planet.equals("Saturn")) {
				planetName = "Saturn";
				gravity = 1.17;
		} else if (planet.equals("5") || planet.equals("Uranus")) {
				planetName = "Uranus";
				gravity = 1.05;
		} else if (planet.equals("6") || planet.equals("Neptune")) {
				planetName = "Neptune";
				gravity = 1.23;
		} else {
			System.out.print("Please, check the spelling");
			System.exit(0);
		}
		System.out.print("Your weight would be " + (weight * gravity) + " pounds on " + planetName);
		}
	}
