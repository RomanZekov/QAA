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
		
		for (int i = 0; i < 7; i++ ) {
			
			if ( max < matrix1[x][i+1] ) {
				
				b = false;
				break;
				
			}
			
		}
	
		return b;
	}
	
	
	public static void SortMatrixRow ( int [][] matrix1, int x) {
		
		for (int i = 0; i < 7; i++ ) {
			
			for (int j = 0; j < 7 - i - 1; j++) {
				
				if ( matrix1[x][j] > matrix1[x][j + 1]) {
					
					int t = matrix1[x][j + 1];
					matrix1[x][j + 1] = matrix1[x][j];
					matrix1[x][j] = t;
					
				}
				
			}
			
		}
		
	}	
	
	public static void modifyMatrix( int[][] matrix1 ) {
		
		for ( int i = 0; i < 6; i++ ) {
			
			for ( int j = 0; j < 7; j++ ) {
				
				if ( !checkThatFirstElementIsMax(matrix1, i) ) {
					
					SortMatrixRow( matrix1, i);
					
				}
		
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		fillMatrix( matrix );
		printMatrix( matrix );
		
		System.out.println();
		System.out.println("Output matrix");
		System.out.println();
		
		modifyMatrix( matrix );
		printMatrix( matrix );
		


	}

}
