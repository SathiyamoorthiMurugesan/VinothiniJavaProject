package ExceptionPractice1;

public class AtmMachineClass  {

	static int inputAmount = 400;
	static int amount = 0;
	static String message;
	
	public static void main(String[] args) throws ExceedsAmountLimitException {
		
		atmMachineCalc("HelloException");
	
	}	
	public static void atmMachineCalc(String messa) 
		{
			try {
				if ((inputAmount >= 500)|| (inputAmount <=500))
				{
		        int note500 = inputAmount % 500;
		        amount = note500;
		        System.out.println(note500);
		        System.out.println("Input Amount: " + inputAmount);
				}
				if (amount == 0) 
		        {
			    System.out.println("Dispense cash: " + inputAmount);
		        }
				else {

			    	throw new ExceedsAmountLimitException("Enter multiples of 500rs note");
	    	         }
			}
			catch(ExceedsAmountLimitException e1)
			{
				System.out.println("Invalid transaction Exception occured");
				System.out.println("success");
			    System.out.println("we can do other transaction"); 
		    } 
						System.out.println("Hello");
		}
}
		
		    
	 

		


