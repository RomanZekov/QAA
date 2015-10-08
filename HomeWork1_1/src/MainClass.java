import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Enter a number : ");
	    
		   String sInput;
	     
	       Scanner scanIn = new Scanner( System.in );
	       sInput = scanIn.nextLine();
	       scanIn.close();            

	       int value = Integer.parseInt(sInput);
	       double factorial = 1;
	       
	       for (int i=1; i <= value; i++) {
	    	   
	    	   factorial = factorial * i ; 
	    	   
	       }
	       
	       System.out.println("Factorial of the entered number is: " + factorial);

	}

}
