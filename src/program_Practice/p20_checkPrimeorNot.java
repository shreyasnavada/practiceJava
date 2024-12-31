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
public class p20_checkPrimeorNot {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = input.nextInt();
		System.out.println("the entered user input is " + number);
		checkPrime(number);
		}

	public static void checkPrime(int number)
	{
		int count = 0;		
		if(number <= 1)
				{
					System.out.println("Not a Prime Number and the entered value : "+ number +" is less than integer 2 ");
					return;
				}
		else
		{
			for (int i = 1 ; i <= number/2 ; i++)
					{
						if(number % i == 0)
						{
							count++;
						}
						
					}	System.out.println(count + "Value of count ");
				}
		if (count > 1)
		{
			System.out.println("Not Prime");
		}
		else
		{
			System.out.println("Prime");
		}

		}
}
		

