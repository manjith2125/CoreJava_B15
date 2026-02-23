package except;
//Here this example is to show how "RUNTIME ERRORS" will come , means while writing the code itself we are getting error and we are fixing it using try and catch ..
public class ExceptionTest1 {
	
	public void airthmatic() {
		
		System.out.println("Airthmatic Start.....");
		// Something value/zero..
		try {
		int i=100;
		int j=0; 
		int k=i/j;
		System.out.println(k);		//	Try and Catch for Arthmatic---- use ArithmeticException.....
		}catch(ArithmeticException e) {
			e.printStackTrace(); 	// This line prints the Exception.. 
			
		}
		System.out.println("Airthmatic End....");
	}
	
	
	// ========================================================================================================================================================================
	public void ArrayIndex() {
		
		System.out.println("Array index start .....");
		try {
		int arr[]=new int[4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		//arr[4]=50;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		} catch (ArrayIndexOutOfBoundsException e) { // for ARRAY use THIS "ArrayIndexOutOfBoundsException"
			e.printStackTrace(); 		// This line prints the Exception..
		}
		
		System.out.println("Array Index End.....");
		

	}
	//====================================================================================================================================================================================
	
	public void NullPointer() {
		System.out.println("Null pointer start ....");
		try {
		Integer i=null;
		
		int j=20;
		int k=i+j;
		System.out.println(k);
		}catch (NullPointerException e) { 		// For Null value we use "NullPointerException"
			e.printStackTrace();			// This line prints the Exception..
			
					}
		
		
		
		System.out.println("Null Pointer End....");
	}
	
	//=============================================================================================================================================================
	
	public void NumberFormat() {
		System.out.println("NumberFormat Start......");
		try {
		String s="123";
		System.out.println(s);
		
		String s1="123abc";
		
		Integer val=Integer.valueOf(s1);
		System.out.println(val);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			
		}
		
		
		System.out.println("NumberFormat End........");
		
	}
	
	//================================================================================================================================================================
	// Here this example is to show how "COMPILATION error" will come , means while writing the code itself we are getting error and we are fixing it using try and catch ..
	public void Interrupted() {
		System.out.println("Interpted start......");
		
		for(int i=0; i<=5;i++) {
			
			System.out.println(i);
			
			try {
				Thread.sleep(5000);			// this will enable the code to slow the excution process to 5sec.. 
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("Interpted Ends.......");
		
		
	}
	
	//===============================================================================================================================
	
	public void Interrupted1() throws InterruptedException {	// We are doing with ThrowDecleration Option ..
		System.out.println("Interpted start......");
		for(int i=0; i<=5;i++) {								// So we need to change the main method also be carefull direct calling wont be posible...
			System.out.println(i);								// which looks like.. MainMethod throw InterruptedException..
			
			Thread.sleep(5000);
		}
		
		System.out.println("Interpted Ends.......");
	}
	public static void main(String[] args) throws InterruptedException {
		ExceptionTest1 et=new ExceptionTest1();
		et.airthmatic();
		et.ArrayIndex();
		et.NullPointer();
		et.NumberFormat();
		et.Interrupted();
		et.Interrupted1();
		
	
		
		
	}

}
