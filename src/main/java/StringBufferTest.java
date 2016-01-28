
public class StringBufferTest {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello");
		
//		sb.append("again");
		
		//sb.insert(0, "Hello ");
		
		//sb.replace(0, 5, "Privet");
		sb.ensureCapacity(9);
	
		System.out.println(sb.capacity());
		
		
		
//		String sbString = new String("Hello World ");
//		
//		sbString.concat("again");
//		
//		System.out.println(sbString);
//		
		

	}

}
