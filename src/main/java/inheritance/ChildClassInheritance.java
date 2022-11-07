package inheritance;

public class ChildClassInheritance extends ParentClassInheritance {

	public static void main(String[] args){
		
		System.out.println("Dental Plan before object creation :" + dental);
		System.out.println("***********************************************");
		
		ChildClassInheritance c = new ChildClassInheritance();
	    c.planAvlb();
	    
		
	   // c.newHireEnrl(2023);
	    String dental = c.pannualEnrl(2024, "visionplus");
	    System.out.println("dental after Annual enrl Process: " + dental);
	 //   c.planAvlb();
	  //  c.newHireEnrl(years);
	    System.out.println("Final o/p: " + dental);

	}
	
	
	public void newHireEnrl(int years)
	{
		System.out.println("Eligible for NewHire elections:   " + years);
		medical = "HDHP";
	   	System.out.println("Medical: "+ medical +" Dental : "+ dental +"  Vision: " + vision);
			
		}
		
		
	}

