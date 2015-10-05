import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		String sFirst;
		String sSecond;
		
		System.out.println("Enter the first number : ");
		Scanner scanIn = new Scanner( System.in );
	    sFirst = scanIn.nextLine();
	     
		System.out.println("Enter the second number : ");
	    sSecond = scanIn.nextLine();		
	    scanIn.close();
	    
	    int m = Integer.parseInt(sFirst);
	    int n = Integer.parseInt(sSecond);
	    
	    if ( ( 10 - m ) == ( 10 - n ) ) {
	    	
	    	System.out.println("Both entered numbers close to 10 becouse they are equal");
	    	
	    } else 
	    	if ( ( 10 - m ) > ( 10 - n ) ) {
	    		
	    		System.out.println("The closest number to 10 is: " + n);
	    		
	    	} else 
	    		
	    		{ 
	    			System.out.println("The closest number to 10 is: " + m); 
	    		}

	}

}
