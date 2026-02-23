package Oops;

public class AliceBlue extends NSE {

	@Override
	public void BrokerageCharges() {
		
		System.out.println("AliceBlue brokerage charges are 20/- per share");
		
	}
	
	public static void main(String[] args) {
		
		AliceBlue ac=new AliceBlue();
		
		ac.StockInfo();
		ac.IPO();
		ac.holidays();
		
		
		ac.BrokerageCharges();
		
	}
	

}
