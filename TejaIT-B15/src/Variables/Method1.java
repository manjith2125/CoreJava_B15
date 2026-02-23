package Variables;
// Here we are learning METHODS 

//  To write Method syntax is PUBLIC CLASS METHODNAME {}
public class Method1 {
	
	public byte b() {
		return 123;
	}
	public short s() {
		return 1234;
	}
	public int i() {
		return 12345;
	}
	public long l() {
	return 12345678L;
	}
	public float f() {
		return 1.5f;
	}
	public double d() {
		return 125.55;
	}
	public char c() {
		return 'A';
	}
	public boolean B() {
		return true;
	}
	
	public static void main(String[] args) {
		Method1 m1=new Method1();
		
		System.out.println(m1.b());
		System.out.println(m1.s());
		System.out.println(m1.i());
		System.out.println(m1.l());
		System.out.println(m1.f());
		System.out.println(m1.d());
		System.out.println(m1.c());
		System.out.println(m1.B());
		
	}
	}

