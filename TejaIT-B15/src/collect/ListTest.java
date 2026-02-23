package collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;


// ARRAYLIST workds  in INDEX NETHOD...
public class ListTest {
	public void arrayListTest() {
		
		// <>---- Gernic.
		// <E>-- element Type.. Use only CLASSES..
		// Type--- INTEGER, STRING, DOUBLE , EMPLOYEE , CUSTOMER.. 
		
		ArrayList<Integer> al=new ArrayList<Integer>();
						 al.add(10); 		// ADD METHOD..
						 al.add(20);		// "ADD METHOD" Is to add the data in ARRAYLIST METHOD.. 
						 al.add(30);		// add or remove is WRITE OPERATION
						 al.add(40);
						 al.add(50);
						 al.add(1, 25); // Here element 1 is storing another new value  in its place  with 25 instead of 20...
						 				//now this 25 will occupy element 1 place and other number including 20 will shift FORWARD..
						 				// now o/t will be 10,25,20,30,40,50
						 al.remove(0); // Here element 0 is got removed and other element will shift BACKWORD.. now o/t will be 25,20,30,40,50
						 
						 System.out.println(al.get(2)); // This will directly get the element 2 value from the list automaticlly ... This is "READ OPERATION"..
						 System.out.println("---------------------------");
						 
//					for(int i=0; i<al.size();i++) {
//						System.out.println(al.get(i)); 		// "GET" is used to read the data in ARRAYLIST class  .. GET METHOD
//					}
					System.out.println("==========================");
					// FOR EACH METHOD 
					for(Integer val:al) {
						System.out.println(val);
					}
		// ARRAY LIST METHOD is preferable when we need to call an specific value .. instread of adding or removing the data.. 
				System.out.println("====================================LINKED LIST START..");	
	}
	
	public void LinkedListTest() {
		
		// LINKED DATA STRUCTURE IS "NODE.." new element is stored in new NODE 
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		
				ll.add(10);
				ll.add(20);
				ll.add(30);
				ll.add(40);
				ll.add(2, 25);
			for(Integer val:ll) {
				System.out.println(val);
				
			}
		
		
	}
	
	public void VectorTest() {
		
		
		Vector<String> vt=new Vector<String>();
		
		vt.add("Yesu");
		vt.add("-Babu");
		vt.add(" is Topper ");
		vt.add("of");
		vt.add(" the Class");
		
		for(String str:vt) {
			
			System.out.print(str);
		}
		
		
		
	}
	
	public void stackTest() {
		// Stack -- it is FIRST-IN & LAST-OUT
		
		Stack<String> st=new Stack<String>();
				st.push("siva");
				st.push("yesh"); 		// To write the data we use PUSH METHOD in Stack..
				st.push("Yaseen");
				st.push("Gopi");
				st.push("Ravi");
		
				
				System.out.println("Pop element  ::"+st.peek()); 	// PEEK helps to know which element is being removed from the order of list .. 
				
				st.pop(); 		// POP is used to remove the data .. In STACK removing occurs from last data.. say now RAVI will be removed out instead of  SIVA..
				for(String Str:st) {
					System.out.println(Str);
				}
	}

	public static void main(String[] args) {
		
		ListTest ll=new ListTest();
	//	ll.arrayListTest();
		
		//ll.LinkedListTest();
		
		//ll.VectorTest();
		ll.stackTest();
		
	}

}
