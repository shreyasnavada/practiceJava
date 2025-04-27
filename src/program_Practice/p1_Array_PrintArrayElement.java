package program_Practice;

import java.util.Arrays;
import java.util.stream.Stream;

public class p1_Array_PrintArrayElement {
  public static void main(String[] args) {
    // create an array
    String[] myArray = {"plant", "apocalypse", "alert"};
    int[] a = {1,2,3,4,5};
    System.out.println("length of integer " +a.length);
    
    String[] array1 = {"a","b","c","z","f","d","g"};
    System.out.println("length of array array1 is " +array1.length);
    
    int[] myArraynumbers = {1 , 3  , 500 , 50};
    int k = myArraynumbers.length;
    
    for(int i=0; i< k-1 ; i++)
    {
      System.out.println(myArray[i]);
    }
    
    System.out.println("********************");
    for(int i=0; i< array1.length -1 ; i++)
    {
      System.out.println(array1[i]);
    }
    System.out.println("********************");
    for(int i=0; i< a.length -1 ; i++)
    {
      System.out.println(a[i]);
    }
    System.out.println("********************");
    }
  }





