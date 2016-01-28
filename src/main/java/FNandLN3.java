
public class FNandLN3 {
	public static void main(String[] args) {
		char[] charArrayFN = new char[5];
		charArrayFN[0] = 'D';
		charArrayFN[1] = 'e';
		charArrayFN[2] = 'n';
		charArrayFN[3] = 'i';
		charArrayFN[4] = 's';
				
		char[] charArrayLN = new char[7];
		charArrayLN[0] = 'U';
		charArrayLN[1] = 'm';
		charArrayLN[2] = 'a';
		charArrayLN[3] = 'n';
		charArrayLN[4] = 'e';
		charArrayLN[5] = 't';
		charArrayLN[6] = 's';
	
		//System.out.println(charArrayFN[0] + " " + charArrayFN[1] + " " + charArrayFN[2] + " " + charArrayFN[3] + " " + charArrayFN[4]);
		//System.out.println(charArrayLN[0] + "" + charArrayLN[1] + charArrayLN[2] + charArrayLN[3] + charArrayLN[4] + charArrayLN[5] + charArrayLN[6]);
	String.copyValueOf(charArrayFN);
	String.copyValueOf(charArrayLN);
	//System.out.print(String.copyValueOf(charArrayFN));
	//System.out.print(String.copyValueOf(charArrayLN));
	
	System.out.print(String.copyValueOf(charArrayFN) + "\n" + (String.copyValueOf(charArrayLN)));
	

	}

}