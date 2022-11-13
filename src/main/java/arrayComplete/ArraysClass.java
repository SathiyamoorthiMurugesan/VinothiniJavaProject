package arrayComplete;

import java.util.Arrays;

public class ArraysClass {

	static int a[] = { 5, 6, 12, 67, 88, 43, 564, 12, 134 };
	static char c[] = { 'c', 'a', 't', 'h', 'e', 'n', 'y', 'a' };
	static int parallelSort1[] = { 67, 87, 1, 541, 56, 0, 23, 100, 32 };
	static char parallelSort2[] = { 'v', 'z', 'a', 'a', 't', 'h', 'i', 'n','i' };
	static int index1 =1,index2=4;

	public static void main(String[] args) {
		// normalSort();
		//parallelSort(parallelSort1);
		parallelSort(parallelSort2,index1,index2);
	}

	public static void parallelSort(char[] parallelSort2,int index1,int index2) {
		Arrays.parallelSort(c, index1, index2);
		System.out.println("Parallel Sorting2 array elements");
		PrintCharArray(parallelSort2);
	}

	
	public static void parallelSort(int[] parallelSort1) {
		Arrays.parallelSort(parallelSort1);
		System.out.println("Parallel Sorting array elements");
		PrintIntArray(parallelSort1);
	}
	
	public static void normalSort() {
		Arrays.sort(a);
		System.out.println("sort int array elements");
		PrintIntArray(a);
//	Arrays.sort(c);
//	System.out.println("sort char array elements");
//	PrintCharArray(c);
		System.out.println("sort char array elements");
		Arrays.sort(c, 2, 6);
		PrintCharArray(c);

	}


	public static void PrintIntArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void PrintCharArray(char array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}
}
