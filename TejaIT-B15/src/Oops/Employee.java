package Oops;
// Here we are learning The CONSTRUCTOR 
public class Employee {
	
	public Employee() {		// This is CONSTRUCTOR ZERRO ARUGMENTS INSIDE
		
		System.out.println("This is a constructor");
	}
	
	public Employee(int id) {		//This is CONSTRUCTOR WITH ARUGMENTS INSIDE 
		
		System.out.println("Int Arg constructor..id::"+id);
	}
	
	public Employee(int id, String name) {			//This is CONSTRUCTOR WITH 2 ARUGMENTS INSIDE .
		
		System.out.println("Multiple Arg constructor ...id::"+id+"   name::"+name);
		
	}
	/* WE CANT DIRECLTY CALL THE "ALL" CONSTRUCTOR WITH SINGLE "OBJECT" we need to have as many as we need..
	 * 
	 */
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee(250);
		Employee e3=new Employee(100, "Manjith");
		
	}

}
