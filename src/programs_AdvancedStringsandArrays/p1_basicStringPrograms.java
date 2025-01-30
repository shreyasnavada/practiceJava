package programs_AdvancedStringsandArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class p1_basicStringPrograms {

//String Program to Split, Trim and Reverse the String
	public static void main(String[] args) {
		String s= new String("  Hari has a Sandwich ");
		
		String s1 = s.concat(" Tomato");//String Concatenation
		String s2 = s.toLowerCase();
		String s3 = s.toUpperCase();
		String s4 = s.trim();
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
	}
	    }

	
	
	
	
	
	
	
	
	
	
	
//	String s1 = "Rahul Shetty Academy";
//	String s5 = "hello";
//	String s2 = new String("Welcome");
//	String s3 = new String("Welcome");// here the String s3 points to same location of s2.
//	String s = "Rahul Shetty Academy";
//	String[] splittedString = s.split("Shetty");// value is stored in array where the split takes at shetty word
//	String[] splitStringA = s.split(" ");
//
//	System.out.println("first char" + splittedString[0]);
//	System.out.println(splitStringA[0]);
//
//	System.out.println(splittedString[1]);
//
//	System.out.println(splittedString[1].trim());
//
//	for(int i =s.length()-1;i>=0;i--)
//
//	{
//
//	System.out.println(s.charAt(i));
//
//	}
//	
//        // input string having spaces, comma etc.
//        String s0 = "This is,comma.fullstop  whitespace";
//        // The regex [,\\.\\s] splits the string by
//        // commas (,), spaces (\\s), and periods (\\.)
//        String regex = "[,\\s\\.]";
//
//        // using split() method
//        String[] arr = s0.split(regex);
//
//        // Print each element of the resulting array
//        for (String s9 : arr) {
//            System.out.println(s9);
//        }
//        System.out.println(s0.length());
//        
//        for(int j = s0.length()-1; j>=0 ; j--)
//        {
//        	System.out.println(s0.charAt(j));
//        }
//        // //	program to check whether a string is a Palindrome 
