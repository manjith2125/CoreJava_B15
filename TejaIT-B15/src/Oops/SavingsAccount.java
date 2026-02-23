package Oops;
// Here we are learning HYBRID INHERITANCE
// Which means Combinations of Single and Mutliple inheritance 
// extends used becz (SavingsAccount & Accounts2 --- are classese)
// Implements used becz (Accounts2 & OnlineService2--- are INTERFACES)

public class SavingsAccount extends Accounts2 implements ATMService2,OnlineService2 {
	
	public void Saving() {
		System.out.println("Dispute with saving account");
		
	}

	@Override
	public void FundsTransfer() {
		// TODO Auto-generated method stub
		System.out.println("Funds trasnfer using online service");
		
	}

	@Override
	public void AmountWithdraw() {
		// TODO Auto-generated method stub
		System.out.println("Amount withdraw using ATM SERVICE");
		
	}
	
	public static void main(String[] args) {
		
		SavingsAccount sa=new SavingsAccount();
	
		sa.FundsTransfer();
		sa.AmountWithdraw();
		
		sa.Saving();
		sa.Dispute();
		
		
	}

}
