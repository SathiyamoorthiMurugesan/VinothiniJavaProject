package ExceptionPractice1;

import java.util.Scanner;

public class ExceedsAmountLimitException extends Exception {

	public ExceedsAmountLimitException(String message)
    {
	  super(message);
	
    }	
//	public ExceedsAmountLimitException(String str)
//    {
//	//	String message = "Enter multiples of 500rs note";
//		String c= method1();
//    }	
//	
//	public String method1()
//	{
//		
//    System.out.println("Enter multiples of 500rs note");
//    return "Vino1";
//	}
	
	
	
	
//	Scanner n = new Scanner(System.in);
//	System.out.print("Enter the number rows :: ");
	
	public static void main(String[] args) {
		
	
	int row = 5;
	int number = 1;
	for(int i=1;i<=6;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(number);
			System.out.print(" ");
		//	if(number<10) { System.out.print("  "); }
		//	if(number>10) { System.out.print(" ");}
			number++;
		}
		System.out.println();
	}		

	}
		
} 


	


