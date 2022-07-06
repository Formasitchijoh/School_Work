package W3School;

//pig implements the Animal interface
public class Pigg  implements Animal{

	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
		
		System.out.println("The pig says: wee wee");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Zzzz");
		
	}
	
	public static void main(String[] args) {
		Pigg myPigg = new Pigg();
		myPigg.animalSound();
		myPigg.sleep();
	}

}
