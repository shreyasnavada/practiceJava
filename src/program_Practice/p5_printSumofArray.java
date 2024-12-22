package program_Practice;

public class p5_printSumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arraySum = {1,2,3,45,66,54,22};
		int k;
		int sum=0;
		System.out.println(k=arraySum.length);
		for (int i=0;i<k ; i++)
		{
			sum +=arraySum[i];
		}
		System.out.println(sum + " : is the total Sum of an Array");
	}

}
