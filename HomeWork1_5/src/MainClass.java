
public class MainClass {

	public static void main(String[] args) {
		
		int countGlobal = 0;
		
		for (int i = 1; i < 1000000; i++) {
			
			String formattedInt = String.format("%06d", i);
			
			int sum1 = 0;
			int sum2 = 0;
			
			for (int j = 0; j < 3; j++) {
				
				sum1  = sum1 + Integer.parseInt(formattedInt.substring(j,j+1));
				sum2  = sum2 + Integer.parseInt(formattedInt.substring(j+3,j+4));
				
			}
			
			if ( sum1 == sum2 ) { countGlobal++; } 
			
		}
		
		System.out.println("Number ov gifts is:" + countGlobal);

	}

}
