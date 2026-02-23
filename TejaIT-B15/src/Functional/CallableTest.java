package Functional;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService esc=Executors.newSingleThreadExecutor();
		
		Callable<String> t1=new Callable<String>() {
			
			@Override
			public String call() throws Exception {
				
				return "Manjith";
			}
		};
		Future<String> fus=esc.submit(t1);
		
		System.out.println(fus.get());
		
		//esc.shutdown();
				
		System.out.println("================================================");
		
     Callable<String> t2= ()  ->  "Manjith";
     Future<String> fos=esc.submit(t2);
		
		System.out.println(fos.get());
		
		esc.shutdown();
		
     
 
		
	}

}
