package program_Practice;

import java.util.Scanner;

public class p25_numberandStringSwap {
	public static void main (String[] args)
	{
		 Scanner scanner = new Scanner(System.in);
			System.out.print("Enter first number: "); 
			int a = scanner.nextInt();
			System.out.print("Enter second number: "); 
			int b = scanner.nextInt();
			scanner.close();
			swap(a,b);

	}
		public static void swap(int a , int b)
		{
		    System.out.println("Before SWAP " +a);
		    System.out.println("Before SWAP " +b);
		    System.out.println("+++++++++++++***********************++++++++++++++");
		    a = a+ b;
		    b = a-b;
		    a = a-b;
		    System.out.println("After SWAP " +a);
		    System.out.println("After SWAP " +b);
		    //end of Program
		}
	}
