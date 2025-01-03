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


//Check Leap year Program - leap year if its divisible by 4
public class p19_checkLeapYear {		 
		  public static void main(String[] args) {
			  Scanner sc = new Scanner(System.in);
			  System.out.println("Enter Year:- ");
			  int year = sc.nextInt();
			  checkLeapYear(year);
		  }
//		  
//		  Leap years are those years with 366 days instead of 365.
//		  A leap year must satisfy any one of the following two constraints:
//
//			  It should be divisible by 400
//			  It should be divisible by 4 and not by 100
		  
//	        if(year % 4 == 0)
//	        {
//	            if( year % 100 == 0)
//	            {
//	                if ( year % 400 == 0)
//	                    isLeap = true;
//	                else
//	                    isLeap = false;
//	            }
//	            else
//	                isLeap = true;
//	        }
//	        else {
//	            isLeap = false;
//	        }

		  public static void checkLeapYear(int year)
		  {
			  if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			  {
				  System.out.println("Year " + year + " is a leap year");
			  }
			  else 
			  {
				  System.out.println("Year " + year + " is a Non leap year");
			  }
		  }
		  //Using Ternary Operator
//		  int year = 1998;
//
//		    String result;
//
//		    result =
//		      (
//		        (year % 4 == 0 && year % 100 != 0)
//		          ? "is a leap year."
//		          : (year % 400 == 0) ? "is a leap year." : "is not a leap year."
//		      );

	}

