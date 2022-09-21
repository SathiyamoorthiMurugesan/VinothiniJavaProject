package test;

public class Test {
	
	static Test testObject123 = new Test();

	public static void main(String[] args) {
		System.out.println("Hello World");
		Test testObject = new Test();
		testObject.dummyMethod(); //method calling
		staticMethod();
		testObject123.dummyMethod();
	}

	public void dummyMethod() {
		System.out.println("Test");
		staticMethod();
		Test testObject = new Test();
		testObject.method1();
		method1();
//		testObject123
	}

	public static void staticMethod() {
		System.out.println("Test static method");
		Test tc = new Test();
		tc.method1();
		method2();
	}
	
	public void method1() {
		System.out.println("Test non statoc");
	}
	
	public static void method2() {
		System.out.println("This is static method only");
	}
	
//	Object creation
//	GovtHospital medicalCamp =  new GovtHospital();
	
	

}
