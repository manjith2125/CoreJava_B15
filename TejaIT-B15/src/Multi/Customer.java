package Multi; // See Custmerimpl class...after this class..
//Runtime exception -- Here we saw is IllegalMointerStateException..
public class Customer {
	int withdraw;
	int BankBal=0;
	
	public synchronized void Withdraw(int withdrawAmt) throws InterruptedException {
		System.out.println("Customer came to withdraw the amount....");
		
		if(BankBal<withdrawAmt) {
			System.out.println("Sorry sir , we dont have enough amount , please wait...");
			withdraw=withdrawAmt;
			
			wait(); // it is object from object class.. we are adding throws decleation here
				
		}
		
		System.out.println("Counstmer withdraw amount Successfully...");
		BankBal=BankBal-withdrawAmt;
		
		
	}
	public synchronized void Deposit(int DepositAmt) {
		
		System.out.println("Another Coustmer Deposited the amount ");
		BankBal=BankBal+DepositAmt;
		
		System.out.println("Custmer Deposited amount successfully...");
		System.out.println("Notifying...");
		
		if(BankBal>withdraw) {
			
			notify();
		}
		
		
	}
	
	// IllegalMointerStateException --- this exception will come  when a thread attempts to call wait(), notify(),
	//or notifyAll() on an object without holding that object's intrinsic lock.. 

}
