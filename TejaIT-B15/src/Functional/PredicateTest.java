package Functional;

import java.util.function.Predicate;

public class PredicateTest {
	
	
	public static void main(String[] args) {
		
		Predicate<Integer> p1=new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				
				return 10/5==2;
				
			}
		};
			Boolean result=p1.test(10);
				System.out.println(result);
System.out.println("=========================================");

Predicate<String> p2= t -> t.length()==5;
	
	Boolean result2=p2.test("Babu");
	System.out.println(result2);
	
	System.out.println("=========================================");
	
	Predicate<String> p3= t1 -> t1.length()==6;
	
	Boolean result3=p3.test("Lokesh");
	System.out.println(result3);
		
	}

}
