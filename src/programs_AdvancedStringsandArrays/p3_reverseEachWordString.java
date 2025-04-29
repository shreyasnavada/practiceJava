package programs_AdvancedStringsandArrays;

import java.util.Scanner;
// to reverse each word of String.
public class p3_reverseEachWordString {
		public static void main(String[] args) {
		     Scanner scanner = new Scanner(System.in);
		     System.out.print("Original string : ");
		 
		    String originalStr = scanner.nextLine();
		    scanner.close();
		 
		    String words[] = originalStr.split("\\s");// converting the original string to array
		    String reversedString = "";
		 
		    for (int i = 0; i < words.length; i++) 
		    {
		      String word = words[i];
		      String reverseWord = "";
		      for (int j = word.length() - 1; j >= 0; j--) {
		        reverseWord = reverseWord + word.charAt(j);
		      }
		      reversedString = reversedString + reverseWord + " ";
		    }
		 
		    // Displaying the string after reverse
		    System.out.print("Reversed string : " + reversedString);
		  }
		}