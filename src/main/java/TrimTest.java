
public class TrimTest {

	public static void main(String[] args) {
		String myFirstStringVar = " Start";
		String mySecondStringVar = "End ";
		String myThirdStringVar = " StartEnd ";
		
		System.out.println("*" + myFirstStringVar.trim());
		System.out.println(mySecondStringVar.trim() + "*");
		System.out.println("*" + myThirdStringVar.trim() + "*");

		}
	}