
public class Concat {

	public static void main(String[] args) {
		String myFirstStringVar = "Hello";
		String mySecondStringVar = "";
		String myThirdStringVar = "Hello";
		
		System.out.println(myFirstStringVar.concat(myThirdStringVar));
		
		mySecondStringVar = myFirstStringVar.concat(myThirdStringVar);
		
		System.out.println(mySecondStringVar);

		}
	}
