package collect;

import java.io.Serializable;

public class Customer implements Serializable {
	int cid;
	String name;
	long CardNum;
	
	transient int cvv; 	// Cannot Serialize
	static int pin;		// cannot SErialize..
	public Customer(int cid, String name, long cardNum, int cvv, int pin) {
		super();
		this.cid = cid;
		this.name = name;
		CardNum = cardNum;
		this.cvv = cvv;
		this.pin = pin;
		
		
	}
	
	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", CardNum=" + CardNum + ", cvv=" + cvv + "]";
	}


	public static void main(String[] args) {
		Customer c1=new Customer(124, "Manjith", 159741L, 456, 1213);
		System.out.println(c1);
	}
	
	

}
