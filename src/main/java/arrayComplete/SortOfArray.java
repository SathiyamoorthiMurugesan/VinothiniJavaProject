package arrayComplete;

public class SortOfArray {

	public static void main(String[] args) {

		int[] a = new int[] { 3, 600, 1, 8, 99, 11, 45 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = 0;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("Array sorting of elements here");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
	}

}
