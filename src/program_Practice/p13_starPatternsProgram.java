package program_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class p13_starPatternsProgram {
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

	

	public static void main(String[] args) {
		//added new comment
	Scanner scanInput = new Scanner(System.in);
	System.out.println("Enter the value  to draw the pattern");
	int n = scanInput.nextInt();
	System.out.println("************************");
	//ScanInput.close();
	pattern1(n);
	pattern2(n);
	pattern3(n);
	pattern4(n);
	//pattern5(n);
	
	}
	public static void pattern1(int n)
	{
		for (int i = 1 ; i <= n ; i++)
		{
			for (int j =1 ; j <=i;j++)
			{
				System.out.print(j);
				
			}
			System.out.println("");
		}
	System.out.println("~~~~~~~~~~~~~~~~!!!!!!!!!!!!@@@@@@@@@############$$$$$$$$$$$$$");
	}
	public static void pattern2(int n)
		{
			for (int i = 1 ; i <= n ; i++)
			{
				for (int j =1 ; j <=i;j++)
				{
					System.out.print(i);
					
				}
				System.out.println("");
			}
			System.out.println("**************************");

	}
	public static void pattern3(int n)
	{
		for (int i = 1 ; i <= n ; i++)
		{
			for (int j =1 ; j <=i;j++)
			{
				if (i==j)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
		System.out.println("**************************");
	}
	public static void pattern4(int n)
	{
		for (int i = n ; i >=1 ; i--)//rows
		{
			for (int j =1 ; j <=i;j++)// columns
			{
				if (i!=j)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(j);
				}
			}
			System.out.println("");
		}
		System.out.println("**************************");
	}
//	public static void pattern5(int n)
//	{
//		for (int i = 0 ; i <=n ; i++)//rows
//		{
//			for (int j =0 ; j <=i;j++)// columns
//			{
//				if (i+j==j)
//				{
//					System.out.print(j);
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println("");
//		}
//		System.out.println("**************************");
//	}
	
}
