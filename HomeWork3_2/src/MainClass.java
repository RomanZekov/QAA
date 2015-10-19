import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		
		//Замерить время добавления, поиска и удаления объектов из коллекции в LinkedList, ArrayList, TreeSet, HashSet.
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ArrayList<Integer> al  = new ArrayList<Integer>();
		TreeSet<Integer> ts	  = new TreeSet<Integer>();
		HashSet<Integer> hs    = new HashSet<Integer>();
		
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			
			ll.add( i );
			
		}
		
		long stopTime = System.currentTimeMillis();
		
		long elapsedTime = stopTime - startTime;
		
	    System.out.println("Time to adding 10000 elements to LinkedList took : " + elapsedTime + " ms" );
	    
//---------------------------------------------------		
	    startTime = System.currentTimeMillis();

	    int randomInt = ll.get(458);
	    
		stopTime = System.currentTimeMillis();
		
		elapsedTime = stopTime - startTime;
		
	    System.out.println("Time to find one element in LinkedList took : " + elapsedTime + " ms" );


//---------------------------------------------------		
	    startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			
			ll.remove( 9999 - i ) ;
			
		}
		
		stopTime = System.currentTimeMillis();
		
		elapsedTime = stopTime - startTime;
		
	    System.out.println("Time to remove 10000 elements from LinkedList took : " + elapsedTime + " ms" );

//---------------------------------------------------
	    
	    startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			
			al.add( i );
			
		}
		
		stopTime = System.currentTimeMillis();
		
		elapsedTime = stopTime - startTime;
		
		System.out.println();
		System.out.println("Time to adding 10000 elements to ArrayList took : " + elapsedTime + " ms" );
	    
//---------------------------------------------------		
	    startTime = System.currentTimeMillis();

	    int randomInt1 = al.get(458);
	    
		stopTime = System.currentTimeMillis();
		
		elapsedTime = stopTime - startTime;
		
	    System.out.println("Time to find one element in ArrayList took : " + elapsedTime + " ms" );


//---------------------------------------------------		
	    startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			
			al.remove( 9999 - i ) ;
			
		}
		
		stopTime = System.currentTimeMillis();
		
		elapsedTime = stopTime - startTime;
		
	    System.out.println("Time to remove 10000 elements from ArrayList took : " + elapsedTime + " ms" );

	    
//---------------------------------------------------
	    
//---------------------------------------------------
		startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			
			ts.add( i );
			
		}
		
		stopTime = System.currentTimeMillis();
		
		elapsedTime = stopTime - startTime;
		
		System.out.println();
		System.out.println("Time to adding 10000 elements to TreeSet took : " + elapsedTime + " ms" );
	    
//---------------------------------------------------		
	    startTime = System.currentTimeMillis();

	    Iterator<Integer> it = ts.iterator();
	    int k = 0;
	    Integer current = null;
	    while(it.hasNext() && k < 459) {
	       current = it.next();
	       k++;
	    }
	    
		stopTime = System.currentTimeMillis();
		
		elapsedTime = stopTime - startTime;
		
	    System.out.println("Time to find one element in TreeSet took : " + elapsedTime + " ms" );


//---------------------------------------------------		
	    startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			
			ts.remove( 9999 - i ) ;
			
		}
		
		stopTime = System.currentTimeMillis();
		
		elapsedTime = stopTime - startTime;
		
	    System.out.println("Time to remove 10000 elements from TreeSet took : " + elapsedTime + " ms" );
//---------------------------------------------------
	    
//---------------------------------------------------
	    
	    startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			
			hs.add( i );
			
		}
		
		stopTime = System.currentTimeMillis();
		
		elapsedTime = stopTime - startTime;
		
		System.out.println();
		System.out.println("Time to adding 10000 elements to HashSet took : " + elapsedTime + " ms" );
	    
//---------------------------------------------------		
	    startTime = System.currentTimeMillis();

	    Iterator<Integer> it1 = hs.iterator();
	    k = 0;
	    current = null;
	    while(it1.hasNext() && k < 459) {
	       current = it1.next();
	       k++;
	    }
	    
		stopTime = System.currentTimeMillis();
		
		elapsedTime = stopTime - startTime;
		
	    System.out.println("Time to find one element in HashSet took : " + elapsedTime + " ms" );


//---------------------------------------------------		
	    startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			
			hs.remove( 9999 - i ) ;
			
		}
		
		stopTime = System.currentTimeMillis();
		
		elapsedTime = stopTime - startTime;
		
	    System.out.println("Time to remove 10000 elements from HashSet took : " + elapsedTime + " ms" );
//---------------------------------------------------
		

	}

}
