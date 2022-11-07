package constructor;

public class ConstructorClassA {

	    public static int a = 56;
	    public static String aa = "Giraffe";
	    
		public ConstructorClassA(int a )
		{   
			this("Vnino");
			System.out.println("Parent classA parameterized int constructor");
		}
		
		public ConstructorClassA(String m )
		{
			System.out.println("Parent classA parameterized string constructor");
			System.out.println(m);
			System.out.println("Before call:  "+aa);
			 m=this.aa;
			System.out.println("After call: "+m);
		}
		public ConstructorClassA(String a1,int c )
		{
			System.out.println("Parent classA parameterized string and int constructor");
			System.out.println("A1: " + a1 + "  C:" + c);
		}
	
	
	public static void main(String[] args) {
	//ConstructorClassA A = new ConstructorClassA(10);
	ConstructorClassA AA = new ConstructorClassA("String1Vino");
	//ConstructorClassA AAA = new ConstructorClassA("String1Vino",67);
		

	}
	
	

}
