package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {
	
	public static void main(String[] args) throws IOException {
		
		Customer c1=new Customer(124, "Manjith", 159741L, 456, 1213);
		System.out.println(c1);
		
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Srikhar14\\Desktop\\teja it\\customer.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(c1);
		oos.close();
		fos.close();
		System.out.println("Serailizarion Done....");
		
	}

}
