package program_Practice;

import java.util.Scanner;

//👉 Count Vowels and Consonants in a String: Write a program that counts the number of vowels and consonants in a given string.
//👉 Check if a String is a Palindrome: Write a Java function that checks whether a given string is a palindrome or not.
//👉 Remove Duplicate Characters from a String: Write a program to remove duplicate characters from a string.
//👉 Find the First Non-Repeated Character: Write a program to find the first non-repeated character in a given string.
//👉 Count the Occurrences of a Character in a String: Write a Java function that counts how many times a specific character appears in a given string.
//👉 Check if Two Strings are Anagrams: Write a program that checks if two strings are anagrams of each other (contain the same characters in different orders).
//👉 Convert a String to Integer (String to int): Write a program to convert a string representing a number into an integer.
//String reverse program using method
//String Literal program- Youtube Swaroop Nadella


//writing Palindrome logic for Number and for  String
public class p16_check2NumberComparison {
	public static void main(String[] args) {
		 	  Scanner sc = new Scanner(System.in);
		 	  System.out.println("Enter Number 1:- ");
		 	  int num1 = sc.nextInt();
		 	  System.out.println("Enter Number 2:- ");
		 	  int num2 = sc.nextInt();
		 	  compare2Numbers(num1,num2);
		 	  
	}
	
	public static void compare2Numbers(int num1 , int num2)
	{
		if (num1 > num2) 
		{
			System.out.println(num1 + " is greater than " + num2);
		}
		else if (num1 == num2) 
		{
			System.out.println(num1 + " is equal with " + num2);
		}
		else 
		{
		System.out.println(num1 + " less than " + num2);
		  }	 
		  }
	}

