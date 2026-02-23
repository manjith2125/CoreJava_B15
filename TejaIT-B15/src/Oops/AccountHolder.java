package Oops;
// Here we are Learning ENCAPSULATION...
public class AccountHolder {
	
	private String accountHolderName;
	private int accountNumber;
	private String ifsc;
	private int balance;
	
	// if we want we can acess or inilatize the values using CONSTRUCTOR but for value we need new CONSTRUCTOR 
		// which will be a burden for memory in code.
		// soo we using setters and getter method to avoid that memory load.
	// Setters is for INTIALIZING THE DATA
	// GETTER IS FOR READING THE DATA.. 
	
	
	

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
public static void main(String[] args) {
		
		AccountHolder ac=new AccountHolder();
		
		
		System.out.println("Holdername "+ac.accountHolderName+"   AccNum is  "+ac.accountNumber+"   code is   "+ac.ifsc+"  Bal  "+ac.balance);
	}
	
}

