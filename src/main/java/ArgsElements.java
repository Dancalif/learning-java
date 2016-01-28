
public class ArgsElements {

	public static void main(String[] args) {

		String[] resultArray = new String[args.length];

		for (int i = 0; i < args.length; i++) {
			char[] tempCharArray = args[i].toCharArray();
			resultArray[i] = "";
			for (int j = 0; j < args[i].length(); j++) {
				resultArray[i] = resultArray[i] + tempCharArray[j];
			}
			System.out.println(resultArray[i]);
		}
	}
}