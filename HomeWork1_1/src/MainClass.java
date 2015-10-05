import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Enter something here : ");
	    
		   String sInput;
	     
	       Scanner scanIn = new Scanner(System.in);
	       sInput = scanIn.nextLine();
	       scanIn.close();            

	       int value = Integer.parseInt(sInput);
	       int factorial = 1;
	       
	       for (int i=1; i <= value; i++) {
	    	   
	    	   factorial = factorial * i; 
	    	   
	       }
	       
	       System.out.println(factorial);

	}

}
