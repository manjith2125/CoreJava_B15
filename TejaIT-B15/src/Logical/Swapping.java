package Logical;

public class Swapping {
	
	
	public static void main(String[] args) {
		
		int i=10;
		int j=20;
	
//		i=i+j;	// 10+20=30
//		j=i-j;	//30-20=10
//		i=i-j;	//30-10=20 
//		
//		System.out.println("i::.."+i);
//		System.out.println("J::..."+j);
//		
		
		if(i>j) {
			int temp=i;
			i=j;
			j=temp;
		}
		
		System.out.println("i..::"+i);
}
}

