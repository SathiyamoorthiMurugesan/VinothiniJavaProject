package arrayComplete;

import java.util.Scanner;

public class IntArray {

	static int arraySize, sizeofArray;
	static int a[] = new int[arraySize];

	public static void main(String[] args) {
		sizeofArray = getIntArraySizeFromUser();
		getIntArrayValueFromUser(sizeofArray);
		int ReturnedValue[] = getIntArrayFromUserandReturnValue(sizeofArray);
		printIntArray(ReturnedValue);
		System.out.println();
		// printIntArray(f);
//		int[] a = new int[];
//		a[0] = 20;
//		a[2]=100;
//		a[1]= 40;

	}

	public static int getIntArraySizeFromUser() {
		System.out.println("getting length of array");
		Scanner scan = new Scanner(System.in);
		arraySize = scan.nextInt();
		return arraySize;
	}

	public static void getIntArrayValueFromUser(int arraySize) {
		int arra[] = new int[arraySize];
		System.out.println("Getting \"array\" values");
		for (int i = 0; i < arraySize; i++) {
			Scanner scan1 = new Scanner(System.in);
			arra[i] = scan1.nextInt();
			// printIntArray(arra);

		}
	}

	public static void printIntArray(int[] array) {
		System.out.println("Print Array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}

	}

	public static int[] getIntArrayValueFromUserWithParameter(int arraySize, int index) {
		int arra[] = new int[arraySize];
		System.out.println("Getting \"array\" values");
		for (int i = 0; i < arraySize; i++) {
			Scanner scan1 = new Scanner(System.in);
			arra[i] = scan1.nextInt();
		}
		return arra;
	}

	public static int[] getIntArrayFromUserandReturnValue(int sizeofArray) {
		sizeofArray = getIntArraySizeFromUser();
		int arr1[] = getIntArrayValueFromUserWithParameter(sizeofArray, 1);
		return arr1;
	}
}
