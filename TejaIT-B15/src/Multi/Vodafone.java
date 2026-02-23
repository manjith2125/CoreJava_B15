package Multi;

public class Vodafone implements Runnable{ 		// Using Runnable requires OVERRIDE WITH RUN, but in THREADS EXTENDS Its OPTIONAL TO override but we do it ..

	@Override
	public void run() {
		for(int i=0; i<=10;i++) {
			System.out.println("Thread id  "+Thread.currentThread().getId());
			
			
		}
		
	}
	public static void main(String[] args) {
		Vodafone vd=new Vodafone();
		//vd.run();
		
		Thread t1=new Thread(vd); // t1--20 is thread of t1..
		
		
		    // t1.start();
		
		Thread t2=new Thread(vd);  // t2--21 is thread id of t2..
			 // t2.start();
			  
			  Thread t3=new Thread(vd); // t3--22 is thread id of t3
			 t3.start();
			  
			  Thread t4=new Thread(vd); // t4 -- 23 is thread id of t4
			 // t4.start();
}
	

}
