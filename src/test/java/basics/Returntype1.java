package basics;

public class Returntype1 {
	
	public static void main(String[] args) {
		Returntype1 obj = new Returntype1();
		obj.buyRice();
		obj.buySoap(100);
		
//		System.out.println(obj.buyRice());
		System.out.println("Simply print a method with a return type " +obj.buySoap(300));
		
		int returnedBalance = obj.buySoap(100);
		System.out.println("Store returned value in a variable and print "+returnedBalance);
		
	}
	
	public void buyRice() {
		System.out.println("Bought rice");
	}
	
	
	public int buySoap(int soapAmount)  {
		int boughtSoapAmount = 50;
		int balanceAmount = soapAmount - boughtSoapAmount;
		System.out.println(balanceAmount);
		return balanceAmount;
	}
	
	public String buyShampoo() {
		
		
		return null;
		
	}
	
	
	
	
}
