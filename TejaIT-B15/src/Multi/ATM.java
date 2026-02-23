package Multi;

public class ATM {
	volatile boolean maintananceMode=false; // Ture..
	public void transactionProcess() {
		
		System.out.println("Customer came to trasncation process..");
		
		while(!maintananceMode) {
			//System.out.println("While loop is running... ");
			// Transaction Process is going on ..
		}
		
		System.out.println("ATM , is stopped for maintance...");
	}
	
	public void maintanance() {
		System.out.println("ADMIN CHANGING THE MAINTANCE MODE... FOR REPAIR WORKS....");
		maintananceMode=true;
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		ATM atm=new ATM();
		
		Thread atmTransaction=new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				atm.transactionProcess();
			}
		});
		atmTransaction.start();
		
		Thread.sleep(3000);
		
		atm.maintanance();
	}

}
