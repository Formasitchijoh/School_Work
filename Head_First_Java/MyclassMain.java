package Extra_Readings;

public class MyclassMain {

	public static void main(String[] args) {
		
		MyClass newClassObj = new MyClass();
		
		int[] secondArray = newClassObj.getNumArray();
		
		for(int i = 0; i < newClassObj.getNumArray().length; i++) {
			System.out.println(secondArray[i]);
		}
	}
}
