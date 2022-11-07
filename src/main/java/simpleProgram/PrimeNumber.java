package simpleProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int val=14;
		int i,temp =0;
		System.out.println("Find the no is prime no or no");
		for(i=2;i<val;i++)
		{
			if (val%i==0)
			{
			temp++; // Flag to update temp values//
			System.out.println("Number is Not a prime no");
			break;
			}	
		}
		if(temp ==0)
		{
		System.out.println("number is a prime no");
		}
}
	
}
