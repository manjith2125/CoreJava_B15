package Oops;
// Here we are learning The CONSTRUCTOR 
public class Employee2 {
	
	int id;
	String name;
	long salary;
	
	
	public Employee2() {
		System.out.println("Zero ARG CONSTRUCTOR...");
	}
	
	public Employee2(int empID) {
		
		id=empID;		// re-initilization od empid to id 
		
				System.out.println("Int ARG CONSTRUCTOR...."+empID);
	}
	
	public Employee2(int empID, String empName) {
		
		id=empID;
		name=empName;
		
		System.out.println("INT and STRING ...."+empID+"    "+empName);
	}
	
	public Employee2(int empID, String empName, long Payment) {
		id=empID;
		name=empName;
		salary=id=empID;
		name=empName;

		System.out.println("INT and STRING ...."+empID+"    "+empName+"    "+Payment);
		
	}
	
	
	// We need new object for every call..
	
	
	public static void main(String[] args) {
		Employee2 e2=new Employee2();
		
		Employee2 e3=new Employee2(20); 
		
		Employee2 e4=new Employee2(40, "MANJITH");
		
		Employee2 e5=new Employee2(60, "Siva Manjith", 451560L);
		
		
		
	}
}
