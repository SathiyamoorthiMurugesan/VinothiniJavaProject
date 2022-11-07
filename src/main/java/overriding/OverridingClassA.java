package overriding;

// overriding methods (based on method signature)with in this package of sub-class
public class OverridingClassA extends ClassBBB {

	int az = 1200;
	public static void main(String[] args) {
		 ClassBBB b = new OverridingClassA();
		 b.buyRice();
		 b.buyWater(2000);
		 b.buyCamera(b.pixel);
		 System.out.println(b.pixel);
	}	
	public int buyRice() {
		System.out.println("Child class buyRice");
		return 0;
	}		
	
	public void buyWater(int pixel) {
		System.out.println("Child Class buyWater: " + az);

	}
	
	public void buyCamera(int a1) {
		pixel =2024;
		System.out.println("child class buyCamera"+ " Camera and its pixel: "+ pixel+ "AZ: "+az);

	}
}
 class ClassBBB {
	
    int pixel =1010;
	
	public int buyRice(){
		System.out.println("Parent classBBB buyrice method");
		return 0;
	}
	
	public void buyWater(int a) {
		System.out.println("parent ClassBBB buyWater");

	}
	public void buyCamera(int a1) {
		pixel = 1024;
		System.out.println("Parent ClassBBB buyCamera"+ " Camera and its pixel: "+ pixel);

	}
	
	public void buyFood(int a1) {
		int Quantity = 10;
		System.out.println("Parent ClassBBB buyFood and its items: "+ Quantity);

	}
	public static int buySoap()
	{
		System.out.println("Hello hammam soap");
		return 0;
	}
	
}




