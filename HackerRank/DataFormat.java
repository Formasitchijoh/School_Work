package Extra_Readings;
import java.util.*;
public class TestFormat {
  
	public static void main(String[] args) {
		long n = 461012;
		System.out.format("%d%n",n);
		System.out.format("%08d%n",n);
		System.out.format("%+8d%n", n);
		System.out.format("%,8d%n", n);
		System.out.format("%+,8d%n%n", n);
		
		double pi = Math.PI;
		System.out.format("%f%n", pi);
		System.out.format("%.3f%n",pi);
		System.out.format("%10.3f%n", pi);
		System.out.format("%-10.3f%n", pi);
		System.out.format(Locale.FRANCE,
                "%-10.4f%n%n", pi);
		
		Calendar c = Calendar.getInstance();
	      System.out.format("%tB %te, %tY%n", c, c, c); // --> tB a date and time conversion locale-specifiv full name of month
           //td has leading zeroes as needed te does not
	      System.out.format("%tl:%tM %tp%n", c, c, c);  // -->  tl: A date and time conversion hour
	      //tM:A date and time conversion minute in 2 digits with leading zeroes as necessary
	      //ty,tY: A  date and time conversion ty = 2-digit year, tY= 4-digit year

	      System.out.format("%tD%n", c);    // --> A date and time conversion date as %tm%td%ty
		
		
	}
}
