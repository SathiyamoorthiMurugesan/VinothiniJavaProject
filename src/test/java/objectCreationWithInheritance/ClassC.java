package objectCreationWithInheritance;

public class ClassC {
	
	int a = 100;
	String str1 = "abc";
	
	static int b = 20;
	static String str2 = "abcd";
	
	public void childMethod1() {
		int a =10;
		System.out.println("I am non-static, non-parameterized child method");
	}
	
	public void childMethod2(int a) {
		System.out.println("I am non-static, parameterized child method2");
	}
	
	public static void childMethod3(String abc) {
		System.out.println("I am static, parameterized child method3");
	}
	
	public static void childMethod4(int a, int b) {
		System.out.println("I am static, two parameterized child method4");
	}

	public static void main(String[] args) {
		
		ClassC obj1 = new ClassC();
		obj1.childMethod1();
		
		ClassA obj2 = new ClassA();
		obj2.Parentmethod1();
		
		
	}

}
