package collect;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;



public class MapTest {
	
	public void hashMapTest() {
		
		//HashMap<String, String> map=new HashMap<String, String>();
		Map<String, String> map=new HashMap<String, String>();
		
							map.put("HAS1257", "HASEEN");
							map.put("NAV125WEF", "NAVEEN");
							map.put("GSH7485SDF", "GOPIKHAN");
							map.put("KIS4595DEEW", "KISHORER");
							map.put(null, "Manjith"); // we can have only one null keyword.. and we can have mutliple VALUES AS NULL..
							
							
			for(Entry<String, String>entry:map.entrySet()) {
				
				
				 System.out.println("KEY VALUE  ::"+entry.getKey()+"  NAME  ::"+entry.getValue());
				 
				 
				//System.out.println(entry);
			}
		
		
		
		
	}
	public void LinkedHashMapTest() {
		
		Map<String, String> map=new LinkedHashMap<String, String>();
		
		map.put("HAS1257", "HASEEN");
		map.put("NAV125WEF", "NAVEEN");
		map.put("GSH7485SDF", "GOPIKHAN");
		map.put("KIS4595DEEW", "KISHORER");
		map.put(null, "Manjith");
		map.put(null, "YASEEN");
		
for(Entry<String, String>entry:map.entrySet()) {


System.out.println("KEY VALUE  ::"+entry.getKey()+"  NAME  ::"+entry.getValue());


//System.out.println(entry);
}
		
		
	}
	
	
	public void treeMapTest() {
		
		Map<String, String> map=new TreeMap<String, String>();
		
		map.put("HAS1257", "HASEEN");
		map.put("NAV125WEF", "NAVEEN");
		map.put("GSH7485SDF", "GOPIKHAN");
		map.put("KIS4595DEEW", "KISHORER");
		//map.put(null, "Manjith");
		
for(Entry<String, String>entry:map.entrySet()) {


System.out.println("KEY VALUE  ::"+entry.getKey()+"  NAME  ::"+entry.getValue());


//System.out.println(entry);
}
	}
	
	public void hashTableTest() {
		Map<String, Integer> ht=new Hashtable<String, Integer>();
		
		ht.put("RAS124", 101);
		ht.put("RSF475", 100);
		ht.put("HDAS7845", 103);
		ht.put("SHJE4815", 104);
		//ht.put(null, null);
		
for(Entry<String, Integer> entry:ht.entrySet()) {
	
	
	System.out.println("KEY VALUE  ::"+entry.getKey()+"  Number  ::"+entry.getValue());
	
}
		
		
	}
	
	public static void main(String[] args) {
		MapTest mp=new MapTest();
		
		mp.hashMapTest();
	//mp.LinkedHashMapTest();
	//mp.treeMapTest();
		//mp.hashTableTest();
	
	}

}
