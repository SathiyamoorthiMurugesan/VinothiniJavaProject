package basics;

public class ReturnType2 {

	public static void main(String[] args) {
		ReturnType2 obj = new ReturnType2();
		int amountReturned = obj.buySoap();
		obj.buyShampooAfterSoap(amountReturned);
		obj.buyShampooAfterSoap(100);
		
		obj.buyShampooAfterSoap(obj.buySoap());
//		obj.buyShampooAfterSoap(100);
		
	}
	
	public int buySoap() {
		
		return 100;
	}
	
	public void buyShampooAfterSoap(int soapBalanceAmount) {
		System.out.println("Bought Shampoo");
	}
	
	public void buyChocolateAfterSoap() {
		System.out.println("Bought Shampoo");
	}
	
}
