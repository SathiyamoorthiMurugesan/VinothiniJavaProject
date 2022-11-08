package arrayComplete;

public class ArrayClass {

	public static void main(String[] args) {
	//method1();
	method2();
	}
		
		
	public static void method2()
    {
    	int a[] = {1,2,4,29};
    	
    	//normal for loop
//    	System.out.println("\"Display Array\"");
//    	for (int i=0;i<4;i++)
//    	{
//    		System.out.println(+a[i]);
//    	}
    	
    	//For-Each
    	System.out.println("\"Display Array\"");
		for (int a1 : a)
		{
		System.out.println(a1);	
		
		}
		System.out.println("length of array"+a.length);
    	
    }
	public static void method1() {
		String onePlus[] = { "5", "5T", "6", "6T", "10Pro" };
		
	// index - each value is present at a specific index. index of 5 is 0, index of
		// 10pro is 4;
		// length - total items in array. here it is 5;

//* We know the length of array here. But later, in java, many concepts will come where do not know the length. 
//		That time we can not use normal for loop. We could use forEach only.
//* 

//		for (int i = 0; i < 5; i++) {
//			if (i!=2 && i!=4) {
//				System.out.println(onePlus[i]);
//			}
//		}
		
		System.out.println("Hello \"Algorithm\" vino is good to \"start\" classes");
		int temp=0;
		for (String var : onePlus)
		{
			if (temp!=3 &&  var == "5T"){
			System.out.println("positive");
			temp++;
			System.out.println(var);
			
			}
			System.out.println("printing mobile phone"+var);
		}
		}
}
