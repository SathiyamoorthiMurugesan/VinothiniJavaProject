package staticVariables;

public class StaticVariables3 extends StaticVariables2{

	public static void main(String[] args) {
		
		StaticVariables3 s= new StaticVariables3();
		s.show();
		salary = 12000;
		s.method2();
		System.out.println("EID: "+s.eid + "Salary: " + salary);
	    int salary1= s.method51();
	    System.out.println(salary1);
	    	   
	}
	
	public int method51()
	{
	    System.out.println("Method51 calling function");
		return salary;
	}
	

}
