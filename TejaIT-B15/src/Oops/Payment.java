package Oops;

public class Payment {
	
	public void pay(String PaymentType, int Amount) {
		System.out.println("Payment type::"+PaymentType+"  Amount::"+Amount);
	}
	
	public void pay(String PaymentType, int amount, Long CardNum) {
		System.out.println("Payment type::"+PaymentType+"   Amt::"+amount+"   cardno::"+CardNum);
	}
	public void pay(String PaymentType, int amt, String UPIID) {
		System.out.println("Payment mode::"+PaymentType+"   Amount::"+amt+"   UpiId::"+UPIID);
	}
	
	public static void main(String[] args) {
		
		Payment p1=new Payment();
		
		p1.pay("CARD", 10000, 123454845L);
		p1.pay("CASH", 25000);
		p1.pay("UPI", 855410, "UNIBO12545FD");
		
	}

}
