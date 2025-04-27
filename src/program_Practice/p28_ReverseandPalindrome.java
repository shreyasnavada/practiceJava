package program_Practice;

import java.util.Scanner;

public class p28_ReverseandPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = s1.nextInt();
		reverseNumber(num);
		palindromeNumber(num);

	}
	public static void reverseNumber(int num)
	{
		int revNumber =0 ;
		//123
		while (num >0 )
		{
			int rem = num % 10;
			revNumber = revNumber*10 + rem;//
			num = num / 10;
		}
		System.out.println("Reverse of Number is " + revNumber);
		
	}
	public static void palindromeNumber(int num)
	{
		int revNumber1 =0 ;
		int originalNum = num;
		//123
		while (num >0 )
		{
			int rem = num % 10;
			revNumber1 = revNumber1*10 + rem;//
			num = num / 10;
		}
		//System.out.println("Reverse of Number is " + revNumber);
		if (originalNum == revNumber1)
		{
			System.out.println("Number is Palindrome");
		}
		else 
		{
			System.out.println("Number is Not a Palindrome");
		}
		
	}

}
