package Hotel_Management;
import java.util.*;

public class Admin extends User {
  

	ArrayList<Hotel> HotelList = new ArrayList<Hotel>(); //store the total hotels
	ArrayList<Hotel> hotel_VT = new ArrayList<>(); //store the hotel that pass a particular criteria
	ArrayList<Hotel> hotel_Budget = new ArrayList<>();//store hotels that fail a particular criteria
	int HotelNum = 0;
	int Hotel_VT_count = 0;
	int Hotel_Budget_count = 0;
	int Hotel_Rating_count = 0;
	int[] bookCount = new int[6];
	int[] RateCount = new int[6];
	ArrayList<Integer> Book_count = new ArrayList<Integer>(HotelNum); 
	ArrayList<Hotel> Book_Rating = new ArrayList<Hotel>(HotelNum);

		
	public void  addHotel(Hotel hotels) {
		this.HotelList.add(hotels);
		this.HotelNum += 1;
	}
	
	//**************************************************************
	//This function returns an arrayList of the Hotels found in the List
	public  ArrayList<Hotel> getHotels() {
		return this.HotelList;
	}

	//Remember that each element in the  list of array is a hotel object
	// and behaves the same as a hotel and can be accessed ie its method can be
	// accessed just like any other object
	
	

//**********************************************************************
//Search Hotels	
	
public void GetHotelByTown(int i,String TownName) {
		
		if(TownName.equals(this.HotelList.get(i).townName)) {
			hotel_VT.add(this.HotelList.get(i));
			Hotel_VT_count +=1;
		}
	}

public void searchHotelByBudget(int i, double budgets){
  
    double Budreturn = this.HotelList.get(i).hotelPrice;
   	 if(budgets >= Budreturn){
   		 	this.hotel_Budget.add(this.HotelList.get(i));
   		 Hotel_Budget_count +=1;
   	 }
}
public void searchHotelByRating(int i, int ratings) {
	
	if(ratings ==(this.HotelList.get(i).rating)) {
		this.Book_Rating.add(this.HotelList.get(i));
		Hotel_Rating_count +=1;
	}
}

//************************************************************************
//Print functions
public  void PrintHotel(){
	   for(int j = 0; j < HotelNum; j++) {
		   
		this.HotelList.get(j).DisplayHotel();;
		}
	}

	public  void PrintHotels(){
		
		   for(int i = 0; i <Hotel_Budget_count ; i++) {
			  this.hotel_Budget.get(i).DisplayHotel();
			 
			}
		}
	
	public void display() {
		 
		for(int j = 0; j < Hotel_VT_count; j++) {
			
			hotel_VT.get(j).DisplayHotel();
		}
	}
	
	public void displayRating() {
		 
		for(int j = 0; j < Hotel_Rating_count; j++) {
			
			Book_Rating.get(j).DisplayHotel();
		}
	}
	
//*****************************************************************************

//Booking function
	public void Booking() {
		
		System.out.println("Enter the Hotel id of your Hotels of choice");
		
		Scanner in = new Scanner(System.in);
		
		int Hotel_id = in.nextInt();
		
		int count = 0;
		for(int i = 0; i < HotelNum; i++) {
			
			 int id = HotelList.get(i).hotel_id;
		
			if(this.HotelList.get(i).hotel_id == Hotel_id) {
				 
				if(bookCount[i] == 2) {
					int buck = RateCount[i];
					RateCount[i] = buck + 1;
					bookCount[i] = 0;
				}
				
				else {
					int it = bookCount[i];
			         count = it + 1; 
			         bookCount[i] = count;
				}
				
			}
			
		}
	}

}

