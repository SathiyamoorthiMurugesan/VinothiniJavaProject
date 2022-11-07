package overriding;

public class OverrideClassSathyaSample extends Parent {


	
	public static void main(String[] args)

	{
		/*Parent parent = new Parent();
		parent.buyRice();
		parent.buySoap();
		System.out.println();*/

		// OverrideClassSathyaSample child1 = new OverrideClassSathyaSample()
		// child1.buyChocolate();
		// child1.buySoap();
		// child1.buyRice();

		System.out.println(" Overriding:*************** ");
//		This is called overriding. Here we create Object for child with parent as Reference. 
//		We expect parent method to run but during run time, JVM will pick child class method
		Parent test1 = new OverrideClassSathyaSample();
		test1.buyRice();
		test1.buySoap();
		

	}

	public void buySoap() {
		System.out.println("Buy Lux soap");
	}

	public void buyChocolate() {
		System.out.println("Buy chocolate");
	}

	public void buyTV(String name) {
		System.out.println("Buy " + name + " TV");
	}

}

class Parent {

	public void buySoap() {
		System.out.println("Buy Hamam soap");
	}

	public void buyRice() {
		System.out.println("Buy rice for food");
	}

	public void buyTV(int amount) {
		System.out.println("Buy TV for amount " + amount);
	} 
}
