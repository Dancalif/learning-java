
public class NoSecondElement {

	public static void main(String[] args) {

		String intialText = "Delete second word from sentence";

		String[] intialTextArray = intialText.split(" ");

		String textFinalResult = "";

		for (int i = 0; i < intialTextArray.length; i++) {
			if (i != 1) {
				// textFinalResult = String.join(" ", textFinalResult,
				// intialTextArray[i]).trim();
			}
		}

		// String[] resultArray = new String[args.length];
		//
		// for (int i = 0; i < args.length; i++) {
		// char[] tempCharArray = args[i].toCharArray();
		// resultArray[i] = "";
		// for (int j = 0; j < args[i].length(); j++) {
		// resultArray[i] = resultArray[i] + tempCharArray[j];
		// }
		// System.out.println(resultArray[i]);
		// }
	}
}
