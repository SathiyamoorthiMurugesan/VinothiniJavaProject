package simpleProgram;

public class ForEach {
	
	static String[] name = {"kavi","Vino1","Karthick","Kavi","prabu"};
	static String e1;
	 static String temp;
	

	public static void main(String[] args) {
		
	
		for(String e1 : name)
		{
			// System.out.println(e1);
			temp=e1;
		
			if (e1 == "kavi1")
			{
				System.out.println(e1+"String found");
				break;
			}
			
			else 
			{System.out.println(e1+"String not found");
			}
		}
	}	

}
