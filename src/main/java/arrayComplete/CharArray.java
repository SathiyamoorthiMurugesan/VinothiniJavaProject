package arrayComplete;

import java.util.Scanner;

public class CharArray {

	static int sizeOfChar;
	
	public static void main(String[] args) {
//		 clarificationNeeded();
//		 funtion();
		getCharArraySize();
		System.out.println("Please provide" + sizeOfChar +" inputs:");
		char[] characterPrint = getCharArrayValueFromUserWithReturn(sizeOfChar);
		PrintCharArrayValuegetFromUser(characterPrint);
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

	public static void funtion() {
		char[] c = new char[] { 'C', 'D', 'E' };
		for (int i = 0; i < 3; i++) {
			System.out.println(c[i]);
		}
	}

	public static void clarificationNeeded() {
		char[] C = new char[5];
		char[] c = { 'd', 'g' };

		System.out.println(c);

		int[] a = new int[3];
		int[] a1 = { 1, 3 };

		System.out.println(a1);
	}

}
