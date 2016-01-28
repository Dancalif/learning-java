import java.util.Arrays;

public class TestArray {
	public static void main(String[] args) {
		
		//Converting args into string
		String myString = Arrays.toString(args);
		//Creating array from the string above and split the chars
		String[] MyStringArray = myString.split("");
		//Erasing square braces [ ] that were added within Arrays.toString
		String[] myArray = Arrays.copyOfRange(MyStringArray, 1, MyStringArray.length - 1);
		
		String doubleLL = "ll";
		
		//Checking if any chars were entered
		if (myArray.length > 0)
		//i is a master element of array to compare
		for (int i = 0; i < myArray.length - 1; i++) {
			String firstL = myArray[i];
			//j is a next element of array after mester one
			int j = i + 1;
			String secondL = myArray[j];
			//Comparing i and j
			if ((firstL + secondL).equals(doubleLL))
			//The results to display in console if doubles were found
			System.out.println("The double l in " + myString + " are " + " found!");
			//else 
		}
		//Warning message if no chars were entered
		else System.out.println("Please, enter any characters into Arguments tab text field!");
		//To stop application in user friendly manner
		System.exit(0);
	}
}