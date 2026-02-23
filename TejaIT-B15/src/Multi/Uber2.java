package Multi;

public class Uber2 extends Thread{

	@Override
	public void run() {
		data();
		
	}
	public  static synchronized void data() { 	 // Now this STATIC hold the CLASS LEvEL LOCK -- SAY "UB"
		
		for(int i=0;i<10;i++) {
		System.out.println("Thread ID::"+Thread.currentThread().getId());
	}
	}
	
	// DATA CONSISTENCY CHECK
	// NOW UB IS CLASS LEVEL LOCK, now t1, t2 , t3 ,t4 need this UB TO EXCUTE THEM INDIVIDUALLY 
	
	
	public static void main(String[] args) {
		
		
		
	Uber u1=new Uber(); 	// OBJECT LEVEL lock is U1..
		
		Thread t1=new Thread(u1); 		// t1--- 21
		
		t1.start();
		
		Thread t2=new Thread(u1);		// t2----22.
		
		t2.start();
		
	Uber u2=new Uber(); 		// OBJECT LEVEL locK IS U2
	
		Thread t3=new Thread(u2);
		t3.start();				// t3--- 24.
		
		Thread t4=new Thread(u2);
		t4.start();					// t4--- 24
		
		
		
		// if we want them to be in single order means to be them in DATA CONSISTENT FORM use STATIC KEYWORD 
		
	}
}
