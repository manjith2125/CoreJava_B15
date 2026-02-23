package Oops;

public class HDFCBANK extends CRED {
	@Override
	public void loans() {
		
		System.out.println("HDFCBANK OFFERS LOANS ..");
	}
	@Override
	public void UPIPAYMENT() {
		
		System.out.println("HDFCBANK OFFERS UPI PAYMENTS..");
	}
	@Override
	public void Cards() {
		
		System.out.println("HDFCBANK offers CARDS for payments..");
	}
	
	public void ChequeBook() {
		
		System.out.println("HDFCBANK offers Cheque books");
		
	}
	
	public static void main(String[] args) {
		
		HDFCBANK hdfc=new HDFCBANK();
		
	hdfc.loans();
	hdfc.UPIPAYMENT();
	hdfc.Cards();
	hdfc.ChequeBook();
	hdfc.PaymentProcess();  // here for payemnt process we are not defining here, we just take it from previous class BILLDESK
		
	}
	
	// Though we extends it with CRED its showing BILLDESK becz, 
	// CRED actually dont have Payment DESK its taking from BILLDESK so 
	// even though we wrote as CRED it will go to BILLDESK for recall .

}
