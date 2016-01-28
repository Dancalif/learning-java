
public class ContainsTest {

	public static void main(String[] args) {
		String myFirstStringVar = "Hello World again!";
		String mySecondStringVar = "H";
		
		if (myFirstStringVar.contains(mySecondStringVar)){
			boolean i = myFirstStringVar.contains(mySecondStringVar);
			System.out.println(i);
			System.out.println("The string conatains the substring");
		}
	}

}
