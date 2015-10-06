import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		int a, b, c; 
		double dis, x1, x2;
		
		Scanner input = new Scanner(System.in); 
		 
		System.out.print("Enter a: "); 
		a = input.nextInt(); 
		 
		System.out.print("Enter b: "); 
		b = input.nextInt(); 
		 
		System.out.print("Enter c: "); 
		c = input.nextInt(); 
		
		input.close();

		dis = Math.pow((b*b - 4*a*c), 0.5);
		System.out.println("Discriminant = "+ dis);
		 
		x1 = ((-1)*b+dis)/(2*a); 
		x2 = ((-1)*b-dis)/(2*a); 
		 
		System.out.println("x1 = "+ x1); 
		System.out.println("x2 = "+ x2);             

	}

}
