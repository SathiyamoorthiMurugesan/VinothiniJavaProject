package constructor;

public class ConstructorSchoolDemo {
	
	public String rollNo, name, age;
	public String standard = "1st std";
//	public String standard;
	
	
	public ConstructorSchoolDemo() {
		
	}
	
//	public ConstructorSchoolDemo(String rollNo, String name, String age) {
//		System.out.println(rollNo+"   "+name+"   "+age);
//	}
	
	public ConstructorSchoolDemo(String rollNo, String name, String age) {
//		standard = "2nd";
		System.out.println(rollNo+"   "+name+"   "+age+"   "+standard);
	}
	
	public ConstructorSchoolDemo(String rollNo, String name, String age, String standard) {
		System.out.println(rollNo+"   "+name+"   "+age+"   "+standard);
	}
	
	public static void main(String[] args) {
		ConstructorSchoolDemo student1 = new ConstructorSchoolDemo();
		student1.rollNo = "1";
		student1.name = "A";
		student1.age = "10";
		student1.standard = "LKG";
		System.out.println(student1.rollNo+"   "+student1.name+"   "+student1.age+"     "+student1.standard);
		
		ConstructorSchoolDemo student2 = new ConstructorSchoolDemo();
		student2.rollNo = "2";
		student2.name = "B";
		student2.age = "10";
		student1.standard = "1st";
		
//		System.out.println(student2.rollNo+"   "+student2.name+"   "+student2.age);
		
		ConstructorSchoolDemo studentNew1 = new ConstructorSchoolDemo("1", "A", "10");
		ConstructorSchoolDemo studentNew2 = new ConstructorSchoolDemo("2", "B", "10");
		ConstructorSchoolDemo studentNew3 = new ConstructorSchoolDemo("3", "A", "10");
		ConstructorSchoolDemo studentNew4 = new ConstructorSchoolDemo("3", "A", "10", "5th");
		
//		ConstructorSchoolDemo studentNew1 = new ConstructorSchoolDemo("1", "A");
		
	}
}
