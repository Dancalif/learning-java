public class XsandYs{
	public static void main(String[] args){
		
		System.out.printf("%5s %10s \n", "x", "y");
		
		for (double i = -10; i <= 10; i = i + 0.5) {
			System.out.printf("\n %5.2f %10.2f", i, i*i);
		}
	}
}