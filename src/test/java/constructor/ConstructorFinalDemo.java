package constructor;

public class ConstructorFinalDemo {
	
	final int a;
	
	public ConstructorFinalDemo() {
		a = 101;
//		a = 102;
	}
	
	public ConstructorFinalDemo(int a) {
		this.a = a;
	}
	
	public void method1() {
//		a = 10;
	}

	public static void main(String[] args) {
		ConstructorFinalDemo test = new ConstructorFinalDemo(200);
		ConstructorFinalDemo test1 = new ConstructorFinalDemo(220);
		System.out.println(test1.a+100);
	}

}

class FinalTest {
	final int test;
	
	public FinalTest() {
		test = 10;
	}
	
	public FinalTest(int a) {
//		test = 15;
		test = a;
	}
	
	public void interestCalculationForEducationLoan() {
		FinalTest obj1 = new FinalTest();
		System.out.println(obj1.test);
	}
	
	public void interestCalculationForPersonalLoan() {
		FinalTest obj2 = new FinalTest(16);
		System.out.println(obj2.test);
	}
	
	
}
