package program_Practice;

import java.util.Scanner;

public class p24_numberSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number  a:");
		int a = s.nextInt();
		System.out.println("Enter first number  b:");
		int b = s.nextInt();
		numberSwap(a , b);
	}
	public static void numberSwap(int a , int b)
	{
		System.out.println("Before Swap value of a and b is" + a +  "and" + b);
		a = a+b;
		b = a-b;
		a=a-b;
		System.out.println("After Swap value of a and b is" + a +  "and" + b);	
		}

}
