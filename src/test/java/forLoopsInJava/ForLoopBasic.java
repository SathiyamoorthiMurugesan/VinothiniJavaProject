package forLoopsInJava;

//for(initialize; condition; increment/decrement) {
//}
//
//for(initialize; condition) {
//	**content*****
//increment/decrement;
//}

public class ForLoopBasic {

	static int amt;
	static int val = 1;

	public static void main(String[] args) {

		for (int a = 1; a <= 10; a++) {
			System.out.println(a);
		}
		System.out.println("hello");

//		for (int a = 26; a < 31;) {
//			System.out.println(a);
//			a++;
//		}

//		method1();
//		method1();
//		method1();
//		method1();
//		method1();

		for (int i = 1; i <= 5; i++) {
			method1();
		}

		for (int i = 1; i <= 5; i++) {
			int a = 20;
			System.out.println(a);
		}

		int s;

		for (s = 1; s <= 10; s++) {

		}
		System.out.println(s);

		for (amt = 10; amt < 0; amt++) {

		}

//		for (val < 10; val++) {
//
//		}

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				System.out.println(i);
//				System.out.println("***********"+j);
//			}
//		}

//		for (int i = 1; i <= 5; i++) {
//			System.out.println(i);
//			for (int j = 1; j <= 5; j++) {
//				System.out.println("***********"+j);
//			}
//		}

//		for (int i = 1; i <= 5; i++) {
//			System.out.println(i);
//			for (int j = i; j <= 5; j++) {
//				System.out.println("***********" + j);
//			}
//		}

//		for (int i = 1; i <= 5; i++) {
//			System.out.println(i);
//			for (int j = 1; j <= i; j++) {
//				System.out.println("***********" + j);
//			}
//		}

//		for (int i = 1; i <= 5; i++) {
//			System.out.println(i);
//			for (int j = i; j <= i; j++) {
//				int a = 10;
//				i = 30;
//				System.out.println("***********" + j);
//			}
//			System.out.println(a);
//		}

//		for (int i = 1; i <= 5; i++) {
//			System.out.println(i);
//			for (int j = 1; j <= 5; j++) {
//				System.out.println("***********" + j);
//				break;
//			}
//		}

//		for (int i = 1; i <= 5; i++) {
//			System.out.println(i);
//			for (int j = 1; j <= 5; j++) {
//				System.out.println("***********" + j);
//				if (1 == 1) {
//					break;
//				}
//			}
//		}

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				System.out.print( j+" ");
//			}
//			System.out.println();
//		}

//		for (int a = 1; a <= 10; a++) {
//			if(a>5) {
//				break;
//			}
//			System.out.println(a+"&&&&&&");
//		}

//		int temp = 5;
//		for (int a = 1; a <= 10; a++) {
//			if(a>temp) {
//				break;
//			}
//			System.out.println(a+"&&&&&&");
//		}

		
		int val = 29;
		int temp = 0; //flag or indicator
		System.out.println("PRIME NUMBER CHECK*********");
		for (int a = 2; a < val - 1; a++) {
			if (val % a == 0) {
				temp ++;
				System.out.println(val+ " is not prime number");
				break;
			}
		}
		if(temp != 1)
		System.out.println(val+" is prime number");

	}

	public static void method1() {
		System.out.println("I am method1");
	}

}