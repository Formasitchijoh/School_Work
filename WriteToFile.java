package W3School;
import java.io.FileWriter;
import java.io.IOException;


public class WriteToFile {

	public static void main(String[] args) {
		
		try {
			FileWriter myWriter = new FileWriter("filenames.txt");
			myWriter.write("Files in java might be tricky, but it is fun enough");
			myWriter.close();
			
			System.out.println("Successfully wrote to the file");
		}
		
		catch(IOException ex) {
			System.out.println("An error occurred");
			ex.printStackTrace();
		}
	}
}
