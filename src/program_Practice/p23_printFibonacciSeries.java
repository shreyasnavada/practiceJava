package program_Practice;

import java.util.Scanner;

public class p23_printFibonacciSeries {

	public static void main(String[] args) 
	{
        // Given Number N
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number range");
		int N = s.nextInt();
        //int N = 10;
        // Function Call
        Fibonacci(N);
    }
	
	//Using Iterative Approach
	static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;

        for (int i = 0; i < N; i++) {
            // Print the number
            System.out.print(num1 + ", ");

            // Swap
            int num3 = num2 + num1;//1
            num1 = num2;//1`
            num2 = num3;
        }
    }
	//Using Recursive Approach
	
}
