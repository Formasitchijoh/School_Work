package demo.Java_Learning;
import java.util.Scanner;

public class FloydsTriangle {
     
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of rows of  Floyd's triangle");
		
		int num, n = 1, c, d;
		num = in.nextInt();
		
		System.out.println("The Floyd's triangle is");
		
		for(c = 1; c <= num; c++) {
			for(d = 1; d <=c; d++) {
				System.out.print(n + " ");
				n++;
			}
		System.out.println();
		}
		
	}
	
}
