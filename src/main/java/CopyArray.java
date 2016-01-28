
public class CopyArray {
	public static void main(String[] args) {
	
	String[] strArray1 = {"Dan", "Pavel", "Ivan"};
	String[] strArray2 = new String[10];
	
	System.arraycopy(strArray1, 0, strArray2, 0, 3);
	strArray1 = strArray2;
	
	strArray2[0] = "Lesya";
}

}