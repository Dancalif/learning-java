
public class EqualsReference {

	public static void main(String[] args) {
		
		String myFirstStringVar = "Hello";
		String mySecondStringVar = "Hello";
		String myThirdStringVar = new String("Hello");
		String myFourthStringVar = new String("Hello");
		
		if (myFirstStringVar == mySecondStringVar); {
			System.out.println("References are equal");
		}
		
		if (!(myFirstStringVar == myThirdStringVar)); {
			System.out.println("References are not equal");
		}
		
		if (!(myThirdStringVar == myFourthStringVar)); {
			System.out.println("References are not equal");
		}
		
		}
	}