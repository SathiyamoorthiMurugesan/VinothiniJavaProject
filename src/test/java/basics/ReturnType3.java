package basics;

public class ReturnType3 {
	
	static int returnedValue;

	public static void main(String[] args) {
		ReturnType3 obj = new ReturnType3();
		obj.method1();
		obj.getLocalVariableThroughMethod();
	}
	
	public int buySoap() {
		int a = 50;
		return a;
	}
	
	public void method1() {
		System.out.println(buySoap());
		System.out.println(returnedValue);
		System.out.println("returnedValue");
	}
	
	public void getLocalVariableThroughMethod() {
		int amount = 100 - buySoap();
//		int amount = 100 - 50;
		System.out.println(amount);
		
		System.out.println(var);
		giveLocalVariableValueThroughClassVariable();
		System.out.println(var);
	}
	
	int var;
	
	public void giveLocalVariableValueThroughClassVariable() {
		int b = 50;
		var = b;
	}
	

}
