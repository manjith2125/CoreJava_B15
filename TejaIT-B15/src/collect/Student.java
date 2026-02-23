package collect;
 
public class Student  implements Cloneable{
	
	int id;
	String name;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s1=new Student();
		
		s1.id=123;
		s1.name="Manjith";
		
		System.out.println(s1.id+"   "+s1.name);
		
		// Clone method -- Object level class
		// It is Simillar to SHALLOW COPY METHOD,..
		// clone method is quite fast then shallow method interms of performace .. 
		
		//Student s2=s1.clone()  -- Here it is asking us to do ADD CAST TO student 
		Student s2=(Student) s1.clone() ;	// again  do throws decleration to avoid CloneNotSupportedException
											// Then implements with CLONEABLE..
		System.out.println(s2.id+"   "+s2.name);
		System.out.println(s2.getClass()); 	// This will tell us form which class it is coming from ...
		
		
	}

}
