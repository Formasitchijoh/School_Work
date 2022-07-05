package ThrowException;
import java.io.*;

public class FileException {
	
	public static void findFile() throws IOException{
		
		//code that may generate IOException
		
		File newFile = new File("test.txt");
		//There is actually a class called File in java
		
		FileInputStream stream  = new FileInputStream(newFile);
	}
	
	public static void main(String[] args) {
		
		try {
			findFile();
		}
		
		catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
