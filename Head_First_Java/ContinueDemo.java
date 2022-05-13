package ARRAYS;
import java.util.*;

public class ContinueDemo {
	public static void main(String[] args) {
		
		String searchMe = "peter piper picked a " + "peck of pickled peppers";
		int max = searchMe.length();
		int numPs = 0;
		int aNumber = 8;
				
				for(int i = 0; i < max; i++) {
					//Interested only in the Ps.
					
					if(searchMe.charAt(i) != 'i')
						continue;
					//processsing P if searchMe.charAt(i) is equal to p or nut
					numPs++;
				}
			System.out.println("Found  " + numPs + "  i's in the string");
			if (aNumber >= 0)
			    if (aNumber == 0)
			        System.out.println("first string");
			else System.out.println("second string");
			System.out.println("third string");
	}
}
