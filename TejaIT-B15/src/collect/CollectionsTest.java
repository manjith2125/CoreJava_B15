package collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsTest {
	
	public static void main(String[] args) {
		
		
		List<Integer> list=new ArrayList<Integer>();
						list.add(30);
						list.add(40);
						list.add(10);
						list.add(20);
						
					// if we want them to be in SORTED form we can use COLLECTIONS.sort..
					
						
			Collections.sort(list);
			
			// If we them to be in reverse order first do sort and them reverse..
			
			Collections.reverse(list);
			
			for(Integer i:list) {
				System.out.println(i);
			}
			
			
			
	// if you to store array into object..
			Object[] objArr=list.toArray();
			
	      List<Object> objList=Arrays.asList(objArr);
	      
	  

			// ARRAYLIST.. HASHMAP.. SET.. are Asynchornized in nature ... if you them to behave as synchoronized use the followings...
				
		Map<Integer, String> map=new HashMap<Integer, String>(); // Till we followed this 
		Map<Integer, String> syncMap=Collections.synchronizedMap(map); // use this to make them sync..
		
	//	List<Integer> list=new ArrayList<Integer>();
		List<Integer> synsList=Collections.synchronizedList(list);
		
		
		Set<Integer> set=new HashSet<Integer>();
		Set<Integer> syncSet=Collections.synchronizedSet(set);
		
		
		// for un-modifications  of list/...
		
	List<Integer> unmodifyList=Collections.unmodifiableList(list);
		
			
			
						
	}

	
}
