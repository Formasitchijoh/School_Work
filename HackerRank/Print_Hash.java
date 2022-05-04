package ARRAYS;
import java.util.*;
public class Print_Hash {

    public static void main(String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	int numInput = in.nextInt();
    	
    	for(int i = 0; i <=numInput; i++) {
    		int j = numInput;
    		
    		//printing the N numInput before printing the first hash
    		
    		while(j-- > i) {
    			System.out.print(" ");
    		}
    		
    		//printing the #
    		
    		while(j-->= 0 ) {
    			System.out.print("#");
    		}
    		
    		System.out.println();
    	}
    }
    
}

