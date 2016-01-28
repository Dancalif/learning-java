import java.util.Scanner;

public class CountingMachineRevisited {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Count from: ");
		int countFromNum = keyboard.nextInt();
		System.out.print("Count to: ");
		int countToNum = keyboard.nextInt();
		System.out.print("Count by: ");
		int countByNum = keyboard.nextInt();

		for (int i = countFromNum; i <= countToNum; i = i + countByNum) {
			System.out.print(i + " ");
		}
	}
}