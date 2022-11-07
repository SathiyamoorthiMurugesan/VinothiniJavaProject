package simpleProgram;

import java.util.Scanner;

public class ConditionalClass {

	//static int a = 100;
	//static int b = 111;

	public static void main(String[] args) {
//		
//		System.out.println("enter the value of A: ");
//		Scanner scan= new Scanner(System.in);
//		int a = scan.nextInt();
//		System.out.println("enter the value of B: ");
//		int b= scan.nextInt();
		
	//	method1();
	//	nestedMethod();
	//	boolean t = nestedMethod2(a,b);
	//	System.out.println(t);
	//	nestedMethod3();
		sumOfNaturalNumber();
		
	}

	// Nested if
//
//	public static void method1() {
//
//		int a = 10;
//		int b = 4;

		// pgm-1: Nested if else statement
		// thing is first if statement should pass to execute next if statement of code

//		if (a >= b) {
//			System.out.println("hello1");
//			if (a != 10) {
//				System.out.println("Equals");
//			} else if (b > 4) {
//				System.out.println("undefined");
//			} else if (b == 4) {
//				System.out.println("nested if");
//			}
//		}
//		
		// pgm-2: Nested if - first statement should pass to execute next line of code

//		if (a !=12) {
//			System.out.println(a + " is divisible by 2");
//			System.out.println("first condition failed");
//		
//			if (a == 12) {
//				System.out.println(a + " is divisible by 3");
//				System.out.println("second condition failed");
//				
//				//content
//			}
//		}

//		if (a>b)
//		{
//			System.out.println("A="+a+" is greater than: "+ "B="+b);
//		}
//		else
//		
//			System.out.println("A="+a+" is lesser than: "+ "B="+b);

		// verify b is even or odd

//		if (b%2==0)
//		{
//			System.out.println(a+ " is even number");
//		}
//		else {
//			System.out.println(b + " is odd number");
//		}

		// verify a is divisible by 2 or 3 or 4

//		if (a % 2 == 0)
//		{   
//			System.out.println(a+ "is divisible by 2"); 
//		}
//			else if (a % 3 == 0)
//			{
//				System.out.println(a + " is divisible by 3");
//			}
//			else if (a % 4 == 0)
//			{
//				System.out.println(a+ "is divisble by 4");
//			}
//			else { System.out.println(a + " is not divisible by 2 or 3 or 4");
//			     }

		// Verify number divisble by 2 and 3
//
//		if (a % 2 == 0)
//		{   // System.out.println(a + " is divisible by 2");
//			if (a % 3 == 0) {
//				System.out.println(a + " is divisible by 3");
//			}
//		System.out.println(a + " is divisble by 2 or 3");
//		}

	

//	public static void nestedMethod() {
//		int a = 5;
//		int b = 3;
//
//		if (b == 3) {
//			System.out.println("value : " + a + " is A");
//			if (a != 5) {
//				System.out.println(a + "looks fine");
//			} else if (a >= 5) {
//				System.out.println("hello zuties");
//			} else
//				System.out.println("Zero results");
//
//		}
//	}

//	public static boolean nestedMethod2(int a, int b) {
//
//		if (a % 2 == 0){
//            System.out.println("A is divisble by 2");
//		
//            if (b%4==0) {
//             System.out.println("A is divisible by 4");
//            }
//           // else {System.out.println("Fail");}
//		}
//		System.out.println("Success");
//		return true;
//
//	}
//	public static int nestedMethod3()
//	{
//		
//		
//		int a =10;
//		int b=5;
//		
//		if (a>=5)
//		{
//			System.out.println("A is big : " +a);
//		}
//		
//		if (b>=3)
//		{
//		System.out.println("B is very bigger one");	
//		}
//		
//		return 1;
//	}
	
	public static void sumOfNaturalNumber()
	{
		int sum =1;
		for (int i=1;i<10;i++)
		{
			sum =sum+1;	
		}
		System.out.println("Sum of numbers: "+sum);
	}

}
