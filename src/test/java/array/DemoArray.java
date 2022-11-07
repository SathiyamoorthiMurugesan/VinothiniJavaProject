//	* Container object that holds the fixed number of values of a same datatype
//	* In Java, array is a data type
//	* It also holds String (non-primitive data type)
//	* Array index always starts with zero
//	* We declare array with below values 
//		* int arr[] = new int[5]; 
//			OR int[] arr = new int[5];
//			OR int[] arr = new int[] {1, 2, 3, 4, 5};
//			OR int arr[] = {1, 2, 3, 4, 5};
//			OR int[] arr = {1, 2, 3, 4, 5};
//		* int - daya type
//		* [] - array
//		* arr - array variable
//		* new - key word in java
//		* 5 - size

//	* We can not directly sysout array. For that, we need to use either Arrays class or for loops
//		* Arrays is a pre-defined class in Java.
//		* It contains many static methods to manipulate and access array elements

//	* user defined array variable provides us, clone method and length variable
//		* clone method - helps us to copy an array
//		* length variable is used to get the size of the array

package array;

import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {

		DemoArray obj = new DemoArray();

		int ar[] = new int[3];
//		ar = {10, 20, 30};
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
//		ar[3] = 40;
//		ar[4] = 45;

		System.out.println(ar);

		obj.returnSingleValueFromAnIntArray(0);
		obj.returnSingleValueFromAnIntArray(1);
		obj.returnSingleValueFromAnIntArray(2);
//		obj.returnSingleValueFromAnArray(3);
		
		int valueInTheGivenIndex = obj.getIntArrayFromUserAndReturnAnIndexValue(2, 2);
		System.out.println("Value in the given index is "+valueInTheGivenIndex);
		
		System.out.println("Hello");

//		System.out.println("Please enter \"4\" numbers");
//		System.out.println("Please enter "+arrayLength+" numbers");
//		System.out.println("Please enter '"+arrayLength+"' numbers");
//		System.out.println("Please enter \""+arrayLength+"\" numbers");

	}

	public void printIntArrayUsingBasicForLoop(int[] array) {
		System.out.println("Values in the array are");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public void printIntArrayUsingForEach(int[] arr) {
		for (int eachValue : arr) {
			System.out.println(eachValue);
		}
	}

	public void intArrayLength(int[] arr) {
		System.out.println(arr.length);
	}

	public void cloneIntArray(int arr[]) {
		int ar2[] = arr.clone();
		System.out.println("Cloned array");
		printIntArrayUsingBasicForLoop(ar2);
	}

	public int[] returnAnArray() {
		int len[] = { 1, 2, 3, 4, 5 };
		System.out.println(len.length);
		return len;
	}

	public void getIntArrayFromUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter int array size: ");

		int arrayS = scan.nextInt();

		System.out.println("Please enter " + arrayS + " numbers");

		int arr[] = new int[3];

		for (int i = 0; i < arrayS; i++) {
			arr[i] = scan.nextInt();
		}

		printIntArrayUsingBasicForLoop(arr);
	}

	public int[] getIntArrayFromUser(int arrayLength) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter " + arrayLength + " numbers");

		int arr[] = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			arr[i] = scan.nextInt();
		}

		printIntArrayUsingBasicForLoop(arr);

		return arr;
	}

	public int returnSingleValueFromAnIntArray(int index) {
		int ar[] = new int[3];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;

		System.out.println(ar[index]);

		return ar[index];

	}

	public int getIntArrayFromUserAndReturnAnIndexValue(int arrayLength, int index) {
		int[] testArray = getIntArrayFromUser(arrayLength);
		
		try {
//			System.out.println(testArray[index]);
			return testArray[index];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error message: "+e.getMessage());
			System.out.println("index should be anything less than length "+ arrayLength);
			return 0;
		}
//		return testArray[index];
	}

}
