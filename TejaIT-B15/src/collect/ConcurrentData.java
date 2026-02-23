package collect;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentData {
	// While we are itterating the data, if you ditrurb by adding elements or removing the elements 
	
	public void onMap() {
		
		Map<Integer, String> map=new ConcurrentHashMap<Integer, String>();
		
		map.put(102, "ABC");
		map.put(105, "ECRS");
		map.put(107, "XYZ");
		map.put(106, "PQR");
		
		for(Entry<Integer, String>entry:map.entrySet()) {
			map.put(108, "SRT");
			map.remove(105);
			
			System.out.println(entry);
		}
		System.out.println("=================================");
		
	for(Entry<Integer, String>entry:map.entrySet()) {
		System.out.println(entry);
	}
		
		
	}
	
	public void onList() {
		
		List<Integer> li=new CopyOnWriteArrayList<Integer>();
		
		
		li.add(101);
		li.add(105);
		li.add(104);
		li.add(106);
		
		
		for(Integer i:li) {
			// if no for loop this 107 will excute 4 times for every itteration becz LIST allow DUPLICCATIONS
			if(i==106) {
				li.add(107);
				
			}
			System.out.println(i);
		}
		System.out.println("=======================================");
		
		for(Integer i:li) {
			System.out.println(i);
		}
		
	}
	
	
	public void onSet() {
		
		Set<Integer> set=new CopyOnWriteArraySet<Integer>();
		
		set.add(121);
		set.add(132);
		set.add(100);
		set.add(159);
		
		for (Integer i:set) {
			
			set.add(600);
			
			System.out.println(i);
		}
		System.out.println("===============================");
		
		for(Integer i:set) {
			
			System.out.println(i);
		}
		
		
	}

	public static void main(String[] args) {
		ConcurrentData cd=new ConcurrentData();
		cd.onMap();
		//cd.onList();
		//cd.onSet();
	}
	
}
