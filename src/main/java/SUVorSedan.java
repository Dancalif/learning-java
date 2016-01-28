import java.util.Scanner;

public class SUVorSedan {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Would you like to buy a brand new car but don't know which one? \n\nLet me help you!\n\n");

		// Counter tries required for the very first access
		int tries = 0;
		String typeOfCar = "";
		// Empty values for SUV type
		String makeOfCarSUV = "";
		String modelOfCarSUV = "";
		// Empty values for Sedan type
		String makeOfCarSedan = "";
		String modelOfCarSedan = "";
		// SUV Flags to access different levels of selection
		int accessToSUVSedan = 0;
		int accesToToyotaHummer = 0;
		int accessToLandcruiserHighlander = 0;
		int accessToH1H2 = 0;
		// Sedan Flags to access different levels of selection
		int accessTo5series3series = 0;
		int accessToVAZ2109VAZ21099 = 0;
		int accesToBMWVAZ = 0;
		Boolean endofGame = false;

		do {
			// suv or sedan
			if (tries == 0 || accessToSUVSedan == 1) {
				System.out.print("\"suv\", \"sedan\"?\n");
				System.out.print("> ");
				typeOfCar = keyboard.next();
				accessToSUVSedan = 0;
				tries++;
			}
			// if it's suv then Toyota or Hummer
			if (typeOfCar.equals("suv") || accesToToyotaHummer == 1) {
				System.out.print("\"Toyota\" or \"Hummer\"? or you can \"back\" to the privous menu\n");
				System.out.print("> ");
				makeOfCarSUV = keyboard.next();
				makeOfCarSedan = "";
				modelOfCarSedan = "";
				// if it's sedan then BMW or VAZ
			} else if (typeOfCar.equals("sedan") || accesToBMWVAZ == 1) {
				System.out.print("\"BMW\" or \"VAZ\"? or you can \"back\" to the privous menu\n");
				System.out.print("> ");
				makeOfCarSedan = keyboard.next();
				modelOfCarSedan = "";
				makeOfCarSUV = "";
				modelOfCarSUV = "";
			}
			// SUV options
			// if it's Toyota then Landcruiser or Highlander
			if (makeOfCarSUV.equals("Toyota") || accessToLandcruiserHighlander == 1) {
				System.out.print("\"Landcruiser\" or \"Highlander\"? or you can \"back\" to the privous menu\n");
				System.out.print("> ");
				modelOfCarSUV = keyboard.next();
				// if it's Hummer then H1 or H2
			} else if (makeOfCarSUV.equals("Hummer") || accessToH1H2 == 1) {
				System.out.print("\"H1\" or \"H2\"? or you can \"back\" to the privous menu\n");
				System.out.print("> ");
				modelOfCarSUV = keyboard.next();
			} else if (makeOfCarSUV.equals("back")) {
				accessToSUVSedan = 1;
				typeOfCar = "";
				accesToToyotaHummer = 0;
				makeOfCarSedan = "";
				modelOfCarSedan = "";
				continue;
			}
			if (modelOfCarSUV.equals("Landcruiser")) {
				System.out
						.print(modelOfCarSUV + " is very good, reliable and strong car. You will love it for sure!\n");
				endofGame = true;
			} else if (modelOfCarSUV.equals("Highlander")) {
				System.out.print(modelOfCarSUV
						+ " is very good, reliable car. 7 seats! You will always be able to take whole your family. \n");
				endofGame = true;
			} else if (modelOfCarSUV.equals("back")) {
				accessToLandcruiserHighlander = 0;
				typeOfCar = "";
				accesToToyotaHummer = 1;
				makeOfCarSedan = "";
				modelOfCarSedan = "";
				continue;
			}
			if (modelOfCarSUV.equals("H1")) {
				System.out.print(modelOfCarSUV + " is a military very powerful car. You like to fight?!\n");
				endofGame = true;
				// System.exit(0);
			} else if (makeOfCarSUV.equals("H2")) {
				System.out.print("You are 	the man! " + modelOfCarSUV + " will be really good addition to you!");
				endofGame = true;
			} else if (modelOfCarSUV.equals("back")) {
				accessToH1H2 = 0;
				typeOfCar = "";
				accesToToyotaHummer = 1;
				makeOfCarSedan = "";
				modelOfCarSedan = "";
				continue;
			}
			// Sedan options
			// If it's BMW then 5 or 3
			if (makeOfCarSedan.equals("BMW") || accessTo5series3series == 1) {
				System.out.print("\"5\" series or \"3\" series? or you can \"back\" to the privous menu\n");
				System.out.print(">");
				modelOfCarSedan = keyboard.next();
				// if it's VAZ then VAZ 21099 or VAZ 2109
			} else if (makeOfCarSedan.equals("VAZ") || accessToVAZ2109VAZ21099 == 1) {
				System.out.print("\"VAZ2109\" or \"VAZ21099\"? or you can \"back\" to the privous menu\n");
				System.out.print("> ");
				modelOfCarSedan = keyboard.next();
			} else if (makeOfCarSedan.equals("back")) {
				accessToSUVSedan = 1;
				typeOfCar = "";
				accesToBMWVAZ = 0;
				makeOfCarSUV = "";
				modelOfCarSUV = "";
				continue;
			}
			if (modelOfCarSedan.equals("5")) {
				System.out.print(modelOfCarSedan + " is very stylish and modern car. You will love it for sure!\n");
				endofGame = true;
			} else if (modelOfCarSedan.equals("3")) {
				System.out.print(modelOfCarSedan + " is also stylish as 5 series but a little smaller. Sporty car!\n");
				endofGame = true;
			} else if (modelOfCarSedan.equals("back")) {
				accessTo5series3series = 0;
				typeOfCar = "";
				accesToBMWVAZ = 1;
				makeOfCarSUV = "";
				modelOfCarSUV = "";
				continue;
			}
			if (modelOfCarSedan.equals("VAZ2109")) {
				System.out.print(modelOfCarSedan + "!!!! Are you serious? Work harder and buy something different!\n");
				endofGame = true;
			} else if (modelOfCarSedan.equals("VAZ21099")) {
				System.out.print("Are you serious?" + modelOfCarSedan + "!!! Stay away from VAZ cars!!!");
				endofGame = true;
			} else if (modelOfCarSedan.equals("back")) {
				accessToVAZ2109VAZ21099 = 0;
				typeOfCar = "";
				accesToBMWVAZ = 1;
				makeOfCarSUV = "";
				modelOfCarSUV = "";
				continue;
			}
		} while (endofGame == false);
	}
}
