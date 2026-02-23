package Functional;

import java.util.Comparator;

public class ComparatorTest {
	public static void main(String[] args) {
		
		Comparator<String> comp=new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
				
			}
		};
		int st=comp.compare("Raju", "Suresh");
		System.out.println(st);
		
		System.out.println("=================================");
		
		
		Comparator<String> comp1=(String o1, String o2) ->  o1.compareTo(o2);
			
	
		int st1=comp1.compare("Kishore", "Manjith");
		System.out.println(st1);
	
		
	}
}
		

