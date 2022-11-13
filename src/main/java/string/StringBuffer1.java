package string;

public class StringBuffer1 {

	public static void main(String[] args) {

		String str1 = "sathya";
		String str2 = "sathya";
		
		System.out.println("Normal string");
		System.out.println("**************");
		System.out.println("string1 values: " + str1);
		System.out.println("string2 values: " + str2);
		str2 = str1.concat(str2);
		
		System.out.println("After string manipualtion");
		System.out.println("string1 values: " + str1);
		System.out.println("string2 values: " + str2);
		
		System.out.println("string builder"
				+ "");
		System.out.println("*************");
		
		StringBuilder SB =new StringBuilder("sathya");
		
		System.out.println(SB.append("VINO"));
		
	}

}
