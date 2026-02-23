package Loops;
// Here we are learning Array..
// Array is to store multiple value data of same type...
// Array comes under Data Structure..
public class ArrayTest {
	
	public static void main(String[] args) {
//		int -- data type
//		arr-- reference vairable
//		[]--- array operator or Sysmbol
//		new-- keyword 
//		[4]--- Length of array
//	
		
		int arr[]=new int[4]; 	// ARRAY OBJECT.. 
		// Here length of array is 4 .. which means staring with zero ..0,1,2,3
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
	// arr[4]=50; 		we cant write this since length of array is 4 only..
		// even in practical/ dynamic situations also they are fixed in real time projects
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		// System.out.println(arr[4]);		Even we cant excute this also becz of fixed length limit in real time.. 
		
		
		
		
		
	}

}
