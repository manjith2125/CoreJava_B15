package Oops;

// Here we are learning ABSTRACT METHOD
//This method is an combination of both normal and abstract ..
/* normal class method works on data implentation 
 * Abstract method works on data declration , and it hide the data
 * Abstract method hides the unneccesary data and shows the neccessary data
 */

// normal method-- Data implentation 
public abstract class NSE {
	
	public void StockInfo() {
		
		System.out.println("INFOSYS, TCS, DELIOTE, HINDALCO, ZOMATO, JIO..");
	}
	public void IPO() {
		System.out.println("FLIPKART , AMAZON , BLINKIT , ZEPTO..");
	}
	
	public void holidays() {
		
		System.out.println("Holiday given by NSE ARE AUG15, MAY1 , SEP5 , AUG25..");
	}
	
	// Abstract method -- Data hiding , data decleration 
	public abstract void BrokerageCharges();
	
	// since this is a abstrct method we can create STATICBLOCK, INSTANCE AND CONSTRUCTOR BLOCK...
	// AND WE access those blocks in child class 
	// why becz
	// in abstract method we cant create OBJECT 
	// since we cant create object in abstract method we cant access them in abstract class..
	
	{
		System.out.println("This is instance block");
	}
	
	static {
		System.out.println("This is static block");
	}
	
	public NSE() {
		
		System.out.println("This is constructor block");
	}
	
	public static void main(String[] args) {
		//NSE nse=new NSE();
	}
	
	
	

}



