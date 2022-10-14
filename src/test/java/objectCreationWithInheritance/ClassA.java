package objectCreationWithInheritance;

public class ClassA {

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
	
	public static void Parentmethod4(int a, int b) {
		System.out.println("I am static, two parameterized parent method4");
	}
	
	private void parentMethod5() {
		System.out.println("I am private method from parent class");
	}
	
	public static void main(String[] args) {
		ClassA obj1 = new ClassA();
		obj1.Parentmethod1();
		obj1.parentMethod5();
		
		ClassB obj2 = new ClassB();
		obj2.childMethod1();
		obj2.Parentmethod1();
		
		ClassC obj3 = new ClassC();
		obj3.childMethod1();
	}
}
