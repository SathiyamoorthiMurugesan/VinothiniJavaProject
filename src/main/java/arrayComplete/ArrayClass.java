package arrayComplete;

public class ArrayClass {

	public static void main(String[] args) {
		
		String onePlus[] = { "5", "5T", "6", "6T", "10Pro" };

		// index - each value is present at a specific index. index of 5 is 0, index of
		// 10pro is 4;
		// length - total items in array. here it is 5;

//* We know the length of array here. But later, in java, many concepts will come where do not know the length. 
//		That time we can not use normal for loop. We could use forEach only.
//* 

		for (int i = 0; i < 5; i++) {
			if (i!=2 && i!=4) {
				System.out.println(onePlus[i]);
			}
		}
		
		
		System.out.println("Hello \"Algorithm\" vino is good to \"start\" classes");
		for (String var : onePlus)
			System.out.println(var);

//		System.out.println("For each**********");
//		for (String eachPhone : onePlus) {
//			System.out.println(eachPhone);
//		}
//		
	}

}
