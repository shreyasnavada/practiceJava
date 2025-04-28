package conceptsPrograms;

public class childDemo extends Constructors {
	String s ="Child Class String";
	public void Method()
	{
		System.out.println(s);//without super KW for variable
		System.out.println(super.s);//with super KW for variable
		super.Method();
		System.out.println("Hello from Child Method");
		
	}
	
	public childDemo()
	{
		super();
		System.out.println("Contructor invoked from Child Class");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childDemo  c = new childDemo();
		c.Method();
	}

}
