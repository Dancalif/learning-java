
import java.util.Scanner;

public class SelectaCar {

	//static 
	static String vehicleType = "";
	static String vehicleMaker = "";
    static String vehicleModel = "";
    static Boolean blnExit = false;
    static Boolean blnFinal = false;
    
	
    public static void main( String[] args ){
    
    Scanner readLine = new Scanner(System.in) ;
    int counter = 1;
    
   do {
  
    	innerLoop: do {
    	
    	if (vehicleType.equals("")){
    		System.out.println("Please Enter Vehicle Type (SUV or SEDAN)");
    		vehicleType = readLine.nextLine(); 
    	}
    		
    	if (vehicleType.toUpperCase().equals("BREAK")){
    		vehicleType = "";
    		break innerLoop;
    	}
    	
    	if (vehicleMaker.toUpperCase().equals("")){
    	    System.out.println("Please Enter Vehicle Maker(HONDA,TOYOTA or enter BREAK to set vehicle type again)");	
    		 vehicleMaker = readLine.nextLine();
    	}
    	
    	if (vehicleMaker.toUpperCase().equals("BREAK")){
     		vehicleType = "";
     		vehicleMaker = "";
     		break innerLoop ;		
    	}
    	
    	if (vehicleMaker.toUpperCase().equals("HONDA")){
    	// System.out.println("Please Enter Vehicle Maker (HONDA,TOYOTA or BREAK to enter type again)");	
    	 	 if (vehicleType.toUpperCase().equals("SUV")){
    	 		System.out.println("Please Enter Vehicle Model (PILOT OR CRV. Enter BREAK to set vehicle maker again)");
    	 		vehicleModel = readLine.nextLine();  		
    	 	
    	 	 } else {
     	 	
    	 		System.out.println("Please Enter Vehicle Model (ACCORD OR CIVIC. Enter BREAK to set vehicle maker again)");
     	 		vehicleModel = readLine.nextLine(); 
    	 	 }
    	 	 
    	 	if (vehicleModel.toUpperCase().equals("BREAK")){
    	 		vehicleMaker = "";
    	 		break innerLoop ;
    	 		
    	 	}else{
    	 		
    	 		System.out.println("Congratulations! " + vehicleMaker + " " +vehicleModel + " is a great " + vehicleType  );
    	 	    blnExit = true;
    	 	    blnFinal = true;
    	 	   // break innerLoop;
    	 	}
    	 	
    		
    	} else {  //TOYOTA
    		
   	 	 if (vehicleType.toUpperCase().equals("SUV")){
   	 		System.out.println("Please Enter Vehicle Model (4RUNNER OR RAV4. Enter BREAK to set vehicle maker again)");
   	 		vehicleModel = readLine.nextLine();  		
   	 	 } else {
    	 	System.out.println("Please Enter Vehicle Model (CAMRY OR COROLLA. Enter BREAK to set vehicle maker again)");
    	 	vehicleModel = readLine.nextLine(); 
   	 	 }
   	 	 
   	 	if (vehicleModel.toUpperCase().equals("BREAK")){
   	 		vehicleMaker = "";
   	 		//break;
   	 	}else{
   	 	 System.out.println("Congratulations! " + vehicleMaker + " " + vehicleModel   + " is a great " + vehicleType  );
	 	 blnExit = true;
	 	 blnFinal = true;
   	 	}
    		
    	}
    	
    	
    	// Infinite loop protector exits after 15 loops
    	if (counter > 15){
	 	    blnExit = true;
	 	    blnFinal = true;	
    	}
    
    	counter ++;
    	//inner loop
      } while (blnExit == false);
          
     // outer loop
    } while (blnFinal == false);
       
    readLine.close(); 
 
    System.out.println( "_____________________THE END_____________________" );
    	
 
    
    }
}

