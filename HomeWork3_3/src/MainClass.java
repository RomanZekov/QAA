import java.util.ArrayList;

public class MainClass {

	public static void main (String [] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
	
		list1.add("Hi");
		list1.add("name");
		list1.add("lucky boy");
		list1.add("fortran");
		list1.add("megiddo");
		list1.add("ooooo");
		list1.add("45gh");
		list1.add("hhhhh");
		list1.add("aaaaa");
		
		list2.add("aaaaa");
		list2.add("hhhh");
		list2.add("megiddo");
		list2.add("Megiddo");
		list2.add("name");
		list2.add("jjjjj");
		list2.add("popopo");
		list2.add("rtrtrt");
		list2.add("mmm");
		list2.add("NaN");
	
		if ( (list1.size() == list2.size() ) && list1.size() > 0 ) {
			
			int count = 0;
			
			for ( String str : list2) {
				
				if ( list1.contains(str) ) { count++; }
				
			}
			
			System.out.println("Number of equal elements in the lists is: " + count);
			System.out.println("Number of non equal elements in the lists is: " + ( list1.size() - count ));
		
		} else { 
			
			if ( list1.size() > 0 && list2.size() > 0 ) {
				
				int count = 0;
				
				for ( String str : list2) {
					
					if ( list1.contains(str) ) { count++; }
					
				}
				
				System.out.println("Number of elements in the list1 which are equal with elements from the list2 is: " + count);
				System.out.println("Number of elements in the list1 which are non equal with elements from the list2 is: " + ( list1.size() - count ));
				System.out.println("");
				
				count = 0;
				
				for ( String str : list1) {
					
					if ( list2.contains(str) ) { count++; }
					
				}
				
				System.out.println("Number of elements in the list2 which are equal with elements from the list1 is: " + count);
				System.out.println("Number of elements in the list2 which are non equal with elements from the list1 is: " + ( list2.size() - count ));				
				
			}
						
		}
	
	}
	
	
}
