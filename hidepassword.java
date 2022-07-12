package Banking_software;
import java.io.*;
import java.util.*;




//Importing required classes
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class hidepassword {

 public static void hide() {
	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter your pass word");
	 
	 String input = "";
	 input = in.nextLine();
	 in.close();
	 
	 for(int i = 0; i < input.length(); i ++) {
		 System.out.print("*");
	 }
	 
	 System.out.print("The length of the password is"+  " "+ input.length());
	 
 }
 public static void main(String[] args) throws IOException
 {
	hide();

 }
} 

/*

public class hidepassword {
       
	
	public static void hidePassword() {
		Scanner in = new Scanner(System.in);
		String pass = "";
		 pass += in.next();
	   
		for(int i = 0; i <= pass.length(); i ++) {
			System.out.print("*");
		}
		
		System.out.print("The pass word is of length " + pass.length());
		 in.close();
		
	}
	
	public static void main(String[] args) {
		
		hidePassword();
	}
}


*/

