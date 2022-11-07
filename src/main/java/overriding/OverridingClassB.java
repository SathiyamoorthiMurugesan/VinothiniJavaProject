package overriding;

public class OverridingClassB extends OverridingClassA{

	//overrided methods is possible between two classes - class A to ClassB with same method signature and return types
	//overriding follows here as we created object for classB with reference class as ClassA,
	//at compile time, parent class(reference class) methods gets invoked 
	//at run time,child class methods gets executed. this is called run-time polymorphism
	// overriding not possible for static methods
	
	public static void main(String[] args) {
	OverridingClassA o = new OverridingClassB();
	o.buyRice();
	o.buyCamera(20345);
	o.buyFood(1300);
	
	// static method calling below and why override is not possible ??
	//override possible during object creation for child class with parent class reference 
	//but this object creation is not needed for static methods calling
	OverridingClassA.buySoap();
	
	}

	public int buyRice(){
		System.out.println("overridedclassB classBBB buyrice method");
		return 0;
	}
	
	public static int buySoap()
	{
		System.out.println("Hello yardley soap");
		return 0;
	}
	public void buyWater(int a) {
		System.out.println("overridedclassB buyWater");

	}
	public void buyCamera(int a1) {
		pixel = 1024;
		System.out.println("overridedclassB buyCamera"+ " Camera and its pixel: "+ pixel);

	}
}
