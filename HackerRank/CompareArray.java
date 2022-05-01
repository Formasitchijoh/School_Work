package ARRAYS;
import java.util.*;
import java.io.*;

public class CompareArray {
    public static void main(String[] args){
       int[] a = new int[3];
     int[] b = new int[3];
     int arating = 0, brating = 0;
     Scanner in = new Scanner(System.in);
     int i,n;
     for( i = 0, n =0; i < b.length; i++ , n++)
        { 
             for(int j =0; j < a.length; j++ ){
                     a[j] = in.nextInt();
                   System.out.println(a[j]);
                     
             }
             
            b[i] = in.nextInt();
            if(a[n] > b[n]){
                arating += 1; 
            }
            else if(a[n] < b[n]){
                brating += 1;
                System.out.println(arating);
            }
            
            else if(a[n] == b[n]){
                System.out.println("[ " + arating + " ," + brating + " ]");
            }
            
        }
     
        }
   
    }


