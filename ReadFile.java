package W3School;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
public static void main(String[] args) {
	
	try {
		File myObj = new File("filenames.txt");
		
		Scanner myReader = new Scanner(myObj);
		
		while(myReader.hasNextLine()) {
			
			String data = myReader.nextLine();
			System.out.println(data);
		}
		
		myReader.close();
	}
	
	catch(FileNotFoundException ex) {
		System.out.println("An error Occurred.");
		ex.printStackTrace();
	}
}
	
}
