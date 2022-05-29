package Hotel_Management;
import java.util.*;
public class User {
     int id;
     double Budget;
}

//package Hotel_Management;
//import java.util.*;
//public class SaveProject {
//
//	
//	    
//public static void main(String[] args) {
//	
//	Admin admin = new Admin();
//	Users user = new Users();
//	boolean test = true;
//	
//	while(test) {
//		DisplayHotel();
//	Scanner in = new Scanner(System.in);
//	int choice = in.nextInt();
//	
//	switch(choice) {
//	case 0: add();
//		break;
//	case 1: GetHotByTown();
//		break;
//	case 2: GetHotByBudget();
//		break;
//	case 3: BookHotels();
//		break;
//	default:
//		System.out.println("PLease enter a valid option\n");
//	
//  }
//	}
//	
//}
//
//		public static void add() {
//					Scanner in = new Scanner(System.in);
//					Admin admin = new Admin();
//					Users user = new Users();
//					
//					System.out.println("Enter the hotel id,  name , town and price");
//					
//					int id;
//					String Hname;
//					String Tname;
//					double price = 0;
//	
//					for(int i = 0; i < 5; i++) {
//						id = in.nextInt();
//						Hname = in.next();
//						Tname = in.next();
//						price = in.nextDouble();
//					//This is a single hotel object that will be added consecutively
//				
//				   Hotel hotel = new Hotel(id, Hname, Tname,price);
//				   admin.addHotel(hotel);
//				 
//					}
//				
//					System.out.println("S/N\t\t" + "Hotel Name \t" + "Hotel Town\t" + "Hotel Price");
//					admin.PrintHotel();
//				//************************************************************************************************************88	
//		}
//		
//		public static void GetHotByTown() {
//			
//			Scanner in = new Scanner(System.in);
//			Admin admin = new Admin();
//			
//				System.out.println("Enter the TownName");
//				String HotTown = in.next();
//		
//				System.out.println( HotTown);
//				
//				for( int j = 0; j < admin.HotelNum; j++) {
//					
//					admin.GetHotelByTown(j, HotTown); 
//				}
//				
//				System.out.println("The Booking of the Hotels are \n");
//				admin.display();
//	    }	
//		
//		public static void GetHotByBudget() {
//			
//			System.out.println("Enter your  Budget");
//			Scanner in = new Scanner(System.in);
//			Admin admin = new Admin();
//			
//					double HotPrice = in.nextDouble();
//					
//  						
//						admin.searchHotelByBudget(j, HotPrice);
//						
//					}
//					
//					System.out.println("The Booking of the Hotels by price are \n");
//					admin.PrintHotels();
//		}
//}
//		
//		public static void BookHotels() {
//			
//			Scanner in = new Scanner(System.in);
//			Admin admin = new Admin();
//			
//				for(int n = 0; n < 10; n ++) {
//					admin.Booking();
//				}
//				
//				System.out.println("The Booking of the Hotels are \n");
//				  
//				for(int n = 0; n < admin.HotelNum; n ++) {
//					int rating = (admin.bookCount[n]/5);
//					System.out.println("The hotel of id:   " + n + " Has Booking -> " +  admin.bookCount[n] + "  Has rating -> " + rating);
//		
//				}
//		}
//		
//		public static void DisplayHotel() {
//			
//			System.out.println("\t-----------------Select an operation to perform -----------------");
//			System.out.println("\t0-> To add a Hotel "); 
//			System.out.println("\t1-> Select Hotel by Town");
//			System.out.println("\t2-> Select Hotel by Budget");
//			System.out.println("\t3-> Select Hotel by Rating");
//		
//	}
//}
//
//
// 