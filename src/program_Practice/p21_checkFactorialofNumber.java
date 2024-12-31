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


//Factorial of Number
public class p21_checkFactorialofNumber {		 
		  public static void main(String[] args) {
			  Scanner sc = new Scanner(System.in);
			  System.out.println("Enter Number:- ");
			  int n = sc.nextInt();
			  //checkRecursion(n);
			  checkFactorial(n);
			  int result = calculateFactorial(n);
			  System.out.println("The Factorial value using Recursive approach is : " + result);
			  // 
		  }
//		  public static void checkRecursion(int n)
//		  {
//			  if (n<1)
//			  {
//				  return;
//			  }
//			  checkRecursion(n-1);
//			  System.out.println(n);
//		  }
		  //Factorial Using For Loop
		  public static void checkFactorial(int n)
		  {
			  int fact = n;
			  for (int i = n-1 ; i >1 ; i--)
			  {
				  fact = fact*i;
			  }
			  System.out.println(fact);
		  }
		  //Factorial using recursion method
		    public static int calculateFactorial(int n) 
		    {
		        // Base case: factorial of 0 or 1 is 1
		        if (n == 0 || n == 1) {
		            return 1;
		        }
		        // Recursive call
		        return n * calculateFactorial(n - 1);
		    }
	}

