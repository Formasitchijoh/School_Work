import java.util.ArrayList;
import java.util.Scanner;

public class ATMBank {

	int UserPin;
	int UserId;
	double deposit;
	User use;
	ArrayList<User> users = new ArrayList<User>();
	Scanner in = new Scanner(System.in);
	User user;
	int totalusers;
	
	
	
public void AddUsers(){
		System.out.println(" ");
		System.out.println("Enter the amount of Users you want to enter");
		System.out.println(" ");
		 this.totalusers = in.nextInt();
		
        for(int i = 0; i < this.totalusers; i ++) {
			
			System.out.println("Enter a users into the system");
			 this.UserPin = in.nextInt();
			this.UserId = in.nextInt();
			 this.deposit = (double)(Math.random() * 40000);
			
			//Creating a new instance of user and inserting
			//the new user into the userArrayaList in the ATMuser Class
			
			user = new User(UserPin,UserId, deposit + 230.985);
			this.users.add(user); //Add a new user object into the arrayList
			System.out.println(" User added successfully  into the system");
			System.out.println(" ");
			
		}
		
	}

  public int authenticateUser() {
	  
	System.out.println("Enter your pin and ID for verification");
	System.out.println(" ");
	int pin = in.nextInt();
	int id = in.nextInt();
	int index = 0;
	int i;
	for( i = 0; i < this.totalusers; i++) {
		
		if(pin == this.users.get(i).PIN && id == this.users.get(i).ID) {
			index = i;
		}
		
		else
		{
			System.out.println("Please Enter a valid credentials");
		}
	}
	
	return index;
}
  
	
  public void withDraw(double amount ,int index) {
	
	  
		System.out.println(this.users.get(index).amountInAccount);
		System.out.println(index);
	//	System.out.println(bank.users.get(0).amountInAccount);
		double amt = this.users.get(index).amountInAccount;
	    
		if( index >= 0) {
			
		  if(this.users.get(index).amountInAccount >= amount) {
			  
			  this.users.get(index).amountInAccount -= amount;
			  double balance = this.users.get(index).amountInAccount;
				System.out.println(" ");
			  System.out.println("Account Balance ==> " + " " +amt );
			  System.out.println("Withdrawal Amount ==> " + " " +amount );
			  System.out.println(" Current Balance ==> " + " " +balance );
				System.out.println(" ");
			 // System.out.println("You have deducted"+ " "+  amount + "from" + amt + " Your ballance is" + balance);
			  
		  }
		  
		  else {
			  
				System.out.println(" ");
			  System.out.println("Account Balance ==> " + " " +amt );
			  System.out.println("Withdrawal Amount ==> " + " " +amount );
			  System.out.println(" Current Balance is insufficient enter an amount lesser or equivalent to your account balance");
				System.out.println(" ");
		  }
		  
		}
		
		else {
			System.out.println(" ");
			System.out.println("Sorry your credentials are inconsistent");
			System.out.println(" ");
		}
	}
  
  public void ViewAccountDetails(int details) {
	
	 
		System.out.println(" ");
	  System.out.println("=====================USER  DETAILS===============================");
		System.out.println(" ");
	  System.out.println("User ID" + "\t\t" + " User PassWord" + "\t\t" +  "AccountBalance");
	
	  System.out.println(" ");
	  System.out.println(this.users.get(details).ID + "\t\t" + this.users.get(details).PIN + " \t\t" + this.users.get(details).amountInAccount);
		System.out.println(" ");
  }
  
  public void displayAll() {
	  
	  System.out.println(" ");
	  System.out.println("=====================USER  DETAILS===============================");
		System.out.println(" ");
	  System.out.println("User ID" + "\t\t" + " User PassWord" + "\t\t" +  "AccountBalance");
	  for(int i = 0; i < this.totalusers; i ++) {
	  System.out.println(" ");
	  System.out.println(this.users.get(i).ID + "\t\t" + this.users.get(i).PIN + " \t\t" + this.users.get(i).amountInAccount);
		System.out.println(" ");
  }
  
  }
}
