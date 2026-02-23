package Multi;
// Here we are learning DEAD LOCK.. 
// we are manually locking the threads to release the key of execution 
//Here in object 1 -- lock1 is with t1 ... and in object 2 lock2 is with t2.. 
// now t1 wait for lock2 and t2 waits for lock1..
// but we locked them manually so they will wait like that .. 
// this kind of waiting is called DEAD LOCK...
public class DeadLock {
	public static void main(String[] args) {
		
		String lock1="Manjith";
		String lock2="Siva";
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (lock1) {
					System.out.println("t1 Thread aquired... "+lock1);
				synchronized (lock2) {
					System.out.println("t1 Thread aquired ... "+lock2);
					
				}
				
					
				}
				
				
			}
		});
		t1.start();
		
		
	Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (lock2) {
					System.out.println("t2 Thread aquired... "+lock2);
				synchronized (lock1) {
					System.out.println("t2 Thread aquired ... "+lock1);
					
				}
				
					
				}
				
				
			}
		});
		t2.start();
		
	}
	

}
