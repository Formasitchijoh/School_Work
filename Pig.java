package W3School;

//using the extends which means it is inheriting from the Abstraction_Animal
public class Pig extends  Abstraction_Animal {

	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
		System.out.println("The pig says: wee wee");
	}
	
	public static void main(String[] args) {
		Pig myPig = new Pig(); //creating a Pig object
		myPig.animalSound();
		myPig.sleep();
		
	}

	
}
