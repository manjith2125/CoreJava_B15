package except;

public class Customer {
	int bill=500;
	public void payment(int amount) {
		
		if(bill<amount) {
			System.out.println("Payment Success...."); 		// Just normal way to tell but i need custom method to tell it ..see how 
			
		}else {
			//System.out.println("Payment failed....");
			//throw new InsufficientFundException(); 		// This line will
			throw new InsufficientFundException("ADD MORE FUNDS TO INCIATE THE PAYMENT....");
		}
	}
	public static void main(String[] args) {
		Customer cc=new Customer();
		cc.payment(100);
		
		
	}

}
//we can create our own deifned MESSAGE for presentation..
//First create a class and extends with runtimeexcution..
//create constructor with zero arg for not delivering any delafult message in output
//Create constructor with single arg to deliver our own required message as output..