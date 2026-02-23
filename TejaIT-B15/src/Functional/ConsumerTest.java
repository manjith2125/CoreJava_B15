package Functional;

import java.util.function.Consumer;

public class ConsumerTest {
	
	public static void main(String[] args) {
		
		Consumer<String> con=new Consumer<String>() { 
			
			@Override
			public void accept(String t) {
				System.out.println(t);
				
				
			}
		};
		con.accept("Bharath");
		
		System.out.println("============================");
		
		Consumer<String> con2=t2 -> System.out.println(t2);
		con2.accept("Manjith");
		
		System.out.println("============================");
		
		Consumer<String> con3=t3 -> System.out.println(t3);
		con3.accept("SivaManjith");
		
		
		System.out.println("============================");
		
		Consumer<Integer> cos=new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		};
		cos.accept(125);
		
		System.out.println("============================");
		
		Consumer<Integer> cos1=t4 -> System.out.println(t4);
		cos.accept(163);
		
		

	}

}
