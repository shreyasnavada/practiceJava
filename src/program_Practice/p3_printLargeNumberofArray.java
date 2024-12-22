package program_Practice;

import java.util.Arrays;
import java.util.stream.Stream;

public class p3_printLargeNumberofArray {
  private static final String Break() = null;

public static void main(String[] args) {
    // create an array
    String[] myArray = {"plant", "apocalypse", "alert"};
    int[] myArraynumbers = {1 , 3  , 500 , 50};
    int k = myArraynumbers.length;
    System.out.println(k);
    
    for(int i=0; i< k-1 ; i++)
    {
    	if(i % 2 ==0)
    	{
    		System.out.println(" " + i);
    		Break();
    		
    	}
    	else 
    	{
    		Break();
    	}
    }
    }
  }