package arrayComplete;

import java.util.Scanner;

public class BasicArray {

	static int arraySize;

	public static void main(String[] args) {
		// Get arraysize as input & array values and then print that array
		getArraySizeFromUser();
		int[] arrayList = getArrayValuesFromUserWithReturn(arraySize, 1);
		printArrayValuesGetFromUser(arrayList);
	}

	public static void getArraySizeFromUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter array inputs");
		arraySize = scan.nextInt();
	}

	public static int[] getArrayValuesFromUserWithReturn(int arraylength, int index) {
		int[] a = new int[arraylength];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Values of" + arraylength + " as input ");
		for (int i = 0; i < arraylength; i++) {
			a[i] = scan.nextInt();
			if (a[i] == a[index]) {
				a[i] = 100 + arraylength;
				System.out.println("Here we find the indexvalue we are searching" + a[i]);
			}
		}
		return a;
	}

	public static void printArrayValuesGetFromUser(int array[]) {
		System.out.print("Array of values are from Print Method: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}

//	    public static void getArrayValuesFromUser(int arraylength) {
//		System.out.println("Output here: for the arraysize of "+arraylength);
//	    for(int i=0;i<a.length;i++)
//	    {
//	    	
//	    	System.out.println("Index" +i+" is "+a[i]);
//	    }
//		}

//		public static void arrayInputs(){
//			//get input for the declared array and biggest among them
//			int[] a = new int[3];
//			// int[] a = new int[] { 1, 3, 4, 5, 6, 1 };
//			int[] a2 = { 1, 2 };
//			int[] a1 = new int[] { 1, 2, 3, 4 };
//			
//			Scanner scan = new Scanner(System.in);
//			for (int i = 0; i < 3; i++) {
//				System.out.println("Enter " + i + " number");
//				a[i] = scan.nextInt();
//			}
//			//Biggest of three no
//			if (a[0] > a[1] && a[0] > a[2]) {
//				System.out.println(a[0] + " is big");
//			} else if (a[1] > a[2]) {
//				System.out.println(a[1] + ": is big");
//			} else {
//				System.out.println(a[2] + " is big");
//			}
}

//		
