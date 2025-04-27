package program_Practice;

import java.util.Scanner;

public class p7_printArrayinReverseOrder {

	//print the elements of an array in reverse order 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);//created Object wrt scanner class
		System.out.println("Enter the Size of the array");
		int n = scanner.nextInt();//read input
		scanner.nextLine();//consume the new line
		System.out.println("Size of array is " + n);
		System.out.println("Enter the array elements");
		// Declare  array of type String
		String[] myArray = new String[n];
		for(int i =0 ; i < n ; i++)
		{
			myArray[i]=scanner.nextLine();
		}
		System.out.println("Array elements in reverse order:");
		//System.out.println(myArray[n]);
		//In reverse Order
		for(int i =n-1;i>= 0;i--)
		{
			System.out.println(myArray[i]);
		}
		//System.out.println(myArray[]);
		//Reversing the array in reverse order by taking direct input
		 String[] array = {"asdsf", "sd"};

	        // Print the array in reverse order
	        System.out.println("Array elements in reverse order:");
	        for (int i = array.length - 1; i >= 0; i--) {
	            System.out.println(array[i]);
	        }
	        //System.out.println(array[]);
		
	}
	}
