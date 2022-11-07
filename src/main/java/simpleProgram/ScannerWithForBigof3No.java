package simpleProgram;

import java.util.Scanner;

public class ScannerWithForBigof3No {

	static int a,b,c;
	static int temp[]= new int[3];
    static int i,v,v1,v2;
	
	public static void main(String[] args) {
	
	System.out.println("Get threee numbers and find biggest one");
  
	for(i=0;i<=2;i++) {
		 System.out.println("Enter no :"+i);	
		 Scanner scan = new Scanner(System.in);
		 temp[i]= scan.nextInt();
	}
	System.out.println("Temp [0]: " +temp[0]);
	System.out.println("Temp [1]: " +temp[1]);
	System.out.println("Temp [2]: " +temp[2]);

	if (temp[0]>temp[1] && (temp[0]>temp[2]))
	{
		System.out.println("First no is big");
	}
	else if (temp[1]>temp[2])
	{System.out.println("second no is big");}
	else
	{System.out.println("Third no is big");
	}
    
    
	}
}


