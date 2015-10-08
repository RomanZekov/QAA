import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		
		int Low = 10;
		int High = 100;
		int[] array;
		boolean isSeq = false;
		
		array = new int[4];
		
		for (int i = 0; i < array.length; i++ ) {
		
			Random r = new Random();
			array[i] = r.nextInt(High-Low) + Low;
			
		}
		
		
		for (int i = 0; i < array.length; i++ ) {
			
			System.out.print(array[i] + " ");			
			
		}
		
		System.out.println();
		
		if ( array[0] < array[1]) {
			
			if ( array[1] < array[2]) {
				
				if ( array[2] < array[3]) {
					
					System.out.println("The array is an increasing sequence.");
					isSeq = true;
					
				}  
				
			} 
			
		} 
		
		if ( !isSeq ) { System.out.println("The array is not an increasing sequence."); }

		
	}

}
