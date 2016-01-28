
public class FirstVar {
	public static void main(String[] args) {

		// Declaration and Init

		char a = '1';
		int b = 0, b1 = 1, b2 = 5;
		boolean c = false;
		String str2 = "sting 2";
		double doubVar = 123456789.12323123d;

		// Data Type Convert

		int ConvertDoubtoInt = (int) doubVar;
		double ConvertInttoDoub = b;

		String str3 = String.valueOf(b2);
		String str4 = "567";
		int b3 = Integer.valueOf(str4);

		// System.out.println(b3);
		// System.out.println(b);
		// System.out.println(c);

		// String str = "Bsjkdhfjsdhfjsdhfsjd %d dsgfhjsdgfhdjsgfjhsdgf %d
		// kjhkfjdhg %d %c";
		// System.out.println(String.format(str, b, b1, b2, a));

		// Task with ARGS

		int intArg1 = Integer.valueOf(args[0]);
		int intArg2 = Integer.valueOf(args[1]);

		int intArg3 = intArg1 + intArg2;

		System.out.println("The total of two args will be " + intArg3);

		System.out.println("The sum of two args will be " + 
		(Integer.valueOf(args[1]) + Integer.valueOf(args[0])));
		
		System.out.println("The result of vychitaniya will be " + (Integer.valueOf(args[1]) - Integer.valueOf(args[0])));
		
		System.out.println("The result of deleniya will be " + (Integer.valueOf(args[1]) / Integer.valueOf(args[0])));
		
		System.out.println("The result of umnozheniya will be " + (Integer.valueOf(args[1]) * Integer.valueOf(args[0])));

	}
}
