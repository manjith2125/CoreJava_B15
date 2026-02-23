package Functional;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierTESt {
	
	public static void main(String[] args) {
		
		Supplier<Integer> s1=new Supplier<Integer>() {
			
			@Override
			public Integer get() {
				
				return 5*5;
			}
		};
		System.out.println(s1.get());
		
		System.out.println("=========================================");
		
		Supplier<Integer> s2=() -> 7*7;
		System.out.println(s2.get());
		
		
		System.out.println("=========================================");
		
		Supplier<Integer> s3=()-> 8%9;
		System.out.println(s3.get());
		
		
		
		
	}

}
