package Multi;
// Here we are learning ... Executor service... 
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TransactionTask  implements Runnable {
	int transactionId;

	public TransactionTask(int transactionId) {
		super();
		this.transactionId = transactionId;
	}

	@Override
	public void run() {
		System.out.println("Transactio ID::"+transactionId+" is processing...."+"BY:::.."+Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(5); 	// Here this 5 is no of threads that were created automatically using "Executors.newFixedThreadPool"
		
				// Now this 5 threads will excute the task ...
		// say we have only 2 threads with no of TASK to excute.. now this 2 THREADS will excute those 5 tasks.. 
		
						es.submit(new TransactionTask(101));
						es.submit(new TransactionTask(102));
						es.submit(new TransactionTask(103));
						es.submit(new TransactionTask(104));
						es.submit(new TransactionTask(105));
						es.submit(new TransactionTask(106));
					
						es.shutdown();
						
						
						
		
		
	}
	

}
