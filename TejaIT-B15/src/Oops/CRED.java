package Oops;

public class CRED extends BillDesk{
	public void loans() {
		System.out.println("CRED OFFERS LOANS ..");
	}
	public void UPIPAYMENT() {
		System.out.println("CRED OFFERS UPI PAYMENTS..");
	}
	
	public void CibilScore() {
		System.out.println("CRED offerss CIBIL SCORE CHECKING OPTIONS..");
	}
	public void Cards() {
		System.out.println("CRED offers CARDS for payments..");
	}
	
	public static void main(String[] args) {
		
		CRED cdp=new CRED();
		
		cdp.loans();
		cdp.UPIPAYMENT();
		cdp.CibilScore();
		cdp.Cards();
		cdp.PaymentProcess();	// here for payemnt process we are not defining here, we just take it from previous class BILLDESK
		
	}
	

}
