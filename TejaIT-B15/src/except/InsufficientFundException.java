package except;

public class InsufficientFundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InsufficientFundException() {	// constructor with zero arg
		
		super();
		
		
		
	}
	public InsufficientFundException(String s) { 		// Constructor with one arg
		super(s);
		
		
	}
	

}
