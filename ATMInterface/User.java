
//User class from which user Object can be created from
public class User {
 	
	int PIN;
	int ID;
	double amountInAccount;
	
		public User(int pin, int id,double deposit) {
		this.PIN = pin;
		this.ID = id;
		this.amountInAccount = deposit;
	}
		public User(int pin, int id) {
			this.PIN = pin;
			this.ID = id;
		}
}
