
public class Calculator {

	public static void main(String[] args) {

		char[] myArray = new char[args.length];

		if (myArray.length > 0) {
			for (int i = 0; i < args.length; i++) {
				char[] tempCharArray = args[i].toCharArray();
				// Loop through the chars of each element in array
				for (int j = 0; j < args[i].length() - 1; j++) {
					switch (tempCharArray[0]) {
					case '+':
						System.out.println("Budem skladyvat'");
						break;
					case '-':
						System.out.println("Budem otnimat'");
						break;
					case '/':
						System.out.println("Budem delit'");
					case '*':
						System.out.println("Budem umnozhat'");
					}
				}
			}

		}

	}
}