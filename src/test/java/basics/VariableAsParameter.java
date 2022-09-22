package basics;

public class VariableAsParameter {
	
	int a = 10;
	int soapAmount = 20;
	
	String a1 = ""; //empty
	String b1 = " "; //blank 
	String c1 = "null"; //value
	String d1 = null; //null
	String e1; //null
	
	public static void main(String[] args) {
		VariableAsParameter obj = new VariableAsParameter();
		obj.buySoap();
		obj.buySoap("Mysore");
		obj.buySoap(null);
		obj.buySoap("null");
		obj.buySoap("");
		obj.buySoap("               ");
		obj.buySoap("Hamam");
		buySoap(25);
	}
	
	public void buySoap() {
		System.out.println("Bought soap");
	}
	
	public void buyLuxSoap() {
		
	}
	
	public void buyHamamSoap() {
		
	}
	
	public static void buySoap(int soapAmount) {
		System.out.println(soapAmount);
		System.out.println("Bought soap for rupees "+soapAmount);
		System.out.println("Bought soap for "+soapAmount+       " rupees");
	}
	
	public void buySoap(String soapName) {
		System.out.println("Bought "+soapName+" soap");
	}
	
	public void buySoap(String soapName, int soapAmount) {
		
	}
	
	public void buySoap(int soapAmount, String soapName) {
//		System.out.println(amount);
	}
	
	public void buyShampoo(int amount) {
		
	}

}
