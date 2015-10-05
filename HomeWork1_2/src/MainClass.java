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
	    
	    
	    
	    System.out.println(sFirst + " : " + sSecond);
		
	}

}
