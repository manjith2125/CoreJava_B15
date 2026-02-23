package except;

public class ExceptionTest3 {
	public int m1() {
		try {
		int i=10;
		int j=0;
		int k=i/j;
		System.err.println("k value is ::"+k);
		return 10;
		
		}catch (ArithmeticException e) {
		e.printStackTrace();
		return 20;
		
		}finally {
			return 30;		// Always final value will return even if code excuted properly till TRY BLOCK
							// Actually TRY VALUE OF 10 HAS TO BE RETURNED IF TRY BLOCK EXCUTES WELL BUT IT WONT WRITTEN ONLY FINAL VALUE WILL RETURN ..
			
		}
	}
	public static void main(String[] args) {
		ExceptionTest3 e3=new ExceptionTest3();
		System.out.println("Return value  ::"+e3.m1());
		
		
	}

}
