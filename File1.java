package W3School;
import java.io.IOException;
import java.io.File;

public class File1 {
 
	public static void main(String[] args) {
		
		try {
			//creating a file
			
			File myFile = new File("filename.txt");
			
			if(myFile.exists()) {
				System.out.println("File name: " + myFile.getAbsolutePath());
				System.out.println("File name: " + myFile.getCanonicalPath());
				System.out.println("File name: " + myFile.getTotalSpace());
				System.out.println("File name: " + myFile.hashCode());
				System.out.println("File name: " + myFile.canRead());
				System.out.println("File name: " + myFile.canWrite());
				System.out.println("File created: " + myFile.getName());
			}
			
			else {
				System.out.println("File already Exist.");
			}		
		}
		
		catch(IOException ex) {
			System.out.println("An error occured");
			ex.printStackTrace();
		}
		
	}
}
