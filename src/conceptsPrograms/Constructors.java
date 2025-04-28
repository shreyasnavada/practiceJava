package conceptsPrograms;

public class Constructors {
	
	String s ="Parent Class String";
	public void Method() {
		System.out.println("Hello from Parent Class Method");
	}
	public Constructors()
	{
		System.out.println("Default Parent Constructor");
	}
	public Constructors(int a , int b)
	{
		System.out.println("Parameterized Constructor 001");
		System.out.println(a);//parameterized Constructor
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors a = new Constructors();
		Constructors b = new Constructors(1 , 2);

	}

}
