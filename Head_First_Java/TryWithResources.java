package ThrowException;
import java.io.*;
import java.util.*;

/*
 * The try-with-resources automatically closes all the resources at the end os the statement
 * A resource is an object to be closed at the end of the program
 */
public class TryWithResources {
	
	public static void main(String[] args) {
		String line;
		
		try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
			
			while((line = br.readLine()) != null) {
				System.out.println("Line =>" + line);
			}
		}
		
		catch(IOException e) {
			System.out.println("IOException in try block=>" + e.getMessage());
			
			Throwable[] suppressedExceptions = e.getSuppressed();
           //The throwable method returns an array of all suppressed Exceptions
         for(int i = 0; i < suppressedExceptions.length; i ++) {
	              System.out.println("Suppressed exception=>" + suppressedExceptions[i]);
            }
         
	}

}
}
