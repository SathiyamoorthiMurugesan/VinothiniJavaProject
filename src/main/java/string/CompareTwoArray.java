package string;

public class CompareTwoArray {

	public static void main(String[] args) {
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i);
//		}
		
		arrayComparison();
		
	}

	public static void arrayComparison() {
		int a[] = { 1, 5, 6, 7 };
		int a1[] = { 1, 6, 7, 9 };
		// int temp = 0;

		if (a.length != a1.length) {

			System.out.println("Arrays are not Equal");
		} else {
			System.out.println();

			int temp = 0;
			for (int i = 0; i < a.length; i++) {
				System.out.println("a array value " +a[i]);
				temp = 0;
				for (int j = 0; j < a1.length; j++) {
					System.out.println(a1[j]);
					if (a[i] == a1[j]) {
//						System.out.println("hello");
						temp++;
						break;
					}
				}
				if (temp == 0) {
					System.out.println("Arrays are not Equals");
					break;
				}
			}
			if (temp != 0) {
				System.out.println("Arrays Equals");
			}
		}

	}

}
