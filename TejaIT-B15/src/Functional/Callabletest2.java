package Functional;
 
import java.util.concurrent.Callable;
 
public class Callabletest2{
	public static void main(String[] args) throws Exception {
		Callable<String> f1=new Callable<String>() {
			
			@Override
			public String call() throws Exception {
				
				return "Manjith";
			}
		};	
		String val=f1.call();
		System.out.println(val);
		System.out.println("=================");
		
        Callable<Integer> f2=()-> 5*5;	
		Integer val1=f2.call();
		System.out.println(val1);
		
		
		
	}
 
}
 