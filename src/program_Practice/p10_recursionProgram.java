package program_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class p10_recursionProgram {
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

	
//	program to check whether a string is a Recursion Program 
	
	public static void main(String[] args) {
		//added new program line
		int n = 10;
		printNumbers(n);
	}
	
	public static void printNumbers(int n)
	{
		if (n < 0)
			return;
		printNumbers(n-1);
		System.out.println(n);
		
		
	}
	}
