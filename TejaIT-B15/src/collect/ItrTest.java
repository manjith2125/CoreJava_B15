package collect;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ItrTest {

	public void iteratoTest() {
		
		//ArrayList<Integer> al=new ArrayList<Integer>();
		List<Integer> al=new ArrayList<Integer>();
					  al.add(10);
					  al.add(20);
					  al.add(30);
					  al.add(40);
		Iterator<Integer> itr=al.iterator(); // This helps us to call the value.. this is given by java  from util package..
		
		// When we dont know how many iterations we have... so use while loop..
		
		while(itr.hasNext()) { // this HasNext will check for presence of element .. it returns BOOLEAN
			
			System.out.println(itr.next());
			
			
		}
		
		
		
		
	}
	
	// Now 
	 public void ListIteratorTest() {
		 
		 
		 List<Integer> al=new ArrayList<Integer>();
		  al.add(10);
		  al.add(20);
		  al.add(30);
		  al.add(40);
		  // It TRAVERSE data from FORWARD to BACKWARD direction .. 
		  
	ListIterator<Integer> ltr=al.listIterator();
	
	// This while loop will excute in forward direction using HAS NEXT and NEXT..
	
	while(ltr.hasNext()) {
		System.out.println(ltr.next());
		
	}
	
	System.out.println("========================================");
	// This while loop will excute in BACKWARD DIRECTIONS using HAS PRECIOUS and PREVIOUS..
	
	while(ltr.hasPrevious()) {
		
		System.out.println(ltr.previous());
	}
		 // Note:- Without FORWARD execution their will be no BACKWARD execution of the code.. 
	 }
	 
	 public void enumerationTest() {
		 
		 Vector<String> v=new Vector<String>();
		 
		 v.add("Manjith");
		 v.add("Yeshu..");
		 v.add("Yassen");
		 
		Enumeration<String> en=v.elements();
		
		while(en.hasMoreElements()) {
			
			System.out.println(en.nextElement());
			
			
		}
		 
	 }

	
	
	
	public static void main(String[] args) {
		ItrTest it=new ItrTest();
		//it.iteratoTest();
		//it.ListIteratorTest();
		it.enumerationTest();
		
	}
}
