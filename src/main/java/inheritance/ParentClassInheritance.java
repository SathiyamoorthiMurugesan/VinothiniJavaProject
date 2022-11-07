package inheritance;

public class ParentClassInheritance {

	 protected static int years =2302 ;
	 static String medical,vision;
	 static String pptName;
	 static String dental= "DHMO";
	 
		
	public static void main(String[] args) 
	{
		ParentClassInheritance p = new ParentClassInheritance();
		System.out.println("dental before Annual enrl Process:  " + dental);
	    String dental = p.pannualEnrl(2022,vision);
	    p.planAvlb();
		System.out.println("dental after Annual enrl Process:  " + dental);
	    
	}	

		protected String planAvlb ()
		{ 
		String flexStatus = "FTNU" ;
		System.out.println("flexStatus : "+flexStatus );
		System.out.println("dental after Annual enrl Process:  " + dental);
		return flexStatus;
			
		}
		
		public String pannualEnrl(int years,String vision)
		{
			System.out.println("Eligible for AE elections" + years);
			medical = "HDHP";
			String dental = "HelloDental";
			System.out.println("Medical:    "+ medical +"   Dental : "+ dental +"      Vision: " + vision);
			return dental;
		}
		

}






