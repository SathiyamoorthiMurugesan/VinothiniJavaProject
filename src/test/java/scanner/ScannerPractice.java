package scanner;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println();
//		System.out.println(true);
//		System.out.println('c');
//		System.out.println("abc");
//		
//		System.out.print('c');
//		System.out.print("Sathya");
		
//		System.out.print("Please enter a number: ");
//		int val = scan.nextInt();
//		System.out.println("You have entered "+val);
		
		
//		System.out.print("Please enter a name: ");
//		String val1 = scan.next();
//		System.out.println("You have entered "+val1);
		
		System.out.println("Please enter 10 numbers: ");
		for(int i =1; i<=10; i++) {
			 System.out.println(scan.nextInt());
		}
		 

	}

}
