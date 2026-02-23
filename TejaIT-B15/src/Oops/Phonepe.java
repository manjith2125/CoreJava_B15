package Oops;

public interface Phonepe {
	
	// INTERFACE HIDE THE DATA USING ABSTRACT METHOD
	// DATA IMPLEANTATION CAN BE DONE IN NORMAL METHOD NOT IN ABSTRACT METHOD
// interface allow only abstract methods..
	
	// BY DEFAULT VARIABLE ARE PUBLIC , STATIC, FINAL even we mentioned or not
	//By DEFAULT METHODS ARE PUBLIC AND ABSTRACR HERE ...
	public static final int id=10;
	
	// IN INTERFACE WE CANT CREATE CONSTRUCTOR 
//	public Phonepe() {
//		
//	}
//	\ 
//	{
		// IN INTERFACE WE CANT CREATE INSTANCE BLOCK
	}
	 
	
	//static{
		// IN INTERFACE WE CANT CREATE STATIC BLOCK
//	}
	
	
	public abstract void TicketBooking(); // DECLERATION -- IS CALLED AS ABSTRACT METHOD
	
	
public static void main(String[] args) {
	// SINCE WE CANT CREATE CONSTRUCTOR WE CANT CREATE "OBJECT ALSO"
	Phonepe ph=new Phonepe() {	// we cant actually create OBJECT HERE ... 
								// its showing no error here .. IT IS other anyoyomus cls will discuss later ..
		@Override
		public void TicketBooking() {
			// TODO Auto-generated method stub
			
		}
	};
	
}
}
