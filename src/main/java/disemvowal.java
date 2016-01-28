public class disemvowal {
	public static void main(String[] args) {

		String myText = "mamama";
		String myVowels = "aeiou";
		String finalString = "";

		char[] myArray = myText.toCharArray();
		char[] vowelsArray = myVowels.toCharArray();

		for (int i = 0; i < myArray.length; i++) {
			int count = 0;
			for (int j = 0; j < vowelsArray.length; j++)
				if (myArray[i] != vowelsArray[j]) {
					count++;
					if (count == vowelsArray.length) {
						finalString = finalString + myArray[i];
					}
				}
		}
		System.out.print(finalString);
	}
}
