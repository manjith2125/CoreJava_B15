package collect;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pedilite {    // see classes of BASED-ON-ID, BASED-ON-PRICE, BASED-ON-NAME..
	
	// If you want to compare more than one object.. use COMPARATOR ..
	// CREATE ANOTHER THAT WE WANT TO COMAPRE AND IMPLEMENTS WITH COMPARATOR AND OVERRDIE WITH COMPARE.. 
	
	
	Integer pid;
	String pname;
	Double price;
	public Pedilite(Integer pid, String pname, Double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Pedilite [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}


	public static void main(String[] args) {
		
		Pedilite p1=new Pedilite(101, "fevicol", 12.5);
		Pedilite p2=new Pedilite(107, "m-seal", 10.5);
		Pedilite p3=new Pedilite(104, "fevikwik", 5.5);
		Pedilite p4=new Pedilite(106, "anabond", 40.5);
		
		
		List<Pedilite> list=Arrays.asList(p1,p2,p3,p4);
//		
//	    BasedonID onId=new BasedonID(); 
//		Collections.sort(list, onId);
		
		//Collections.sort(list, new BasedonName());
		
		//Collections.sort(list, new BasedonPrice());
		
		String property="price";
		String orderType="DESCENDING"; // if we remove this automatically it will give in ASCENDING ORDER becz we are using sort .. 
		
		
		
		if(property.equals("pname")) {
			Collections.sort(list, new BasedonName());
		}else if(property.equals("price")) {
			Collections.sort(list, new BasedonPrice());
		}else if (property.equals("pid")) {
			Collections.sort(list, new BasedonID());
		}
		
			if(orderType.equals("DESCENDING")) {
				Collections.reverse(list);
				
			}
		
		
		
		
		for(Pedilite i:list) {
			
			System.out.println(i);
		}
		
		
		
		
	}

}
