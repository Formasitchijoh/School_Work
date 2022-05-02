package ARRAYS;
import java.util.*;
import java.io.*;

public class CompareArray {
   
    public static void main(String[] args){
        
        int[] Alice = new int[3];
      int[] Bob = new int[3];
      int[] result =new int[2];
      
      int AliceRting = 0, BobRting = 0;
      Scanner in = new Scanner(System.in);
     // System.out.println(" here");
      for(int j = 0; j < Alice.length; j++ )
          Alice[j] = in.nextInt(); 
      
		for(int i = 0; i < Bob.length; i++)
		      Bob[i] = in.nextInt();
		     
	
      for(int i = 0; i < Bob.length; i++){
    	 // System.out.println(" here");
             if(Alice[i] > Bob[i]){
                 AliceRting += 1; 
             }
             else  if(Alice[i] < Bob[i]){
                 BobRting += 1;
             }
             
             else {
            	 AliceRting = AliceRting;
            	 BobRting = BobRting;
             }
         }
         result[0] = AliceRting;
         result[1] = BobRting;
        System.out.println("[" + result[0] + ", " + result[1] + " ]"); 
             
        }
   
    }



