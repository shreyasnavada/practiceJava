package program_Practice;

public class p26_generateRandomNumber {
	
	   // Function to find the biggest of three numbers using Iternary Operator
	   public  static int biggestOfThree(int x, int y, int z)
	    {

	        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
	    }

	    // Main driver function
	    public static void main(String[] args)
	    {

	        // Declaring variables for 3 numbers
	        int a, b, c;

	        // Variable holding the largest number
	        int largest;
	        int largest1;
	        a = 5;
	        b = 10;
	        c = 3;
	        // Calling the above function in main
	        largest = biggestOfThree(a, b, c);
	        //biggestOfThree
	        largest1 = biggestOfThree1(a, b, c);

	        // Printing the largest number
	        System.out.println(largest
	                           + " is the largest number using iternary operator.");
	        System.out.println(largest1 + " is the largest number using if else condition.");
	    }
	    //Using If else condition
	    static int biggestOfThree1(int x, int y, int z)
	    {

	        // Comparing all 3 numbers
	        if (x >= y && x >= z)

	            // Returning 1st number if largest
	            return x;

	        // Comparing 2nd no with 1st and 3rd no
	        else if (y >= x && y >= z)

	            // Return z if the above conditions are false
	            return y;

	        else

	            // Returning 3rd no, Its sure it is greatest
	            return z;
	    }
	    //Approach 3 : Using Collections.max() method and ArrayList
//	    public static void main(String[] args)
//	    {
//	        int a, b, c;
//	        // Considering random integers three numbers
//	        a = 5;
//	        b = 10;
//	        c = 3;
//	        ArrayList<Integer> x = new ArrayList<>();
//	        x.add(a);
//	        x.add(b);
//	        x.add(c);
//
//	        // Printing the largest number
//	        System.out.println(Collections.max(x)
//	                           + " is the largest number.");
//	    }
	    
	}