package program_Practice;

import java.util.Scanner;

public class p29_numberofDigitsSumofDigits {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = s1.nextInt();
		numberOfDigits(num);
		sumOfDigits(num);

	}
	public static void numberOfDigits(int num)
	{
		int counter = 0;//123456
		while ( num >0)
		{
			num = num / 10;
			counter++;
		}
		System.out.println("The  number of digits in a given Number is : "+ counter);
	}
	public static void sumOfDigits(int num)
	{
		int sum = 0;//123456
		while ( num >0)
		{
			int remainder = num % 10;
			sum = sum + remainder;
			num = num / 10;
		}
		System.out.println("The  number of digits in a given Number is : "+ sum);
}


}
