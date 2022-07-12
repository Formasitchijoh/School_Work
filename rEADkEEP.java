package Banking_software;

import java.text.SimpleDateFormat;
import java.util.*;
import java.time.Month;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

public class rEADkEEP {
	 public static void getDayMonthYear(String date)
	 {
	   
	     
	     LocalDate currentDates = LocalDate.parse(date); //returns an instant of current local date
	     
	     int days = currentDates.getDayOfMonth();
	     
	     Month months = currentDates.getMonth();
	     
	     int years = currentDates.getYear();
	     
	     

	     // Print the day, month, and year
	     System.out.println("Day: " + days);
	     System.out.println("Month: " + months);
	     System.out.println("Year: " + years);
	     
	 }

	
	public static void main(String[] args)throws Exception {
		 // Given Date
		
		Scanner in = new Scanner(System.in); 
			
		// Receives data in the form 2022-03-04 
		String date= in.next();
	     //String date = "2020-07-18";
	     // Function Call
	     getDayMonthYear(date);
	     
//	     
//	     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
//	     LocalDateTime now = LocalDateTime.now();  
//	     System.out.println(dtf.format(now));  
		
		
		//02/03/2202
		
		String sDate1= in.next();

		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		System.out.println(sDate1+"\t"+date1);
		}
}
