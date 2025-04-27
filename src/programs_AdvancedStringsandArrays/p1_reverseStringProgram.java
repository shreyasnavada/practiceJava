package programs_AdvancedStringsandArrays;

import java.util.Scanner;

public class p1_reverseStringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // Scanner Class to Read the values from the User
		System.out.print("Enter a string: "); 
		String s = scanner.nextLine();
		int slength = s.length();
		System.out.println("String length is " + slength);
		String sReverse = "";
		for(int i =slength -1 ; i >=0 ; i--)
		{
		    sReverse = sReverse + s.charAt(i);
		}
		System.out.println("Reversed String is : " + "'" + sReverse + "'");
	}

}
