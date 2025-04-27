package program_Practice;

public class p2_OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 5;
		System.out.println("The number is " + n);
		
		//Condition? true_value:false_value 
		//condition? true:alse
		
		String result = (n%2 == 0)? n+ "result is even":"result is Odd";
		// 
		String result1 = (n%2 !=0)? n + "result is odd":"result is even";
		System.out.println(result);
		System.out.println(result1);
		

//		// Online IDE - Code Editor, Compiler, Interpreter
//		import java.util.Scanner;
//		public class Main
//		{
//		    public static void main(String[] args) {
//		        Scanner a = new Scanner(System.in);
//		        System.out.println("Enter the Number");
//		        int number = a.nextInt();
//		        System.out.println("The Number is " + number);
//		        if(number %2 ==0 )
//		        {
//		           System.out.println("The Number " + number + " is EVEN NUMBER");
//		        }else 
//		        {
//		             System.out.println("The Number " + number + " is ODD NUMBER");
//		        }
//		        }
//		}

	}

}
