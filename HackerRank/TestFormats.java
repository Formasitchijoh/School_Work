package ARRAYS;
import java.util.*;
public class TestFormats {
	 public static void main(String[] args)  {
	       
	       Scanner in = new Scanner(System.in);
	       int size = in.nextInt();
	       int[] arr = new int[size];
	       
	       int positiveRation = 0, negativeRation = 0, zeroRation = 0;
	       
	       for(int i = 0; i < arr.length; i++){
	           arr[i] = in.nextInt();
	           
	           if(arr[i] > 0){
	                positiveRation += 1;
	                System.out.println(positiveRation);
	           }
	            else if(arr[i] < 0){
	                negativeRation += 1;
	                System.out.println(negativeRation);
	            }
	            else {
	                zeroRation += 1;
	                System.out.println(zeroRation);
	            }
	       }
	       
	       float positiveResult =((float) positiveRation/size);
	       float negativeResult = ((float)negativeRation/size);
	       float zeroResult = ((float)zeroRation/size);
	       
	       System.out.printf("%.6f%n", positiveResult);
	       System.out.printf("%.6f%n", negativeResult);
	        System.out.printf("%.6f%n", zeroResult);
	    }
}
