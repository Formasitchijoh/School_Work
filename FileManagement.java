package Item;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class FileManagement {

	public static void main(String[] args) {
		
		try	
			//saves the original err stream
			
		 {
			//Save the original out stream
			PrintStream originalOut =  System.out;
			PrintStream originalErr = System.err;
			
			//Creating a anew file output  stream
			PrintStream fileOut = new PrintStream("./out.txt");
			PrintStream fileErr = new PrintStream("./err.txt");
			
			//Redirect standard out to file
			
			System.setOut(fileOut);
			System.setErr(fileErr);
			
			//wrapped Scanner to get user input
			Scanner scanner = new Scanner(System.in);
			
			//Print data in command console
			originalOut.println("Please input your emainl");
			
			//Read string line
			
			String line = scanner.nextLine();
			
			while(true) {
				
				if("quit".equalsIgnoreCase(line))
					break;
				if(!isValidEmail(line))
				{
					//If the input is not a valid email then write log data to./err.txt file and standard output
					
					originalErr.println("Email" + line + "is not valid please input a valid one");
				System.err.println("Email " + line + "is not a valid email");
			}
				
				else {
					//User input is valid
					originalOut.println("Email" + line + " Is valid please input another one");
					System.out.println("Email " + line + " is valid please input another one");
				}
				//Get next user input line
				line = scanner.nextLine();
			}
			
//			System.setOut(originalOut);
//			System.setOut(originalErr);
		} 
			
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	private static boolean isValidEmail(String email)
	{ //TODO Auto-generated method stub
		boolean ret = true;
		
		if(email == null || email.trim().length() == 0)
		ret = false;
		else
		{
			int index = email.indexOf("@");
			if(index == -1)
				ret = false;
		}
		return ret;
	}
}
