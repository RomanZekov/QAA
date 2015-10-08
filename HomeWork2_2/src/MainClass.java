
public class MainClass {

	public static void main(String[] args) {
		
		int[] array1 = {5,3,7,2,11,34,9,1,23,12};
		
		SortArray(array1);
		
		PrintArray(array1);
		
	}

	
	public static void SortArray ( int [] array) {
		
		for (int i = 0; i < array.length; i++ ) {
			
			for (int j = 0; j < array.length - i - 1; j++) {
				
				if (array[j] > array[j + 1]) {
					
					int x = array[j + 1];
					array[j + 1] = array[j];
					array[j] = x;
					
				}
				
			}
			
		}
		
	}
	
	public static void PrintArray ( int [] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + " ");
		}
		
	}
}
