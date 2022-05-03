package Extra_Readings;

public class MyClass {
	/*
	 * The standard way to get any variable from 
	 * another class is to create a getter for that particular variable
	 * After that you can call the getter in order to get that
	 * the value of whatever variable you want
	 */
		//variable i want to return
	private int[] numArray = {1,2,3};
	
	public int[] getNumArray() {
		/*
		 * clone() is a method use to create a copy of an object of a class
		 * which implement clonable interface
		 * it saves extra processing task for creating the exact copy 
		 * of an object if we perform it using the new key word it will take a lot of processing time to be
		 */
		return numArray.clone();
	}
	
}
