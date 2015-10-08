
public class MainClass {

	public static void main(String[] args) {
		
		String [] array = {"First","Second","Third","Fifth","Fifth","Sixth","Seventh"}; //Fifth Fourth
		
		for ( int i = 0; i < array.length; i++ ) {
			
			for (int j = 0; j < array.length - i - 1; j++) {
				
				if ( array[j].compareTo( array[j + 1]) > 0 ) {
					
					String s = array[j + 1];
					array[j + 1] = array[j];
					array[j] = s;
					
				}
				
			}
			
		}
		
		PrintArray( array );

	}
	
	
	public static void PrintArray ( String [] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
		}
		
	}

}
