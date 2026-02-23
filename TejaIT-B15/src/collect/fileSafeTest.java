package collect;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;


public class fileSafeTest {
	
	public void onMap() {
		
		Map<Integer, String> mp=new ConcurrentHashMap<Integer, String>();
		
						mp.put(100, "Raju");
						mp.put(101, "Eshwar");
						mp.put(103, "kishore");
						mp.put(104, "Manjith");
				for(Entry<Integer, String> entry:mp.entrySet()) {
					
					if(entry.getKey()==103) {
						mp.put(108, "Burger");
						mp.remove(103);
					}
					System.out.println(entry);
				}
				
				System.out.println("============================");
				
				for(Entry<Integer, String> entry:mp.entrySet()) {
					
					System.out.println(entry);
				}
			

	}
	
	
	public void onList() {
		
		List<Integer> li=new CopyOnWriteArrayList<Integer>();
		
						li.add(100);
						li.add(120);
						li.add(105);
						li.add(155);
						//li.add(null);
						
						
					for(Integer i:li) {
						
						
						if(i==120) {
							
							li.remove(1);
						}
						
						System.out.println(i);
					}
	
	}
	
	public void onSet() {
		
		Set<Integer> set=new CopyOnWriteArraySet<Integer>();
		
		set.add(100);
		set.add(172);
		set.add(143);
		set.add(184);
		//set.add(null);
		
	for(Integer i:set) {
		
		if(i==100) {
			
			//set.add(154);
			//set.remove(172);
		}
		
		
		System.out.println(i);
		
	}
		
		
		
	}
	
	
	public static void main(String[] args) {
		fileSafeTest fst=new fileSafeTest();
		
		//fst.onMap();
		//fst.onList();
		fst.onSet();
		
	}

}
