package Banking_software;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {

    public  void plusMinus() {

    Scanner in = new Scanner(System.in);
      int numOfInt = in.nextInt();
      double lesszero = 0.0;
      double zero =0.0;
      double greaterzero = 0.0;
      int[] IntegerArray = new int[numOfInt];
      
      for(int i = 0; i < IntegerArray.length; i ++){
          IntegerArray[i] = in.nextInt();
           
           if(IntegerArray[i] < 0)
               lesszero++;
           
           if(IntegerArray[i] == 0)
                zero++;
            
            if(IntegerArray[i] > 0)
                greaterzero++;
      }
      
      System.out.println(String.format("%.6f", lesszero/numOfInt));
      System.out.println(String.format("%.6f", zero/numOfInt));
      System.out.println(String.format("%.6f", greaterzero/numOfInt));
      
      in.close();

    }



    public static void main(String[] args) throws IOException {
       Solution soln = new Solution();
         soln.plusMinus();
    }
}

 
