package arrayComplete;

import java.util.Scanner;

public class CharArray {

	static int sizeOfChar;
	static char name[] = new char[] { 'v', 'a', 't', 'h', 'y', 'a' };

	public static void main(String[] args) {
		// methodn();
		// int length1 = FindLengthOfArray(name);
		// arrayCalculation(length1);
		forEachArray(name); // for each character array

		// clarificationNeeded();
		// getCharArraySize();
		// System.out.println("Please provide" + sizeOfChar +" inputs:");
		// char[] characterPrint = getCharArrayValueFromUserWithReturn(sizeOfChar);
		// PrintCharArrayValuegetFromUser(characterPrint);
	}

	public static int FindLengthOfArray(char array[]) {
		int length = array.length;
		System.out.println("length of stirng : " + length);
		return length;
	}

	public static void arrayCalculation(int length) {

		char name2[] = { 'S', 'a', 't', 'h', 'y', 'a', 'h' };
		int length3 = name2.length;
		if (length3 == length) {
			System.out.println("ready to go");
		} else {
			System.out.println("is not equals and keep trying");
		}
	}

	public static void forEachArray(char name[]) {
		for (char nameString : name) {
			System.out.print(nameString);
		}
	}

	public static void getCharArraySize() {
		System.out.println("Enter Array Size");
		Scanner scan = new Scanner(System.in);
		sizeOfChar = scan.nextInt();
		// getCharArrayValueFromUser(sizeOfChar);
	}

	public static void getCharArrayValueFromUser(int charSize) {
		char characterOfString[] = new char[charSize];
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Character to print");
		for (int i = 0; i < charSize; i++) {
			characterOfString[i] = scan.next().charAt(0);
		}
		// PrintCharArrayValuegetFromUser(characterOfString);
	}

	public static char[] getCharArrayValueFromUserWithReturn(int charSize) {

		char[] characterOfString1 = new char[charSize];
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter char to print");
		for (int i = 0; i < charSize; i++) {
			characterOfString1[i] = scan.next().charAt(0);
		}
		return characterOfString1;
	}

	public static void PrintCharArrayValuegetFromUser(char[] CharArray1) {

		System.out.println("char values are below");
		for (int i = 0; i < CharArray1.length; i++) {
			System.out.println(CharArray1[i]);
		}
	}

	// just for clarification below

	public static void clarificationNeeded() {
		// char[] c = new char[5];
		/* char or byte */ byte[] c = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'i' };

		for (int i = 0; i < 8; i++) {

			System.out.println(c[i]);
		}

		int[] a = new int[3];
		int[] a1 = { 1, 3 };

		// System.out.println(a1);
	}

}
