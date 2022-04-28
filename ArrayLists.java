package ARRAYS;
import java.io.*;
import java.util.*;

public class ArrayLists {
	 public static void main(String[] args) 
	 {
//		 Declaring ArrayList with initial size n
		 ArrayList<Integer> array =  new ArrayList<Integer>();
		 
		 ArrayList<String> names = new ArrayList<String>(3);
		 names.add("Google");
		 names.add("Apple");
		 
		 System.out.println(names);
		 
//		 Appending new element at the end of the list
		 
		 for(int i = 0; i < 5; i++) 
			 array.add(i);
		 
		 //Printing element of the array
		 System.out.println(array);
		 
		 //Remove element at index 3
		 
		 array.remove(3);
		 
		 //Displaying the array after deletion
		 
		 System.out.println(array);
		 
		 //Printing the element one by one
		 
		
		 System.out.println("\nThe size of the array is : " + array.size() + " \n "
		 		 + array.set(2, 6));
		
		 for(int i = 0; i < array.size(); i++)
			 System.out.println(array.get(i) + " "); //the array.get(i) gets the element at each indexs
		        
		 
		 
		 
	 }
}
