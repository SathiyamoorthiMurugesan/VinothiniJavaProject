package abstractLearning;

public abstract class AbstractDemo1 implements TestInterface {
	
	int ab = 10;
	static int bc = 30;
	protected int cd = 40;
	private int de = 50;
	
	int ef;
	
	public void method1() {
		System.out.println("This is normal method in Abstract class");
	}
	
	public abstract void method2();
	
	public abstract int method5();
	
	public void method3(String abc) {
		int a = 10;
	}
	
	public String method4() {
		
		return null;
	}
	
	public static void method6() {
		System.out.println("this is static method from abstract class");
	}
	
	public static void main(String[] args) {
		
	}
	
	
}
