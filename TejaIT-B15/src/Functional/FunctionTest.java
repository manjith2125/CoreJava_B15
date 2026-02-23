package Functional;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		
		Function<String, Integer> f1=new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				
				return t.length();
			}
		};
		 Integer val=f1.apply("Manjith");
		 System.out.println(val);
		 
		 
		 System.out.println("=========================================");
		 
		 Function<String, Integer> f2=t2 -> t2.length();
		 Integer value=f2.apply("Kumarsingh");
		 System.out.println(value);
		 
		 
		 System.out.println("=========================================");
		 Function<Integer, String> f3=t3 -> "Manjith";
		 
		 String st=f3.apply(1);
		 System.out.println(st);
		 
		 
		
		
		
	}

}
