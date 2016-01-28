
public class InternTest {

	public static void main(String[] args) {
		String myFirstStringVar = "Hello";
		String mySecondStringVar = new String("Hello");

		String myThirdStringVar = mySecondStringVar.intern();

		if (myFirstStringVar == myThirdStringVar) {
			System.out.println("Both strings references are equal");
		} else {
			System.out.println("Strings references are not equal");

		}

	}

}