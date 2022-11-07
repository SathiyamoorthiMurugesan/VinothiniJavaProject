package Overloading;

public class OverloadingClass {

	static String  name = "kavino";
	static int a=1423;
	
//non-static method overloading
//***********************************************************************************
	public static void main(String[] args) {
		OverloadingClass c = new OverloadingClass();
		c.void1();
		void1("vino");
		void1(a);
		int a= c.void1(2,"goddess");
		System.out.println(a);
		System.out.println(a);
		double C1= c.void1(20.0,"Kavino");
		System.out.println("Void method with Double return : " +C1);

	}
	
	public void void1()
	{   //a=150;
		System.out.println(name+a);
	}
	
	// below are Duplicate method as JVM doesn't look whether it has static or public or its return type during function call//
	/* public static void void1()
	{
		
	}*/
	
	
	public static void void1(String name)
	{
		System.out.println("NAme of person: " + name);
		
	}
	
	public static int void1(int a)
	{  
		a=150;
		System.out.println("NAme of person2: " + a);
		return a;
	}
	
	public int void1 (int a,String name)

	{
		a = 2010;
		System.out.println("Return types with overloading");
		
		return a;
	}
	
	public double void1(double a, String name) {
		
		a = 29.5;
		System.out.println("A: "+a+"  Name of person: "+name);
		return a;
	}
	
	
	
/*	static method overloading
 ***************************************************************************************
 * public static void main(String[] args) {
		void1();
		void1("vino");
		void1(2,"goddess");
		System.out.println(a);

	}
	
	public static void void1()
	{
		System.out.println(name);
	}
	
	
	public static void void1(String name)
	{
		System.out.println("NAme of person: " + name);
		
	}
	
	public static void void1(int a, String name) {
		
		a = 2010;
		System.out.println("A: "+a+"  Name of person: "+name);
		
	}*/
	

}
