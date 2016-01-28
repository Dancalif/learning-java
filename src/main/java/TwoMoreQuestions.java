import java.util.Scanner;

public class TwoMoreQuestions {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("%40s", "TWO MORE QUESTIONS!");
		System.out.print("Think of something and I'll try to guess it!");
		
		System.out.print("\n\n Does it stay inside or outside or both?");
		String insideOutsideBoth = keyboard.nextLine();
		System.out.print("\n Is it a living thing?");
		String livingThing = keyboard.nextLine();
		
		if (insideOutsideBoth.equals("inside") && livingThing.equals("alive"))
			System.out.print("\n houseplant");
		if (insideOutsideBoth.equals("inside") && livingThing.equals("not alive"))
			System.out.print("\n shower curtain");
		if (insideOutsideBoth.equals("outside") && livingThing.equals("alive"))
			System.out.print("\n bison");
		if (insideOutsideBoth.equals("outside") && livingThing.equals("not alive"))
			System.out.print("\n billboard");
		if (insideOutsideBoth.equals("booth") && livingThing.equals("alive"))
			System.out.print("\n dog");
		if (insideOutsideBoth.equals("both") && livingThing.equals("not alive"))
			System.out.print("\n cell phone");
	}
}