import java.util.Random;

public class MainClass {

	static int[][] matrix = new int[6][7];
	
	public static void fillMatrix( int[][] matrix1 ) {
		
		for ( int i = 0; i < 6; i++ ) {
			
			for ( int j = 0; j < 7; j++ ) {
				
				Random r = new Random();
				matrix1[i][j] = r.nextInt(10);
				
			}
		}
		
	}
	
	public static void printMatrix( int[][] matrix1 ) {
		
		for ( int i = 0; i < 6; i++ ) {
			
			for ( int j = 0; j < 7; j++ ) {
				
				System.out.print(matrix[i][j]+ " ");				
		
			}
			
			System.out.println();
			
		}	
	}
	
	public static boolean checkThatFirstElementIsMax( int[][] matrix1, int x ) {
		
		int max = matrix1[x][0];
		boolean b = true;
		
		for (int i = 0; i < 6; i++ ) {
			
			if ( max < matrix1[x][i+1] ) {
				
				b = false;
				break;
				
			}
			
		}
	
		return b;
	}
	
	public static void modifyMatrix( int[][] matrix1 ) {
		
		for ( int i = 0; i < 6; i++ ) {
			
			for ( int j = 0; j < 7; j++ ) {
				
				
		
			}
			

			
		}
		
	}
	
	public static void main(String[] args) {
		
		fillMatrix( matrix );
		printMatrix( matrix );

	}

}
