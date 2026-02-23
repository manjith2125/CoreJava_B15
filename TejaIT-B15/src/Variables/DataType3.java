package Variables;

public class DataType3 {
	
	// For Byte, Short, Int, Long. with out intiation of any value they will print 0 
	
	byte b;
	short s;
	int i;
	long l;
	// For Float  with out intiation of any value they will print 0.0 
	float f;
	double d;
	// for Char with out intiation of any value they will print EMPTY SPACE 
	char c;
	
	// For Boolean with out intiation of any value they will print FALSE 
	boolean B;
	
	public static void main(String[] args) {
		DataType3 dt3=new DataType3();  // we call this sytle of writing as OBJECT 
		
		System.out.println(dt3.b);
		System.out.println(dt3.s);
		System.out.println(dt3.i);
		System.out.println(dt3.l);
		System.out.println(dt3.f);
		System.out.println(dt3.d);
		System.out.println(dt3.c);
		System.out.println(dt3.B);
		
		
	}

}
