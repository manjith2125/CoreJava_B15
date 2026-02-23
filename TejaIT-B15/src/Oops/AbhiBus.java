package Oops;

public class AbhiBus implements Phonepe
/* To INTEGRATE FROM CLASS TO INTERFACE WE NEED TO USE "IMPLEMENT" COMMAND
 * 
 * just by IMPLMENTATION our work havent done .. we need to override with SAME METHOD SAME PARAMETER 
 */

{

	@Override
	public void TicketBooking() {
		// TODO Auto-generated method stub
	
		
		String from="Guntur";
		String To="Hyderbad";
		String Passengername="Manjith";
		int PassengerAge=27;
		int Price=1000;
		
		System.out.println("From...::"+from);
		System.out.println("To..::"+To);
		System.out.println("Name..."+Passengername);
		System.out.println("age..."+PassengerAge);
		System.out.println("price ..::"+Price);
		
	}
	
	public static void main(String[] args) {
		AbhiBus Ab=new AbhiBus();
		Ab.TicketBooking();
		
		
	}

}


/*PUBLIC.. 
 * PROTECTED 
 * DEFALUT
 * PRIVATE
 * 
 * 
 */



