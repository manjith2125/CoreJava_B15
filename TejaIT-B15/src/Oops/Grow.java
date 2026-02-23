package Oops;

public class Grow extends NSE {

	@Override
	public void BrokerageCharges() {
		System.out.println("Grow brokerage charges are 30/- per share");
		
	}
	public static void main(String[] args) {
		
		Grow gc=new Grow();
		
		gc.StockInfo();
		gc.IPO();
		gc.holidays();
		
		gc.BrokerageCharges();
		
	}

}
