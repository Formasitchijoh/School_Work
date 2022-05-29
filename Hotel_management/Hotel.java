package Hotel_Management;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Hotel {
     int hotel_id;
	String hotelName;
	String townName;
	double hotelPrice;
	int rating;
	
	//same as the setter function by setting the class variables as that passed to it
	// in the constructor

	
	public Hotel(int id, String hotelNs, String townNs, double hotelPs) {
		
		this.hotel_id = id;
		this.hotelName = hotelNs;
		this.townName = townNs;
		this.hotelPrice = hotelPs;
		
		this.rating = 0;
	}
	public String getHotelName() {
		return hotelName;
	}
	
	public String getHotelTown() {
		return townName;
	}
	public String toString() {
//		return "hotel_ID: " + hotel_id  + "HotelName:  " + 
//				hotelName + 
//				", HotelTown:  "+  townName +  "HotelPrice:  " + hotelPrice +'\n';
		return  hotel_id  + "\t\t" + hotelName + "\t\t" + townName + "\t\t" + hotelPrice + '\n' + rating + '\n';
	}
	

	
	public void DisplayHotel() {	
			System.out.println(this.hotel_id + "\t\t" + this.hotelName +"\t\t" + this.townName + "\t\t" + this.hotelPrice + "\t\t" + this.rating);	
	}
	
	
			
}


