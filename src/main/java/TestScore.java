// To validate the test score that is inserted as an Argument

public class TestScore {
	public static void main(String[] args) {
		
		double TestScoreArgs1;
		
//To validate if special or/and alphabetical chars are inserted
		try {
//Convert user's input into Double
			TestScoreArgs1 = Double.valueOf(args[0]);
//To catch the Exception error if conversion was wrong
		} catch (NumberFormatException e) {
//To stop execution
			System.out.println("Please, correct the Test Score! It must be the number!");
			System.exit(0);
		}

//Continue execution and convert user's input into Double
		 TestScoreArgs1 = Double.valueOf(args[0]);
		
//To check if score is in valid range
		if (TestScoreArgs1 < 0 || TestScoreArgs1 > 100)
			System.out.println("Please, correct the Test Score! The number must be between 0 and 100!");
		else if (TestScoreArgs1 >= 90)
			System.out.println("Your score is A");
		else if (TestScoreArgs1 >= 80)
			System.out.println("Your score is B");
		else if (TestScoreArgs1 >= 70)
			System.out.println("Your score is C");
		else if (TestScoreArgs1 >= 60)
			System.out.println("Your score is D");
		else if (TestScoreArgs1 < 60)
			System.out.println("Your score is F. Please, improve your knowledge and take a test again.");

	}

}
