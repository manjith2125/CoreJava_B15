package Oops;
// HERE WE USE MULTI INHERITANCE BUT DIFFERENCE IS WE HAVE SINGLE CHILD MULTIPLE PARENTS ("ATMService & OnlineService")

// SAY LIKE ACCOUNT MONEY CAN BE WITHDRAW USING AMT OR WE CAN SHARE ONLINE ...

// MEANS LIKE FOR SINGLE ACCOUNT WE HAVE MULTIPLE OPTIONS ex like :- SINGLE CHILD MULTIPLE PARENTS 

public class Accounts implements ATMService,OnlineService {

	@Override
	public void FundsTransfer() {				// TODO Auto-generated method stub
		System.out.println("AmountWithdraw");
		
	}

	@Override
	public void AmountWithdraw() {				// TODO Auto-generated method stub
		
		System.out.println("FundsTransfer");
	}
	
	public static void main(String[] args) {
		
		Accounts ac=new Accounts();
		
		ac.FundsTransfer();
		ac.AmountWithdraw();
		
	}
	

}
