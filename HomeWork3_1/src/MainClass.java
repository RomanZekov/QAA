import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
	
	public enum Cars {
		
		WV ("WV"),
		SUBARU ("SUBARU"),
		BMW ("BMW"),
		NISSAN ("NISSAN"),
		TOYOTA ("TOYOTA"),
		GMC ("GMC"),
		OKA ("OKA");
		
		private final String str;
		
		Cars (String str) {
	        
			this.str = str;
	        
	    }
		
		private String getStr() { return str; }
		
	}
	

	public static void main(String[] args) {
		
		Cars allCars[] = Cars.values();
		ArrayList al = new ArrayList<Integer>();
		
		for (Cars i : allCars ) {
			
			al.add(i.getStr());
			
		}
		
		//al.sort(null);
		Collections.sort(al);
		
		for ( int i = 0; i < al.size(); i++ ) {
		      
			System.out.println(al.get(i));
			
		}

	}

}
