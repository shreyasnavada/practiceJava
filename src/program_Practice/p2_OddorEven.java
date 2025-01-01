package program_Practice;

public class p2_OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 5;
		System.out.println("The number is " + n);
		
		//Condition? true_value:false_value 
		//condition? true:alse
		
		String result = (n%2 == 0)? n+ "result is even":"result is Odd";
		System.out.println(result);
	}

}
