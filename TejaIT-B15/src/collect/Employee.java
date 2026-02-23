package collect;
// Learning ... Deep and Shallow copy...
public class Employee {
	int id;
	String name;
	String city;
	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	public Employee() {
						// This  is constructor ...
		
	}
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(102, "Manjith", "Guntur");
		
				System.out.println(e1.id+"   "+e1.name+"   "+e1.city);
				
	// DEEP COPY -- COPYING vairable by variable is called DEEP COPY..			
		Employee e2=new Employee();
		
				e2.id=10;
				e2.name="Ajay";
				e2.city="Chennai";
				System.out.println(e2.id+"   "+e2.name+"   "+e2.city);
				
				
	// SHALLOW COPY -- COPYING entire object or referce variable is called SHALLOW COPY..
				// We also "CLONE" IN OBJECT LEVEL CLASS..
		Employee e3=new Employee();
		
					e3=e2;
					System.out.println(e3.id+"   "+e3.name+"   "+e3.city);
		
	}

}
