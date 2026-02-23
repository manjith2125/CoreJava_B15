package Oops;

public class Blocks {
	
	
	// EMPTY Curlyboxes denotes it is INTSANCE BLOCK
	
	{
		System.out.println("Instance Block");
	}
	
	// EMPTY Curlyboxes With STATIC  denotes it is STATIC BLOCK... And gets HIGH PRIORITY in excution of code
	static {
		System.out.println("STATIC BLOCK");
	}
	
	// HERE FOR CONSTRUCTER we dont need to specifcly call it using object reference by default it will 
	// get called by CONSTRUCTER IN OBJECT.. 
	public Blocks() {
		System.out.println("CONSTRUCTER BLOCK");
	}
	public void m1() {
		System.out.println("Instance method");
	}

	public static void main(String[] args) {
		
		Blocks b=new Blocks();  // With this we can excute both CONSTRUCTOR & INSTANCE METHOD .. 
		b.m1();
		
	}
	// So order of Priority of Excution is STATIC> INSTANCE> CONSTRUCT> any other 
	
}
