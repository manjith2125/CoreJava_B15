package Loops;

public class ArrayTest2 {
	public static void main(String[] args) {
		String [] ProductNames= {"Pantloons","IDEA","kIA","HYUNDAI","TOYOTA","SUZUKI","SKODA"};

       
		System.out.println(ProductNames[0]);
		System.out.println(ProductNames[1]);
		System.out.println(ProductNames[2]);
		System.out.println(ProductNames[3]);
		System.out.println(ProductNames[4]);
		System.out.println(ProductNames[5]);
		System.out.println(ProductNames[6]);
	
		
		System.out.println("========================================");
		// instead of writing all print out statments we can also do like this...
		
		for(int i=0; i<=6;i++) {
			System.out.println(ProductNames[i]);
			
			
			
		}
		System.out.println("========================================");
		
		// till here we need to calulate the length and size of the array manualy..
		// instead of doing that wt we can do is 
		// arrayname. length .. it will automatically read the length of array that we wrote in string
		
		for(int i=0;i<ProductNames.length;i++) {
			System.out.println(ProductNames[i]);
			
			
		}
		// Till here we are giving the size of array , but its fixed size right 
		// wt if there is an increament 
		// it wont direct accept the incremant .. so wt to do ..
		
		
	}
	

}

