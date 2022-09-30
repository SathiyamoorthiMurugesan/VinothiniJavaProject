package interfaceInJava;

public class TestClass1 implements LearnInterface{

	int classVariable = 100;
	public static void main(String[] args) {
		TestClass1 test = new TestClass1();
		test.rule3(); //default method in interface
		LearnInterface.rule2(); //static method in interface
		System.out.println(test.classVariable);
		System.out.println(a);
		System.out.println(LearnInterface.a1);
		System.out.println(test.classVariable = 250);
//		System.out.println(a = 150);
		
	}

	@Override//annotation or tag
	public void rule1() {
		System.out.println("this is method from interface");
	}

	@Override
	public void rule22(int s) {
		// TODO Auto-generated method stub
		
	}
	
	public void method1() {
		System.out.println("this is test method");
	}

}
