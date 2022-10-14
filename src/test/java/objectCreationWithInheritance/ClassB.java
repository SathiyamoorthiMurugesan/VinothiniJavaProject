package objectCreationWithInheritance;

public class ClassB extends ClassA {
	
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
		
		ClassB obj1 = new ClassB();
		obj1.childMethod1();
		obj1.Parentmethod1();
//		obj1.parentMethod5();
		
		ClassA obj2 = new ClassA();
		obj2.Parentmethod1();
		
		ClassA obj3 = new ClassB();
		obj3.Parentmethod1();
		
//		ClassB obj4 = new ClassA();
		
	}

}
