package methods;

public class MethodCalling1 {
	
	static MethodCalling1 testObject123 = new MethodCalling1();

	public static void main(String[] args) {
		String a = "10";
		System.out.println("Hello World");
		MethodCalling1 testObject = new MethodCalling1();
		testObject.dummyMethod(); //method calling
		staticMethod();
		testObject123.dummyMethod();
	}

	public void dummyMethod() {
		System.out.println("Test");
		staticMethod();
		MethodCalling1 testObject = new MethodCalling1();
		testObject.method1();
		method1();
//		testObject123
	}

	public static void staticMethod() {
		System.out.println("Test static method");
		MethodCalling1 tc = new MethodCalling1();
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
