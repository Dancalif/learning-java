import java.util.Scanner;

public class YourOwnAdventure {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.printf("%50s", "WELCOME TO MITCHEL'S TINY ADVENTURE!");

		System.out.print("\n\n You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"?");
		String kitchenUpstairs = keyboard.nextLine();

		if (kitchenUpstairs.equals("kitchen")) {
			System.out.print("\n There is a long countertop with dirty dishes everywhere. Off to one side "
					+ "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or look "
					+ "in a \"cabinet\".");
		String refrigeratorCabinet = keyboard.nextLine();
		if (refrigeratorCabinet.equals("refrigerator")) {
			System.out.print("\n Inside the refrigerator you see food and stuff. It looks pretty nasty. "
					+ "Would you like to to eat some of the food? (\"yes\" or \"no\")");
			String fridgeYesNo = keyboard.nextLine();
			if (fridgeYesNo.equals("no")) {
				System.out.print("\n You die of starvation... eventually");
			} else {
				System.out.print("\n How about to die because of spoiled food? :)");
			}
		} else if (refrigeratorCabinet.equals("cabinet")) {
			System.out.print(
					"\n It's really cold here. You see some dirty clouth in cabinets. Would you wear them? (\"yes\" or \"no\").");
			String cabinetYesNo = keyboard.nextLine();
			if (cabinetYesNo.equals("yes")) {
				System.out.print("\n You would be fine and warm even in dirty clouth");
			} else if (cabinetYesNo.equals("no")) {
				System.out.print("\n It would be tough to survive in such cold weather.");
			}
		}
		} else if (kitchenUpstairs.equals("upstairs")) {
			System.out.print("\n Upstairs you see the hallway. At the end of the hallway is a master \"bedroom\". There is also"
					+ "a \"bathroom\" off the hallway. Where would you like to go?");
			String bedroomBathroom = keyboard.nextLine();
			if (bedroomBathroom.equals("bedroom")) {
				System.out.print("\n There is a closet. Yous see the pillows inside. Would you like to take a nap? (\"yes\" or \"no\")");
				String bedroomYesNo = keyboard.nextLine();
					if (bedroomYesNo.equals("yes")) {
						System.out.print("\n Take a nap and you will be fine soon");
					} else {
						System.out.print("\n Sorry dude. There are some pillows. You are tired and need to take a nap! But you said NO!");
					}
			} else if (bedroomBathroom.equals("bathroom")) {
				System.out.print("\n There is a bath. Would you like to take a warm bath? (\"yes\" or \"no\")");
				String bathroomYesNo = keyboard.nextLine();
				if (bathroomYesNo.equals("yes")) {
					System.out.print("\n Perfect choice! I forgot to tell you there is a nice girl in a bath! Take your time! :)");
				} else {
					System.out.print("\n Sorry dude, forgot to tell you - there is a pretty girl in a bath... But you already said NO! :)");
					
				}
			}
		}
	}
}