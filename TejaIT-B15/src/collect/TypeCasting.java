package collect;

public class TypeCasting {
	public static void main(String[] args) {
		
		int i=10;
		long l=i;		// Implict type CASTING..
		
//		long l2=500;
//		int i2=l2;   		// though int can store the value 500 but long is bigger than int .. 
		
		long l2=500;
		int i2=(int)l2;		// EXPLICIT type casting
		
//		Object obj="Manjith"; 
//		String s=obj;			// though here contains string data type it is not storing in actual string beczz OBJECT 
		
		Object obj="Manjith";
		String s=(String)obj;		 // EXPLICIT type casting
		
		
		
		
		
	}

}
