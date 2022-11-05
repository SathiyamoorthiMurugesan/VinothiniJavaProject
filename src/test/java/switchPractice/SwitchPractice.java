package switchPractice;

//switch(intCondition) {
//case 1:
//	//content
//	//content
//case 2:
//	//diff content
//	//diff content
//case 3: 
//	//another diff content
//	//another diff content 
//
//}

public class SwitchPractice {

	public static void main(String[] args) {
		SwitchPractice obj = new SwitchPractice();
		obj.testSwitchCondtion(20);
	}

	int value = 10;
	
	public void testSwitchCondtion(int value) {
		switch (this.value) {
		case 10:
			method(10);
			break;
		case 50:
			method(50);
			break;
		case 100:
			System.out.println("Go to hotel");
			break;
		default:
			System.out.println("Stay home");
		
		}
	}
		
		public static void method(int val) {
			System.out.println(val);
		}

}
