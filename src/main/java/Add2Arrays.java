
public class Add2Arrays {
	public static void main(String[] args) {
	
	String[] strArray1 = {"Dan", "Pavel", "Ivan"};
	String[] strArray2 = {"Misha", "Katya", "Sergey", "Oleg", "Maximus"};
	
	String[] strArray3 = new String[strArray1.length + strArray2.length];
	
	System.arraycopy(strArray1, 0, strArray3, 0, strArray1.length);
	System.arraycopy(strArray2, 0, strArray3, strArray1.length, strArray2.length);
	
	//strArray1 = strArray2;
	//strArray2[0] = "Lesya";
}

}