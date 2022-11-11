package immutableString;

//* Since Strings are immutable, StringBuilder and StringBuffer concepts came in
//* StringBuilder and StringBuffer are mutable in nature
//* String buffer - Synchronized, Thread Safe and less efficient
//* String builder - non-synchronized, NOT Thread Safe and high efficient

public class BufferAndBuilder {

	public static void main(String[] args) {
		String str1 = "Sathya";
		String str2 = "Sathya";
		str2 = str1.concat(str2);
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("****************String Builder******************");
		StringBuilder SB1 = new StringBuilder("Sathya");
		StringBuilder SB2 = new StringBuilder("Sathya");
		SB2 = SB1.append(SB2);
		System.out.println(SB1);
		System.out.println(SB2);
		
		System.out.println("****************String Buffer******************");
		StringBuffer SBF1 = new StringBuffer("Sathya");
		StringBuffer SBF2 = new StringBuffer("Sathya");
		SBF2 = SBF1.append(SBF2);
		System.out.println(SBF1);
		System.out.println(SBF2);
		
//		StringBuilder SB = new StringBuilder();
		StringBuilder SB = new StringBuilder("Sathya");
		
		System.out.println(SB.append(10));
	}

}
