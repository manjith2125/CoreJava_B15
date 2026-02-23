package collect;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	
public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Movies\\test.txt"); 	// file path location..
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


