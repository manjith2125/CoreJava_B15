package StringHandling;

public class Customer {
	public static void main(String[] args) {
		Employee e1=new Employee(101, "Manjith", "Guntur");
		//e1.id=102; // Since we declaread as final we cant modifiy them .. 
			
	System.out.println(e1.getId()+"  "+e1.getName()+"   "+e1.getCity());
	}

}
