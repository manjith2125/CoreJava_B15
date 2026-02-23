package collect;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		int arr[]=new int[4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		//arr[4]=50;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		System.out.println("================================================");
		
		// This is normal for loop... 
		
		for(int i=0;i<arr.length;i++) { 		// "arr.length" .. reads the data dynamically ...
			System.out.println(arr[i]);
			
		}
		System.out.println("================================================");
		
		// This is "FOR -EACH" loop...,
		
		for(int val:arr) {
			System.out.println(val);
			
		}
		
		
	}

}
