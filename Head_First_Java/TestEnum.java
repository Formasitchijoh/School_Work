package W3School;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestEnum {
   //An enum is a special "class" that represents a group of 
	//constants (unchangeable variables, like final variables).
	enum Level{
		LOW, MEDIUM, HIGH
	}
	
	public static void main(String[] args) {
		
		Level myvar = Level.MEDIUM;
		System.out.println(myvar);
		
		//Use values() to loop through an enum it return an array of enum constant
		
		for(Level my : Level.values()) {
			if(!my.equals(Level.MEDIUM)) {
				System.out.println("It is not medium");
			}
		}
		
		
		//Time formating  LocalDate is just for Year-Month-day
		
		LocalDate myDate = LocalDate.now();
		LocalTime myDateTime = LocalTime.now();
		System.out.println(myDate);
		System.out.println(myDateTime);
	}
	
}
