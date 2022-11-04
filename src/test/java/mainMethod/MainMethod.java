package mainMethod;

//* JVM always looks for main method
//* main method signature should not be changed, because JVM always looks for main(String[] args)
//* we can write it as public static void main or static public void main
//* Since its public, it can be accessed anywhere in the project
//* We dont need to create object to call main method. Since main method is the one which runs very first by JVM, we keep it as static
//	so that JVM can access it without creating object
//* JVM is not going to return anything, thats why keep main as void
//* We can overload main method
//* Since main method is static, we can not override it
//* We can not declare a static variable inside main method

public class MainMethod {
	
	public static void main(String[] args) {

//			static int a = 10;
		}
		
		public static void main() {
			
		}
		
		public static void main(int a) {
			
		}

}
