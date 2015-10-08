import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		String numStr;
		
		System.out.print("Enter a number: " ); 
		numStr = input.nextLine();
		input.close();
		
		int sum = 0;
		
		for (int i = 0; i < numStr.length(); i++) {
			
			int x = Integer.parseInt(numStr.substring(i,i+1));
			
			sum = sum + x; 
			
		}
		
		System.out.println("Value is :" + sum );

	}

}
