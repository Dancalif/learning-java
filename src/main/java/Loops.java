

public class Loops {
	public static void main(String[] args) {

		int[][] myArray = new int[4][9];

		int numofRows = myArray.length;
		int numofColumns = myArray[0].length;

		for (int i = 0; i < numofRows; i++) {
			for (int j = 0; j < numofColumns; j++) {
				myArray[i][j] = j;
			}
		}

		for (int i = 1; i < numofRows; i = i + 2) {
			for (int j = 2; j < numofColumns; j = j + 3) {
				myArray[i][j] = myArray[i][j] * 3;
			}
		}

		for (int i = 0; i < numofRows; i++) {
			for (int j = 0; j < numofColumns; j++) {
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println();
		}

	}
}