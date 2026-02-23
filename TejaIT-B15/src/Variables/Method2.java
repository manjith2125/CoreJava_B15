package Variables;

public class Method2 {
	
	public int num() {
		return 0;
	}
	public Long ID() {
		return 1235L;
	}
	
	// If we use VOID there will be no need to use return statement void wont return anything even 0.
	
	public void nothingkill() {
		System.out.println("HELLO WORD NOTHIING IS HERE TO PRINT");
	}
	
	public static void main(String[] args) {
		
		Method2 M2=new Method2();
		
		
		// THIS IS THE NORMAL WAY TO CALL THE VALUE THAT ARE STORED UNTILL USING "VOID"
		System.out.println(M2.num());
		System.out.println(M2.ID());
		
		// If we using VOID this is the way to Call the VOID 
		// VAIRABLENAME.method 
		// this will print wt ever these in void print semicoloon  
		M2.nothingkill();
	}

}
