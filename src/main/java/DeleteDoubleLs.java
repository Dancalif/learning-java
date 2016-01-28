
public class DeleteDoubleLs {
	public static void main(String[] args) {

		char[] myArray = new char[args.length];
		boolean DoubleCharFlag = false;
		int m = 0;
		char[] resultArray;

		// Checking if any chars were entered
		if (myArray.length > 0) {
			// Loop through the elements of array
			for (int i = 0; i < args.length; i++) {
				resultArray = new char[args[i].length()];
				char[] tempCharArray = args[i].toCharArray();
				// Loop through the chars of each element in array
				for (int j = 0; j < args[i].length() - 1; j++) {
					// Master char to compare
					char masterChar = tempCharArray[j];
					// Counter to get next char in array element
					int k = j + 1;
					// Next char after Master one to compare with
					char nextChar = tempCharArray[k];
					// Comparing
					if (masterChar != nextChar) {
						resultArray[m] = masterChar;
						m++;
						// Flag to control if no doubles were found
						DoubleCharFlag = true;
						System.out.println(
								"The not equal characters are: " + tempCharArray[j] + " and " + tempCharArray[k]);
					}
				}
			}
		} else {
			System.out.println("Please enter any characters to validate");
		}
		if (DoubleCharFlag == false) {
			System.out.println("No doubles were found!");
		} else {
			System.out.println("There are duplicates");
		}
	}
}
