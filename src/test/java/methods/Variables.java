package methods;

public class Variables {
	
	int a = 250;
	static int b = 100;
//	Variables vari1 = new Variables();
	
	public void method1() {
		int a = 10;
		System.out.println(a);
		System.out.println(b);
//		static int xyz = 23;
	}
	
	public void method2() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Variables vari = new Variables();
		vari.method1();
		vari.method2();
		System.out.println(vari.a);
		System.out.println(b);
	}

}
