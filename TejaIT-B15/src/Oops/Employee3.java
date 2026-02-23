package Oops;
 
public class Employee3 {
	
	int id;
	String name;
	long salary;
	
	public Employee3() {
		
		System.out.println("Zero arg constructro ");
	}
	
	public Employee3(int id, String name, long salary ) {
		
		this.id=id;
		this.name=name;
		this.salary=salary;
		
		
		
		/*
		 * id=id; name=name; salary=salary;
		 */
	}
	public static void main(String[] args) {
		
		Employee3 e3=new Employee3();
		
		System.out.println(e3.id+"   "+e3.name+"   "+e3.salary);
		
		Employee3 e4=new Employee3(100, "Manjith", 12251L);
		
		System.out.println(e4.id+"   "+e4.name+"   "+e4.salary);
		
		
		
		
		
	}
	
	
}
