package constructor;

public class PracticeConstructors {
	
	public PracticeConstructors() {
//		super();
		System.out.println("I am the default Constructor");
	}
	
	public PracticeConstructors(int a) {
//		a = 10;
//		super();
//		super(a);
//		super(100);
//		super("text");
		a = 10;
		System.out.println("I am a int parameterized Constructor");
	}
	
	public PracticeConstructors(String a) {
//		this();
//		this(90);
		System.out.println("I am a String parameterized Constructor");
	}
	
	public PracticeConstructors(int a, String aa) {
		
		System.out.println("I am a int and String parameterized Constructor");
	}
	
	public void method1() {
		System.out.println("This is simple non static method1 from the class");
//		method2();
		this.method2();
	}
	
	public void method2() {
		System.out.println("This is simple non static method2 from the class");
	}
	
	public static void main(String[] args) {
//		PracticeConstructors obj = new PracticeConstructors();
//		obj.method1();
		
//		PracticeConstructors obj1 = new PracticeConstructors(10);
		
		PracticeConstructors obj2 = new PracticeConstructors("text");
//		
//		PracticeConstructors obj3 = new PracticeConstructors(10, "string");
		
		
	}

}

class TestCons {
	
	public TestCons() {
		System.out.println("I am parent class default constructor");
	}
	
	public TestCons(int a) {
		System.out.println("I am parent class int constructor");
	}
	
	public TestCons(String a) {
		System.out.println("I am parent class String constructor");
	}
	
	public void method2() {
		System.out.println("I am parent class method");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
