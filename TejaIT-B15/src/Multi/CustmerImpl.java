package Multi;
// 
public class CustmerImpl {
	
	public static void main(String[] args) {
		
		Customer c1=new Customer();
		// Withdraw thread -- t1..
		
		Thread t1=new Thread(new Runnable() {
			
		@Override
		public void run() {
			
			try {
				c1.Withdraw(1500000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
	}

			
		});
		
		t1.start();
		
		
		//Deposit Thread -- t2
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				c1.Deposit(2000000);
				
				
			}
		});
		t2.start();
	}

}

   
