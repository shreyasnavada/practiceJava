package conceptsPrograms;

public class ThisKeyword {
	String name ="Ram";
	
//	//Constructor
//	public ThisKeyword(String name)
//	{
//		this.name = name;
//	}
	
	void display() {
		String name ="RAMA";
        System.out.println(name);
        System.out.println(this.name);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ThisKeyword s1 = new ThisKeyword("R");
		ThisKeyword s1 = new ThisKeyword();
        s1.display();
	}

}

//
//    // Constructor
//    Student(String name) {
//        this.name = name; // "this" differentiates between class variable and parameter
//    }
//
//    


