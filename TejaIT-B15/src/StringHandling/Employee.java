package StringHandling;

public final class Employee {
	
	private final int id;
    private final String name;
    private final	String City;
	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		City = city;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return City;
	}
    
    
    public static void main(String[] args) {
		Employee e1=new Employee(101, "Manjith", "Guntur");
			//	e1.id=102; // Since we declaread as final we cant modifiy them ..
				
		System.out.println(e1.id+"  "+e1.name+"   "+e1.City);
		
	}

}
