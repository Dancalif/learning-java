public class DistanceFormula{
	public static void main( String[] args ){
		
		System.out.println(" (-2,1) to (1,5) => " + distance(-2,1,1,5) );
		System.out.println(" (-2,-3) to (-4,4) => " + distance(-2,-3,-4,4) );
		System.out.println(" (2,-3) to (-1,-2) => " + distance(2,-3,-1,-2) );
		System.out.println(" (4,5) to (4,5) => " + distance(4,5,4,5) );
	}

	public static double distance( int x1, int y1, int x2, int y2 )
	{
		double A;
		A = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		return A;
	}
}