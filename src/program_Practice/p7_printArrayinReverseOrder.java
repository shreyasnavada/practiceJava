package program_Practice;

import java.util.Scanner;

public class p7_printArrayinReverseOrder {
//	
//	find the frequency of each element in the array
//	print the duplicate elements of an array 
//	print the largest element in an array 
//	print the smallest element in an array 
//	print the sum of all the items of the array 
//	sort the elements of an array in ascending order 
//	find Second Largest Number in an Array 
//	find Second Smallest Number in an Array 
//	print Odd and Even Numbers from an Array
//	remove all the white spaces in a string 
//	Write a code in Java to prove that String objects are immutable 
//	program to count the number of words in a string 
//	program to check whether a string is a Palindrome 
//	Reverse a string 
//	Remove Leading zeros
//	Print first letter of each word in a string
//	Given a string s, find the length of the longest substring without repeating characters
//	Reverse a String: Write a Java program to reverse a given string without using any built-in reverse methods.
//	👉 Count Vowels and Consonants in a String: Write a program that counts the number of vowels and consonants in a given string.
//	👉 Check if a String is a Palindrome: Write a Java function that checks whether a given string is a palindrome or not.
//	👉 Remove Duplicate Characters from a String: Write a program to remove duplicate characters from a string.
//	👉 Find the First Non-Repeated Character: Write a program to find the first non-repeated character in a given string.
//	👉 Count the Occurrences of a Character in a String: Write a Java function that counts how many times a specific character appears in a given string.
//	👉 Check if Two Strings are Anagrams: Write a program that checks if two strings are anagrams of each other (contain the same characters in different orders).
//	👉 Convert a String to Integer (String to int): Write a program to convert a string representing a number into an integer.
//	print the duplicate elements of an array 
//	print the elements of an array in reverse order 
//	print the largest element in an array 
//	print the smallest element in an array 
//	print the sum of all the items of the array 
//	sort the elements of an array in ascending order 
//	find Second Largest Number in an Array
//	find Second Smallest Number in an Array 
//	print Odd and Even Numbers from an Array
//	remove all the white spaces in a string 
//	Write a code in Java to prove that String objects are immutable 
//	program to count the number of words in a string 
//	program to check whether a string is a Palindrome 
	
//Print Duplicate String of array
	//print the elements of an array in reverse order 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);// created Object wrt scanner class
		System.out.println("Enter the Size of the array");
		int n = scanner.nextInt(); //read input
		scanner.nextLine();//consume the new line
		
		// Declare  array of type String
		String[] myArray = new String[n];
		for(int i =0 ; i < n ; i++)
		{
			myArray[i]=scanner.nextLine();
		}
		//System.out.println(myArray);
		//In reverse Order
		for(int i =n-1;i>= 0;i--)
		{
			System.out.println(myArray[i]);
		}
		//System.out.println(myArray[]);
	}
	}
