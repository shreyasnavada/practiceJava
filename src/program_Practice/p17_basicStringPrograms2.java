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
public class p17_basicStringPrograms2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = input.nextInt();
		//scan.close();
		
		String s = new String("");
		System.out.println("Enter the String ");
		s = input.next();
		System.out.println("The User input Number  is " + n);
		System.out.println("The String User input is " + s);
		checkPalindrome(n);// Program method to check Palindrome Number
		checkPalindromeString(s);//Program Method to Check Palindrome String
		//checkDuplicateCharacters(s);
	}
	
	public static void checkPalindrome(int n)
	{
		int k = n;
		int remainder = 0;
		int revereseNumber = 0;
		for (; n!=0 ; n=n/10)
		{
			remainder = n%10;
			revereseNumber = revereseNumber*10 + remainder;
		}
		System.out.println("The reveresed number is  "+ revereseNumber);
		// check Palindrome case for Number
		if(k == revereseNumber)
		{
			System.out.println("The entered Number is Palindrome ");
		}
		else 
		{
			System.out.println("The entered Number is NOT Palindrome ");
		}
		
	}
	public static void checkPalindromeString(String s)
	{
		String reversedString = new String("");
		for(int i=s.length()-1 ; i >=0 ; i--)
		{
			reversedString = reversedString + s.charAt(i);
		}
		System.out.println("The reveresed number is  "+ reversedString);
		// check Palindrome case for String now
		if(s == reversedString)
		{
			System.out.println("The entered String is Palindrome ");
		}
		else 
		{
			System.out.println("The entered String is NOT Palindrome ");
		}
}
}

