import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		
		//a[i][y]= new Random().nextInt((99 - 10)+1) + 10;
		
		int[] a1;
		int[] a2;
		int[] a3;
		int[] a4;
		int[] a5;
		
		a1 = new int[10];
		a2 = new int[10];
		a3 = new int[10];
		a4 = new int[10];
		a5 = new int[10];
		
		PopulateArray( a1 );
		PopulateArray( a2 );
		PopulateArray( a3 );
		PopulateArray( a4 );
		PopulateArray( a5 );
		
		PrintArray( a1 );
		PrintArray( a2 );
		PrintArray( a3 );
		PrintArray( a4 );
		PrintArray( a5 );

	}
	
	public static void PopulateArray ( int [] array) {
		
		for (int i =0; i < array.length; i++) {
			
			array[i] = new Random().nextInt((99 - 10)+1) + 10;
			
		}
		
	}

	public static void PrintArray ( int [] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			if ( i == array.length - 1 ) System.out.println(array[i]);
				
			else System.out.print(array[i] + " ");
			
		}
		
	}

}
