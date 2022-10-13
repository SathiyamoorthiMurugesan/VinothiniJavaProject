package inheritanceInJava;

//public class InheritanceDemo1 {
public class InheritanceDemo1 extends Object{
	
	int a = 10;
	String str1 = "Sathya";
	
	static int b = 20;
	static String str2 = "Sathiyamoorthi";
	
	public void Parentmethod1() {
		int a =10;
		System.out.println("I am non-static, non-parameterized parent method");
	}
	
	public void Parentmethod2(int a) {
		System.out.println("I am non-static, parameterized parent method2");
	}
	
	public static void Parentmethod3(String abc) {
		System.out.println("I am static, parameterized parent method3");
	}
	
	public static void Parentmethod3(int a, int b) {
		System.out.println("I am static, two parameterized parent method4");
	}
	

	public static void main(String[] args) {
		InheritanceDemo1 parent = new InheritanceDemo1();
		parent.Parentmethod1();
		parent.Parentmethod2(100);
//		parent.
		
		Parentmethod3("Sathya");
		Parentmethod3(20, 30);
//		Parentmethod3("20");
//		Parentmethod3(20);
		
		System.out.println(parent.a);
		System.out.println(b);
	}

}
