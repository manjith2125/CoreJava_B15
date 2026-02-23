package Oops;

public class Dhan extends NSE {

	@Override
	public void BrokerageCharges() {
		
		System.out.println("DHAN brokerage charges are 10/- per share");
		
		
	}
	
	public static void main(String[] args) {
		Dhan dc=new Dhan();
		
		dc.StockInfo();
		dc.IPO();
		dc.holidays();
		
		dc.BrokerageCharges();
		
		
	}
	

}
