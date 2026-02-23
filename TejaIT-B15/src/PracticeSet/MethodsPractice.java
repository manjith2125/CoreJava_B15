package PracticeSet;

public class MethodsPractice {
	public void emp() {
		
		int a=1;
		int b=2;
		int c=a+b;
		System.out.println(c);
	}
	
	public void emp(String d) {
		System.out.println("this is sting::"+d);
		
		
	}
	public int emp1() {
		
		int num=123;
		return num;
	}
	
	public static void main(String[] args) {
		MethodsPractice mc=new MethodsPractice();
		//mc.emp();
		//mc.emp("yeseen");
		System.out.println(mc.emp1());
	}

}
