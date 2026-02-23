package Functional;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableTest  {
	public static void main(String[] args) {
		ExecutorService esc=Executors.newSingleThreadExecutor();
		
		Runnable t1=new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("Manjith");
				
			}
		};
		esc.submit(t1);
		//esc.shutdown();
		
		
		
		Runnable t2=() -> System.out.println("Rakesh..");
		
		esc.submit(t2);
		
		esc.shutdown();
		
		
		
	}

	
		
	


}
