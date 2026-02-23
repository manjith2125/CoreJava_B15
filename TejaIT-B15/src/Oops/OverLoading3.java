package Oops;

public class OverLoading3 {
	
	public void m1(int id, String name) {
		System.out.println("INTEGER NUMBER  id:: "+id+" STRING name::"+name);
	}

	public void m1(String name , int id) {
		System.out.println("name::"+name+"  id::"+id);
	}
	
	public static void main(String[] args) {
		 OverLoading3 ov3=new OverLoading3();
		 
		 ov3.m1(10,"Manjith");
		 ov3.m1("HELLO WORD",1000);
		 		
	}
}
