public class FizzBuzz {
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("Fizz/3_Buzz/5");
			} else if (i % 3 == 0) {
				System.out.println("Fizz/3");
			} else if (i % 5 == 0) {
				System.out.println("Buzz/5");
			} else {
				System.out.println(i);
			}
		}
	}
}