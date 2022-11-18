package collection1;

public class DuplicateArrayPractice {

	public static void main(String[] args) {
		int a[] = { 22, 10, 1, 23, 22, 3, 89, 49, 22 };

		int count = 0;
		System.out.println("Find duplicate elements and count of duplicates in array");
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					System.out.println(a[i]);
				}
			}
		}

		if (count != 0) {
			System.out.println("Duplicate of array count: " + count);
		}

	}

}
