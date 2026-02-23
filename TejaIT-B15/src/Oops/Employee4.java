package Oops;

public class Employee4 {
	int id;
	String name;
	int age;
	
	// by using Source key-- Genereate using filed opt, we can direct make the defalut constructor off n use our wished one..
	public Employee4(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	// lets check wheater DEFAULT CONSTRUCTOR IS WORKING OR NOT
	// IF U WANT IT TO WORK AGAIN MANUALLY DEFINE CONSTRUCTOR AND USE IT 
	
	public Employee4() {
		System.out.println("Print this DEFAULT CONSTRUCTOR ");
		
	}
	public static void main(String[] args) {
		
		Employee4 e4=new Employee4(123, "Manjith", 26);
		
		System.out.println(e4.id+"   "+e4.name+"   "+e4.age);
		
		Employee4 e5=new Employee4();
		
	}
	
	

}
