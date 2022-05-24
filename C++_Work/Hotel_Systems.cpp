#include <iostream>
#include <string.h>

using namespace std;

 class Hotel{

     public:
            int HotelID;
            string HotelName;
            string TownName ;
            double HotelPrice;
            int rating;

            int hotelId[5];
            string hotellName[5];
            string hotelTown[5];
            double hotelPrice[5];
            int hotelRating[5];
            int BookingArray[5];
   
  public:

        int AddHotel(string Hname, string Tname, double Hprice, int index)
            {
                    hotelId[index] = index + 1;
                    hotellName[index] = Hname;
                    hotelTown[index] = Tname;
                    hotelPrice[index] = Hprice;
                    BookingArray[index] = 0;
                    hotelRating[index] = 0;

                    return index;
         }

    void displayHotel(int sizeHotel)
    {
        
        
        cout <<"HotelID\t\t HotelName\t HotelTown\t HotelPrice\t HotelRating"<<endl;
        cout <<"-----------------------------------------------------------------------\n"<<endl;
                    
                for(int i = 0; i < sizeHotel; i ++)
                { 
                            
                    cout<<hotelId[i] << "\t\t" << hotellName[i] << "\t\t" << hotelTown[i] << "\t\t" << hotelPrice[i]<<"\t\t"<<hotelRating[i] << "\n"<< endl;
                }
        
        }

      void SelectHotelTown(int HotelSize)
      {
              
                cout << "Enter the Town name\n"<<endl;
                string hotName;
                cin >> hotName;
                cout <<"\n\nThese are the list of Hotels you might want to select rom by town\n\n";
                cout <<"\nHotelID\t\t HotelName\t HotelTown\t HotelPrice\t HotelRating"<<endl;
                cout <<"------------------------------------------------------------------------------\n";

                for(int i = 0; i < HotelSize; i++)
                {
                    
                    if(hotelTown[i] == hotName)
                    {
                        cout<<hotelId[i] << "\t\t" << hotellName[i] << "\t\t" << hotelTown[i] << "\t\t" << hotelPrice[i] <<"\t\t" << hotelRating[i]<< "\n"<< endl;  
                        // cout<<hotelId[i] <<"\t\t" << hotellName[i] << "\t\t" << hotelTown[i] << "\t\t" << hotelPrice[i] << endl;
                    }
                }

        cout <<endl;
    }
    
    void SelectionByBudget(int hotelSize){

        cout <<"\n\nEnter your Budget to list the Hotel that correspond to your budget\n"<<endl;
        double budget;
        cin >>budget;
        cout <<"\n\nHotelID\t\t HotelName\t HotelTown\t HotelPrice\t HotelRating"<<endl;
        cout <<"-------------------------------------------------------------------------\n";

        for(int i = 0 ; i < hotelSize; i++){

            if(hotelPrice[i] >= budget){

                 cout<<hotelId[i] << "\t\t" << hotellName[i] << "\t\t" << hotelTown[i] << "\t\t" << hotelPrice[i] <<"\t\t" << hotelRating[i]<< "\n"<< endl;  
            }
        }
        cout <<endl;
    }
    void SelectionByRating(int hotelSize){

        cout <<"\n\nEnter your Rating to list the Hotel that correspond to your rate\n\n\n"<<endl;
        int rate;
        cin >>rate;
        cout <<"HotelID\t\t HotelName\t HotelTown\t HotelPrice\t HotelRating\n\n"<<endl;
        cout <<"-------------------------------------------------------------------------\n";

        for(int i = 0 ; i < hotelSize; i++){

            if(hotelRating[i] == rate){

                 cout<<hotelId[i] << "\t\t" << hotellName[i] << "\t\t" << hotelTown[i] << "\t\t" << hotelPrice[i] <<"\t\t" << hotelRating[i]<< "\n"<< endl;  
            }
        }
        cout <<endl;
    }


        void DisplayOption(){

               
                cout << "\n********Select  a service you will like to perform************************" << endl;
                cout << "1-->View List of Hotels in Buea"<<endl;
                cout << "2--> Select Hotels By Town" <<endl;
                 cout << "3--> Select Hotels By Recomendation" <<endl;
                  cout <<"4-> Select Hotels By Budget" <<endl;
                   cout << "5-->Book a Hotel from your list" <<endl;
                    cout << "6--> Add Hotel" <<endl;
                    cout << "7--> Exit"<<endl;


        }



    //**********************************************************************************
    //this is the booking method
      

    void Booking(int sizzes)
    {
                //Array to store the amount of booking of a hotel
               
                    cout <<"\n\n--------Enter the id of the Hotel you want------------\n\n";
                    int hotid;
                    int countB; //keeps a count of the booking 
                    int countR; //Keeps the count of rating
                    cin >> hotid;

                    for(int i = 0; i < sizzes; i++)
                    {
                    
                        if(hotelId[i] == hotid)
                        {   
                            if(BookingArray[i] == 1){

                                   countR = hotelRating[i];
                                    hotelRating[i] = countR  + 1;
                                    BookingArray[i] = 0;

                            }

                            else
                            {
                                countB =  BookingArray[i];
                                BookingArray[i] = countB + 1;
                                cout<<hotelId[i] << "\t\t" << hotellName[i] << "\t\t" << hotelTown[i] << "\t\t" << hotelPrice[i] <<"\t\t" << hotelRating[i]<< "\n"<< endl; 
                               // cout <<"The Rating of this hotel is :" << hotelRating[i] << "  " << countR << endl;
                           }
                           cout<<hotelId[i] << "\t\t" << hotellName[i] << "\t\t" << hotelTown[i] << "\t\t" << hotelPrice[i] <<"\t\t" << hotelRating[i]<< "\n"<< endl;
                       }

                        //cout <<"The Booking of this hotel is :" << BookingArray[i] << "  " << count << endl;
            
        }

    }
};


   int main(){

     
                string name;
                string town;
                double price;
                Hotel hotel;
                int sizze = 0;
              //   hotel.DisplayOption();
 cout <<"---------------------WELCOME TO BUEA URBAN HOTEL SERVICE  SYSTEM------------------------------\n" <<endl;
                while(1)
               {
                            int in;
                        hotel.DisplayOption();
                        cout << "Enter an opeation to perform\n" <<endl;
                        cin >> in;
               switch (in)
               {      

                  case  1:
                            hotel.displayHotel(sizze);
                            break;

                   case 2:
                            hotel.SelectHotelTown(sizze);
                            break;

                    case 3:
                            hotel.SelectionByRating(sizze);
                            break;
                    case 4: 
                            hotel.SelectionByBudget(sizze);
                            break;

                    case 5: 
                            hotel.Booking(sizze);

                            cout <<"HotelID\t\t HotelName\t HotelTown\t HotelPrice\t HotelRating"<<endl;
                            cout <<"-------------------------------------------------------------------------\n";

                            for(int j =0; j < 5; j++)
                            {
                                cout<<hotel.hotelId[j] << "\t\t" << hotel.hotellName[j] << "\t\t" << hotel.hotelTown[j] << "\t\t" << hotel.hotelPrice[j] << "\t\t"<< hotel.hotelRating[j] << "\n"<< endl;  
                            // cout << " This are the list of booking "hotel.BookingArray[j];
                            }
                            break;

                            case 6:
                                    int ini;
                                cout << "Enter the aoumt of hotels to  add\n";
                                cin >> ini;

                                cout << " Enter the Hotel references"<<endl;
                                    for(int i = 0; i < ini; i ++)
                                        {
                                            cin>>name >> town >> price;

                                            sizze = hotel.AddHotel(name, town, price, i) + 1;
                                            
                                        }
                                
                                    cout << "\nThe size of the hotel list is:" << sizze << "\n" << endl;
                                    hotel.displayHotel(sizze);
                             break;
                             case 7:
                                 exit(EXIT_SUCCESS);
               
                     default: 
                        cout << "Enter a proper value";
                            break;
               }
                 
    }

 return 0;


}