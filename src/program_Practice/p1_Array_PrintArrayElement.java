package program_Practice;

import java.util.Arrays;
import java.util.stream.Stream;

public class p1_Array_PrintArrayElement {
  public static void main(String[] args) {
    // create an array
    String[] myArray = {"plant", "apocalypse", "alert"};
    int[] myArraynumbers = {1 , 3  , 500 , 50};
    int k = myArraynumbers.length;
    
    for(int i=0; i< k-1 ; i++)
    {
      System.out.println(myArray[i]);
    }
  
    // put array into Stream 
    Stream<String> myStream = Arrays.stream(myArray);
    //Stream<String> myStream1= Arrays.stream(myStream1);
    myStream.forEach(e -> System.out.println(e));
    //myStream.forEach(h -> System.out.println(h));
    }
  }