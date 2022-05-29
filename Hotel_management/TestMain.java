package Hotel_Management;
import java.util.*;
import java.io.*;

public class TestMain {		
	public static void main(String[] args) {
			    
			TestMain test = new TestMain();
			test.Display();
			
			int id;
			String Hname;
			String Tname;
			double price = 0;
			int rate = 0;
			
			Admin admin = new Admin();
			Users user = new Users();
			Scanner in = new Scanner(System.in);
			int j = 0;
			
			while(true) {
				
				test.Display();
				int ini;
				Scanner init =  new Scanner(System.in);
				System.out.println("Enter the operation you will like to perform");
				
				ini = init.nextInt();
				
				switch(ini) {
				
				case 1:
							System.out.println("Enter the hotel   name , town and price");
							
							
							
							//This first for loop saves the Hotels
							for(int i = 0; i < 5; i++) {
	
								Hname = in.next();
								Tname = in.next();
								price = in.nextDouble();
								id = i +1;
							//This is a single hotel object that will be added consecutively
						
						   Hotel hotel = new Hotel(id,Hname, Tname,price);
						   admin.addHotel(hotel);
						 
							}
						
							System.out.println("S/N\t\t" + "Hotel Name \t" + "Hotel Town\t" + "Hotel Price");
							admin.PrintHotel();
					break;
					
					
				case 2:
					System.out.println("Enter the TownName");
					
					String HotTown = in.next();
					System.out.println( HotTown);
					
					for( j = 0; j < admin.HotelNum; j++) {
						
						admin.GetHotelByTown(j, HotTown); 
					}
					
					System.out.println("The Booking of the Hotels are \n");
					admin.display();
					
					break;
					
					
				case 3:
					
                  System.out.println("Enter your Budget");
					
					double HotPrice = in.nextDouble();
					for( j = 0; j < admin.HotelNum; j++) {
						admin.searchHotelByBudget(j, HotPrice);
						
					}
					System.out.println("The Booking of the Hotels by price are \n");
					admin.PrintHotels();
					
					break;
					
				case 4:
						admin.Booking();
					
					break;
					
				case 5:
					
					System.out.println("The Booking of the Hotels by Rating Are \n");
					
					for(int n = 0; n < admin.HotelNum; n ++) {
						int rating = (admin.bookCount[n]/5);
						System.out.println("The hotel of id:   " + n + " Has Booking -> " +  admin.bookCount[n] + "  Has rating -> " + admin.RateCount[n]);

					}
					break;
					
				
				
				case 6:
                     System.out.println("Enter Hotel Rate");
					
					int  rates = in.nextInt();
					for( j = 0; j < admin.HotelNum; j++) {
						admin.searchHotelByRating(j, rates);
						
					}
					System.out.println("The Booking of the Hotels by price are \n");
					admin.displayRating();
					
					break;
					
					default:
						
						System.out.println("Dont Dare me input a valid input");
						break;
				}
			}
		}
	

	public void Display() {
		
		System.out.println("==================WELCOME TO THE BUEA HOTEL RESERVATION SYSTEM==================");
		System.out.println("Select an operation to perform");
		
		System.out.println("1--> Add Hotel");
		System.out.println("2--> view Hotel List");;
		System.out.println("3--> Select Hotel By town");
		System.out.println("4--> Book a hotel");
		System.out.println("5--> Select Hotel By Budget");
		System.out.println("6--> Select Hotel By Rating");
		System.out.println("7--> Exit");
	}
		
}


