package collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TataProducts implements Comparable<TataProducts> {
	
	int id;
	String name;
	Double price;
	public TataProducts(int id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	@Override
	public int compareTo(TataProducts o) {
		
		return this.id-o.id; 		// This helps to compare only with INTEGERS ONLY
		//return (int) (this.price-o.price); // ADD INT cast to implement .. 
		//return this.name.compareTo(o.name);
	
	}

	@Override
	public String toString() {
		return "TataProducts [id=" + id + ", name=" + name + ", price=" + price + "]";
	}


	public static void main(String[] args) {
		
		TataProducts t1=new TataProducts(101, "TATA CAR", 99.55);
		TataProducts t2=new TataProducts(102, "TATA SALT", 12.45);
		TataProducts t3=new TataProducts(103, "TATA BIKE", 88.75);
		TataProducts t4=new TataProducts(104, "TATA HOUSE", 45.85);
		TataProducts t5=new TataProducts(109, "TATA RENT", 15.95);
		TataProducts t6=new TataProducts(106, "TATA UTENSILS", 12.25);
		
		List<TataProducts> list=new ArrayList<TataProducts>();
		
							list.add(t1);
							list.add(t2);
							list.add(t3);
							list.add(t4);
							list.add(t5);
							list.add(t6);
							
					
				//	Collections.sort(list);  // We are not getting error while using availbe CLASSES like (Integer, String....) but
											// when we try to use out own Class as LIST TYPE it is error , so wt to do .. 
											// Implements with Comparable 
											// override with compareTo..
							Collections.sort(list);
							for(TataProducts i:list) {
								
							//	System.out.println(i.id+"::"+i.name+" :: "+i.price);  //Normal way to print .
								
								System.out.println(i); 		// first override with TOSTRING to get them in order..
															// Now we need to tell in compare to overide on wt basic this comparision should be done 
															// becz we have mutliple types inside the tataproducts, so fix one type to compare with ..
								
								// Actually before override with TOSRING with this print statement " System.out.println(i); " we will get only ADDRESS OF the Object  
								//  not actuall object vlaues will got print .. inorder to print ACTUALL OBJECT override with to string and RETURN in the TOCOMPARE OVERRIDE .. 
							}
							
						
		// Using CompareTo we can only compare with one Object value.. 
		// If you to compare with more than one --- SEE PEDILITE CODE..
							
							
		
	}

	

}
