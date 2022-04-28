package ARRAYS;
import java.util.*;
public class AddContentOfArray {

	ArrayList<Integer> arr = new ArrayList<Integer>(5);
	
	public int AddArray(ArrayList arr) {
		 this.arr = arr;
		 int i, sum = 0;
		 Scanner in = new Scanner(System.in);
		 
		 int num = in.nextInt();
		 int[] ar = new int[num];//reads the size of the array
		 
		 for(int j = 0; j < ar.length; j++) {
			 
			// arr.add(in.nextInt());
			 ar[j] = in.nextInt();
			 sum = sum + ar[j];
			 
		 }
		 System.out.println(sum);
		 return 0;
		
	}
	
	 public static void main(String[] args) {
		 
		 ArrayList<Integer> array = new ArrayList<Integer>(6);
		 
		 AddContentOfArray addcoa = new AddContentOfArray();
		 addcoa.AddArray(array);
		 
	 }
}
