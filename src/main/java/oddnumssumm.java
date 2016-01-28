public class oddnumssumm {
	public static void main(String[] args) {

		int total = 0;
		int ourArray[] = {};

		for (int i = 0; i <= ourArray.length - 1; i++) {
			if (ourArray[i] % 2 != 0) {
				total = ourArray[i] + total;
			}
		}
		System.out.print("The summ is " + total);
	}
}
