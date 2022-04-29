
public class TestArray {

	public static void main(String[] args) {
		/*
		 * I have just made an array of reference to String called island
		 * called islands they are not yet pointing to an object yet
		 * hence i have to make them
		 */
		String[] islands = new String[4];
		
		//making the reference point to an Object of String
		
		islands[0] = "Bermuda";
		islands[1] = "Fiji";
		islands[2] = "Azores";
		islands[3] = "Cozumel";
		
		//Making a reference of index
		
		int[] index = new int[4];
		
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		
		int y = 0;
		int ref;
		
		while(y < 4) {
			ref = index[y];
			System.out.print("island = ");
			System.out.println(islands[ref]);
			y = y+ 1;
		}
			
	}
}
 