package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFile {
	public static void main1(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\Srikhar14\\Desktop\\teja it\\test.txt"); 	// file path location..
		// Here we can pass file path location to write the content...
		FileWriter fw=new FileWriter(file);

//		fw.write("Teja IT");
//		fw.write("Your One Stop");
//		fw.write("HYDERABAD");
       
		
		BufferedWriter bw=new BufferedWriter(fw); 	// For Beautification..
		// Here we can pass file path location to write the content...
		bw.write("Teja IT");
		bw.newLine();
		bw.write("Your One Stop");
		bw.newLine();
		bw.write("HYDERABAD");
		
		bw.close();
		fw.close();
	
		System.out.println("Created File Suceessfully..");
		
	}
public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\Srikhar14\\Desktop\\teja it\\test.txt"); 	// file path location..
		FileReader fr=new FileReader(file);
		
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		
		while(line!=null) {
			
			System.out.println(line); // This line will print TEJA IT contiouslly becz line is not equal to null..
			
			line=br.readLine();
			
			
		}
		
		br.close();
		fr.close();
		
	
		
	}
	
	

}
