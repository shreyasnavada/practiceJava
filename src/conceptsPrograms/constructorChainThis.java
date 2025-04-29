package conceptsPrograms;


class constructorChainThis  {
    String name;// global variable 
    int age;

    // Constructor 1
    public constructorChainThis() {
        this("Unknown", 0); // calling parameterized constructor
        System.out.println("Default Constructor Called");
    }

    // Constructor 2
    public constructorChainThis(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor Called");
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
    	constructorChainThis s1 = new constructorChainThis();// creating object of that class , constructor is called.
        s1.display();
    }
    }
