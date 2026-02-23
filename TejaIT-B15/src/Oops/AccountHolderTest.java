package Oops;

public class AccountHolderTest {
	
	public static void main(String[] args) {
		
		// here we can write  like this also but we need to create separate constructor and object for every modification..
		//AccountHolder ac=new AccountHolder("Manjith",12345645, "SBIN45181",50000);
		//System.out.println("Holdername "+ac.accountHolderName+"   AccNum is  "+ac.accountNumber+"   code is   "+ac.ifsc+"  Bal  "+ac.balance);
		
		
		// Here with single OBJECT we can access all other using setter and getter method.. 
		AccountHolder ac=new AccountHolder();
		
		ac.setAccountHolderName("Manjith");
		ac.getAccountHolderName();
		System.out.println(ac.getAccountHolderName());
		
		
		ac.setAccountNumber(1245254);
		ac.getAccountNumber();
		System.out.println(ac.getAccountNumber());
		
		
		ac.setIfsc("SBIN45181");
		ac.getIfsc();
		System.out.println(ac.getIfsc());
		
		ac.setBalance(50000);
		ac.getBalance();
		System.out.println(ac.getBalance());
		


	}

}
