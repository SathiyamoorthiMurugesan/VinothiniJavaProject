package staticVariables;

 class Emp
{
 int eid;
 static int salary;
 static String ceoName;

public  void show()
{
	Emp e = new Emp();
	System.out.println("eID: "+ e.eid + "  Salary: " +salary+ "   CEO Name : " + ceoName);
	e.eid = 127;
	salary = 14600;
}
}

public class StaticVariables2 extends Emp {

	public static void main(String[] args) {
		
		StaticVariables2 E = new StaticVariables2();
		E.eid = 123;
		salary = 13000;
		ceoName = "markzuckerberg";
		System.out.println("EID: "+ E.eid + "  Salary: " + salary+ " ceoName :" + ceoName); 	
		E.show();
		System.out.println("Main method print:   "+"  EID: "+ E.eid + "Salary: " + salary); 
		StaticVariables2 s = new StaticVariables2();
		s.method1();
		System.out.println("*************************************");
		System.out.println("Final Main method print:   "+"  EID: "+ E.eid + "  Salary: " + salary);
		E.method2();
		E.show();
	}
	
	public void method1()
	{  
		System.out.println("Method print callling: " + " EID: "+ eid + " Salary: " + salary); 
	}

	public void method2()
	{
		eid=1244;
		ceoName = "Davis karlson";
		System.out.println("EID: "+ eid + "  Salary: " + salary + "  ceoName : "+ ceoName);
		salary = 12;
		
	}
	
	// salary and employee details fetch program with static and its object creation//
	
	/*	Emp E1 = new Emp();
	E1.eid = 445;
	E1.salary = 45000;
	
	Emp E2 = new Emp();
	E2.eid = 446;
	E2.salary = 41000;
	
	Emp E3 = new Emp();
	E2.eid = 447;
	E2.salary = 45000;
	
	E2.salary = 51000;
	
	E1.show();
	E2.show();*/
	
}
