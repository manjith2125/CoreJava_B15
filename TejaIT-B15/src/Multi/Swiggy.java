package Multi;

public class Swiggy extends Thread {
// lOCKING MECHANISM.. USED IN synchronized thread .. TO LOCK THE OBJECT.. 
	
	
	public synchronized  void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread ID:::"+Thread.currentThread().getId());
			
		}
		
	}
	
	public static void main(String[] args) {
		Swiggy s1=new Swiggy(); 			// Object level Lock --- s1
		// We dont know  who will take the lock first ,it might be either T1 or T2 OR T3
		
			   Thread t1=new Thread(s1);			// lets say this "t1".. has got the S1 lock , now complete t1 will execute ..
			   t1.start();
		
			   Thread t2=new Thread(s1);
			   	t2.start();			//lets say this "t2".. has got the S1 lock , now complete t2 will execute ..
			   		   
			   Thread t3=new Thread(s1);
			   t3.start(); 				//lets say this "t3".. has got the S1 lock , now complete t3 will execute ..
			   
	}
}
 
	 


