import java.util.Scanner;

public class TestDrive {
     
	ATMBank bank = new ATMBank();
	public static void main(String[] args) {

		System.out.println("**********************WELCOME  TO  THE  FORMASIT CHIJOH ATM INTERFACE************************   ");
		System.out.println("==============================================================================================");
        System.out.println("                                                                                     ");
		System.out.println("Enter The number which correspond to operation you want to perform");
		System.out.println("FOR ADMINS ONLY ENTER 0 TO ADD USERS IN THE ATM SYSTEM");
		
		
		Scanner in = new Scanner(System.in);
		ATMBank bank = new ATMBank();
		Transaction trans = new Transaction();
		TestDrive drive = new TestDrive();
		
		
		while(true) {
			
			drive.display();
			int choice = in.nextInt();
		switch(choice) {
		
		case 0: drive.verifyadmin(); break;
		case 1: drive.Userwithdraw();break;
		case 2: drive.UserDisplay(); break;
		case 3: bank.displayAll(); break;
		case 4: System.out.println("Exiting................");
		System.exit(0);
		default: System.out.println("Enter a valid Operation");
			break;
			
		}
		
		
		}
}
	
	
	
	public static void display() {
		System.out.println("                                                                                     ");
		System.out.println("0)==>AddUsers ");
		System.out.println("1)==>WithDrawal ");
		System.out.println("2)==> View Account Details");
		System.out.println("3)==> DisplayAll");
		System.out.println("4)==> EXIT");
		System.out.println("                                                                                     ");
		
	}
	

	public void verifyadmin() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("                                                             ");
		System.out.println("Enter your Admin verification pass");
		int year = in.nextInt();
		
		if(year == 2000) {
			bank.AddUsers();
		}
		
		else {
			System.out.println("                                                             ");
			System.out.println("Sorry your credentials are incorrect please input the correct pin");
			System.out.println("                                                             ");
		}
		
		//bank.displayAll();
	}
	
	
	
	public void Userwithdraw() {
		Scanner in = new Scanner(System.in);
		int index = bank.authenticateUser();
		 
		  System.out.println(index);
			double amount;
			System.out.println("                                                             ");
			System.out.println("Enter the amount you want to withdraw");
			System.out.println("                                                             ");
		 amount = in.nextDouble();
		 bank.withDraw(amount, index);
		
	}
	public void UserDisplay() {
		int index = bank.authenticateUser();
		bank.ViewAccountDetails(index);
	}
}
