package collect;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;



public class SetTest {
	public void hashSetTest() {
		
		
		Set<Integer> set=new HashSet<Integer>();
		
		set.add(100);
		set.add(172);
		set.add(143);
		set.add(184);
		set.add(null);
					
				for(Integer i:set) {
					
					System.out.println(i);
					
				}
		
		
	}
	
	public void LinkedHashSetTest() {
		
		Set<Integer> set=new LinkedHashSet<Integer>();
		
		set.add(100);
		set.add(172);
		set.add(143);
		set.add(184);
		//set.add(null);
		
	for(Integer i:set) {
		
		System.out.println(i);
		
	}

		
	}
	
	
	public void TreeSetTest() {
		
		Set<Integer> set=new TreeSet<Integer>();
		
		set.add(100);
		set.add(172);
		set.add(143);
		set.add(184);
		//set.add(null);
		
	for(Integer i:set) {
		
		System.out.println(i);
		
	}
		
		
		
	}
	
	
	
public static void main(String[] args) {
	
	SetTest st=new SetTest();
	st.hashSetTest();
	//st.LinkedHashSetTest();
	//st.TreeSetTest();
}
}
