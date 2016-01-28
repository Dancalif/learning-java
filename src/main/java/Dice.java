import java.util.Random;

public class Dice {
	public static void main(String[] main) {
		
		Random r = new Random();
		int r1 = (1 + r.nextInt(6));
		int r2 = (1 + r.nextInt(6));
		
		System.out.printf("%30s", "HERE COMES THE DICE!!!");
		System.out.print("\n Roll #1: " + r1);
		System.out.print("\n Roll #2: " + r2);
		System.out.print("\n The total is " + (r1 + r2));
		
	}
}