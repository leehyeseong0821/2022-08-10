package projectA13;

import java.io.FileInputStream;
import java.io.IOException;

public class projectA1311 {

	public static void main(String[] args) throws Exception{
		 
		
		try(FileInputStream fis=new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();
		}catch(IOException e) {
			System.out.println("//////");
		}
		
		

	}

}
