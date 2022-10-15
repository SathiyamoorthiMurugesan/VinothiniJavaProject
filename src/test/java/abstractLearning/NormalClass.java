package abstractLearning;

public class NormalClass extends AbstractDemo1{
	
	int aa = 10;
	static int ab = 20;

	@Override
	public void method2() {
		System.out.println("overriden method");
	}

	@Override
	public int method5() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void method21() {
		System.out.println("Test method");
	}
	
	public static void method22() {
		System.out.println("static test method");
	}
	
	public static void main(String[] args) {
		NormalClass obj = new NormalClass();
		obj.method21();
		obj.method2();
		method22();
		AbstractDemo1.method6();
		method6();
	}

	@Override
	public void method11() {
		// TODO Auto-generated method stub
		
	}
		

}
