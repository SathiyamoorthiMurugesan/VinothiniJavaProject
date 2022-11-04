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

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print( j+" ");
			}
			System.out.println();
		}

	}

	public static void method1() {
		System.out.println("I am method1");
	}

}