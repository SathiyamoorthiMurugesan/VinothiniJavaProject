package staticVariables;

// static variables and its funationality

public class StaticVariables {
	
	 static int a=200;
	 static int b1;
	
	public static void main(String[] args) {
		
		main1();
	}
	
	public static void main1()
	{
		StaticVariables s = new StaticVariables();
		s.method1();
		b1=1209;
		System.out.println("main method1 function results: "+ a  + b1);
		method2();
		method3();	
	}
	

	public  void method1()
	{   
	//	b1=1200;
	    System.out.println("Non-static Method1 function: "+ a  + b1);
	
	}
	public static void method2()
	{
		a=5001;
		System.out.println("Static Method2 function: "+ "  A: " + a);
	}
	
	public static void method3()
	{
	//	StaticVariables s= new StaticVariables();
		System.out.println("Static Method3 function: "+ " A: "+ a + "  B: "+b1);
	}

}
