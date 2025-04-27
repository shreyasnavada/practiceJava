package program_Practice;

import java.util.Scanner;

public class p22_printPrimeNumbers {
	 public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a number: "); 
			int number = scanner.nextInt();
			if( isPrime(number))
			{
				System.out.println(number + "  is Prime Number");
			}
			else
			{
				System.out.println(number + " is  not Prime Number");
			}
			}

		public static boolean isPrime(int number)
		{
		    if (number <= 1)
		    {
		        return false;
		    }
		    for (int i =2 ; i <= number / 2; i++)
		    {
		        if (number % i == 0)
		        {
		            return false ;
		        }
		        else
		        {
		            return true;
		        }
		    }return false;
		}
}