package Multi; 	// Runtime exception -- Here we saw is IllegalThreadStateException...

// We prefer RUNNABLE interface over EXTRENDS THREADS BECZZ With interface we can access mutliple classes ..
public class Bsnl implements Runnable{

	@Override
	public void run() {
		// This is RUNNING STATE -- Here Execution of Run method will happen...
	
		for(int i=0; i<5;i++) {
			
			System.out.println("Thread id:: "+Thread.currentThread().getId());
			
			try {
				Thread.sleep(1000); 		//  WAITING STAGE...
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		} //  This is Dead state ---- Completion of run method Execution...   
		
	}
	
	public static void main(String[] args) {
		
		Bsnl b=new Bsnl();
		
		Thread t1=new Thread(b);		// This is NEW or BORN STATE-- Here we create the THREAD OBJECT ..
		t1.start();						// This is RUNABLE STATE -- Here starting the Thread for Execution 
		
		//t1.start();  // After completion of t1 it comes to DEAD STAGE, Again we are calling the DEAD t1.. so it will  create an ERROR which is named as "ILLEGAL THREAD STATE EXCEPTION "
	}
					// Runtime exception -- Here we saw is IllegalThreadStateException....
}
