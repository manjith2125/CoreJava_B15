package Multi;

public class TxnTask extends Thread {
	int transactionId;

	public TxnTask(int transactionId) {
		super();
		this.transactionId = transactionId;
	}
	
	@Override
	
	public void run() {
		System.out.println("Transactio ID::"+transactionId+" is processing...."+"BY:::.."+Thread.currentThread().getName());
		
		
		
	}
	public static void main(String[] args) {
		
		TxnTask tx1=new TxnTask(101);
		Thread t1=new Thread(tx1);
		
		// if we want we can create same object like above or we can write like this also with out creaTing separate object 
		
		Thread t2=new Thread(new TxnTask(102));
		Thread t3=new Thread(new TxnTask(103));
		Thread t4=new Thread(new TxnTask(104));
		Thread t5=new Thread(new TxnTask(105));
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
		
	}

}
