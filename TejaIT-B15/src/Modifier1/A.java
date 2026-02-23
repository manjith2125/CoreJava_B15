package Modifier1;

import Modifier2.C;
import Modifier2.D;

public class A extends C {
	
	 int id;
	 void m1() {
		
		System.out.println("A class m1 method");
	}

	public static void main(String[] args) {
		
		A a=new A();
		System.out.println(a.id);
		a.m1();
				
		B b=new B();
		System.out.println(b.bid);
		b.bm1();
		
		C c=new C();
		System.out.println(c.cid);
		
		c.cm2();
		
		D d=new D();
		System.out.println(d.did);
		
		d.dm2();
	
		
		
	}
	
 /* Here we have 4 different types of Acess modifier namely public, defalut , private, protected  
  * with PUBLIC modifier we can create CLASS VAIRABLE METHOD and can be accessed within the PACKAGE AND OUTSIDE OF THE PACKAGE IF NEED 
  * WHEREAS FOR DEFAULT MODIFER WE CAN DO THE SAME ABOVE BUT WE CANT ACESS OTHER PACKAGE DATA
  * WITH DEFAULT MODIFIER WE CANT CREATE CLASS and Can be accese within CLASS ITSELF NOT EVEN WITHIN THE PACKAGE
  */
	
	
	
	public class A extends C {
		
		 int id;
		 void m1() {
			
			System.out.println("A class m1 method");
		}

		public static void main(String[] args) {
			
			A a=new A();
			System.out.println(a.id);
			a.m1();
			//Using protecter modifier to access another package data we need use INHERTANCE CONCEPT ,
			// THAT TO WE CANT DIRECTLY ACESS THE DATA OF OTHER CLASS USING SAME OBJECT CREATED IN THAT OTHER PACKAGE
			// WE CAN ONLY ACCES THE OBJECT OF C CLASS USING OBJECT OF A CLASS ONLY 
			System.out.println(a.cid);
			a.cm2();
					
			B b=new B();
			System.out.println(b.bid);
			b.bm1();
		// if we use the object of orginal C class it wont take so remove the orginal object C CLASS	
		/*	C c=new C();
			System.out.println(c.cid);
			c.cm2();
			*/
			
			D d=new D();
			System.out.println(d.did);
			
			d.dm2();
		
	
	
}
	}
	
