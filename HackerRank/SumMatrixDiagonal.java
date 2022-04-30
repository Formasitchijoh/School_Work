import java.util.*;
public class SumMatrixDiagonal {
       
	 public static void main(String[] args) {
		//stores the left diagonal sum and the right diagonal sum  
		 int primarySum = 0, secondSum = 0; 
	       int n, total;
	       Scanner in = new Scanner(System.in);
	       n = in.nextInt(); //reads the number of rows and columns
	       
	       int[][] arr = new int[n][n];
	       //creates an nxn array
	       //using a for loop to receive the input from the user
	       
	       for(int i = 0; i < n; i++){
	           for(int j = 0; j < n; j++){
	               arr[i][j] = in.nextInt(); //reads from i = 0 and j = 0; check the apropriate index to sum 
	               
	               if(i == j)
	                    primarySum = primarySum + arr[i][j];
	           }
	           //moves to the last position and sum the value
	           //while i < n
	           secondSum = secondSum + arr[i][n - i - 1];
	       }
	       
	       //end of receiving input and summming
	       total = secondSum - primarySum;
	       System.out.println(total);
	       
	}
}
