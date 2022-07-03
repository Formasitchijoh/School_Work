package Hackerank;
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

public class Result {
	
	    public static void miniMaxSum(List<Integer> arr) {
	     // Write your code here
	            long min = 0;
	            long max = 0;
	            ArrayList<Integer> hell = new ArrayList<Integer>();
	         

	            List<Integer> sortedList = arr.stream().sorted().collect(Collectors.toList());

	            for(int i=0, j=4; i<4; i++, j--) {
	                min += sortedList.get(i);
	                max += sortedList.get(j);
	            }

	            System.out.println(min + " " + max);
	        }

	    }