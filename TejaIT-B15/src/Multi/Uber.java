package Multi;

//Here we are checking for DATA CONSISTENCY using SYNCHRONIZED keyword with multiple OBJCETS INSIDE THE MAIN METHOD...
// see UBER2 code after it...

public class Uber extends Thread {

	@Override
	public void run() {
		data();
		
	}
	public synchronized void data() {
		
		for(int i=0;i<10;i++) {
		System.out.println("Thread ID::"+Thread.currentThread().getId());
	}
	}
	
	// DATA CONSISTENCY CHECK
	public static void main(String[] args) {
		
	Uber u1=new Uber(); 	// OBJECT LEVEL lock is U1..
		
		Thread t1=new Thread(u1); 		// t1--- 21
		
		t1.start();
		
		Thread t2=new Thread(u1);		// t2----22.
		
		t2.start();
		
		
	Uber u2=new Uber(); 		// OBJECT LEVEL locK IS U2
	
		Thread t3=new Thread(u2);
		t3.start();				// t3--- 23.
		
		Thread t4=new Thread(u2);
		t4.start();					// t4--- 25
		
		
		// Even though we are using  synchronized keyword , DATA is INCONSISTENT between the object .. means both the object are working simultanesouly 
		// if we want them to be in single order means to be them in DATA CONSISTENT FORM use STATIC KEYWORD 
		// See UBER2 code for it 
	}
}
