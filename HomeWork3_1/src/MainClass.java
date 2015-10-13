import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public enum Cars {
		
		NISSAN,
		SUZUKI,
		BMW,
		OPEL,
		SUBARU,
		OKA,
		TOYOTA
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		List<Cars> al1 = new ArrayList<Cars>();
		
		Cars allCars[] = Cars.values();
		
		al1 = Arrays.asList(Cars.values());
		
		for (Cars car : allCars) {
			
			al.add(car.toString());
			
		}
		
		Collections.sort(al);
		//al.sort();
		
		for ( int i = 0; i < al.size(); i++ ) {
			
			System.out.println(al.get(i));
			
		}

	}

}
