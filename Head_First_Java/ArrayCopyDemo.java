package ARRAYS;

public class ArrayCopyDemo {

	public static void main(String[] args) {
		String[] copyFrom = {
				"Affogato","Americano", "Cappuccino","Correto","Cortado",
				"Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
				"Marocchino", "Ristretto"};
				
				//String[] copyTo = new String[9];
				String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 0, 6);
				//System.arraycopy(copyFrom, 1, copyTo, 0, 1);
				
				for(String coffee : copyTo) {
					System.out.print(coffee + " ");
				
		}
	}
}
 