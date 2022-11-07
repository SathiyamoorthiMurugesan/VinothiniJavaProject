package simpleProgram;

import java.util.Scanner;

public class ScannerFindBiggestNo {
	static int val,val1,val2;

	public static void main(String[] args) {
		System.out.println("Find biggest one");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first no:");
		val =scan.nextInt();
		System.out.println("enter Second no:");
		val1=scan.nextInt();
		System.out.println("Enter third no: ");
		val2=scan.nextInt();
		if (val>=val1 && val>=val2){
		System.out.println("Value: "+val+" is big");
		}
		else if (val1>val2)
		{System.out.println("Value: "+val1+" is big");}
		else 
		{System.out.println("Value: " +val2+" is big");}
    }
}
