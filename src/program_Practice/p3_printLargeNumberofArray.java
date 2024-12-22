package program_Practice;

public class p3_printLargeNumberofArray {
public static void main(String[] args) {
    // create an array
    //String[] myArray = {"plant", "apocalypse", "alert"};
    int[] myArraynumbers = {1 , 3  , 500 , 50, 501 , 390,498 , 1000, 1009 , 1 , 2, 1109, 2};
    int k = myArraynumbers.length;
    System.out.println("The sizeo of integer type array is:  " + k);
    int j=0;
    
    
    for(int i=0; i< k-1 ; i++)
    {
    	if(j< myArraynumbers[i])
    	{
    		j= myArraynumbers[i];
    	}
    }
    System.out.println("The largest number from an array is: " + " " +j);
  }
}
