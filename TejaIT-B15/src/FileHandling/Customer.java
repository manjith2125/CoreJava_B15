package FileHandling;

import java.io.Serializable;
// NEXT SEE CUSTOMER CLASS 

	public class Customer implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		int cid;
		String name;
		long CardNum;
		
		transient int cvv; 	// Cannot Serialize
		static int pin;		// cannot SErialize..
		public Customer(int cid, String name, long cardNum, int cvv, int pin) {
			super();
			this.cid = cid;
			this.name = name;
			this.CardNum = cardNum;
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



