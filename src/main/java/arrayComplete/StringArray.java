package arrayComplete;

import java.util.Scanner;

public class StringArray {

	static String name[] = { "this", "is", "the", "book","we","which","read","all","the","day" };
	static String str1;

	public static void main(String[] args) {
		StringArray s = new StringArray();
//		s.lengthOfTheStringCalc(name);
//		String name2[] = s.getStringSizeArrayFromUser();
//		s.getStringSizeArrayFromUserwithReturn(4,2);
//		s.printmethod(name2);
		s.ReturnArrayvalueAtIndex(9);
	}

	public void lengthOfTheStringCalc(String name[]) {
		System.out.println("Lenth of String here : " + name.length);
	}

	public String[] getStringSizeArrayFromUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of strings as input");
		int length = scan.nextInt();
		String str1[] = new String[length];

		System.out.println("Enter" + length + "String input here");
		for (int i = 0; i<str1.length; i++) {
			str1[i] = scan.next();
		}
		return str1;
	}
	
	public String[] getStringSizeArrayFromUserwithReturn(int lengthOfString,int index) {
		// get new string through parameter and returns particular string index position
		System.out.println("Get method with return values");
		String str1[] = new String[lengthOfString];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter" + lengthOfString + "String input here");
		for (int i = 0; i<str1.length; i++) {
			str1[i] = scan.next();
		}
		StringArray s = new StringArray();
		s.printmethod(str1);
		
		System.out.println("Index postion : "+ index + ":" + str1[index]);
		return str1;
	}

	public void ReturnArrayvalueAtIndex(int index) {
	System.out.println("Index position: " +index + ", The String is : "+ name[index]);
		
	}
	public void printmethod(String string[]) {
		for (int i = 0; i <string.length; i++) {
			System.out.println(string[i]);
		}
		
	}
}
