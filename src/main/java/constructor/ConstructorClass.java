package constructor;

//Basic constructor calling

public class ConstructorClass extends Parent {
	
//	public ConstructorClass()
//	{   
//		System.out.println("Child class default constructor");
//	}
	public ConstructorClass(String a)
	{ 
        super();
		System.out.println("Child class paramerized constructor");
	}

	public static void main(String[] args) {
	//	ConstructorClass c = new ConstructorClass();
		
		ConstructorClass c1 = new ConstructorClass("null");
		c1.method1();	
		System.out.println("C:"+ c1.c);
	}
	
	public void method1() { 
		System.out.println("method1 function calling");
	}	
}
class Parent
{
	 int c=6;
    public Parent()
	{   
    	this(23);
    	System.out.println("Parent class Default constructor");	
	}
    public Parent (int a)
    {
    	System.out.println("Parent class paramaterized constructor"+"C:"+c);	
        a=c;
        a= a+10;
        this.c = a;
        System.out.println("C: "+c);
        System.out.println("A: "+a);
    }
	
}