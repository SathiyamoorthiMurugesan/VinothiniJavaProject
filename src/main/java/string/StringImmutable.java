package string;

public class StringImmutable {

	public static void main(String[] args) {
		
		// String 
		
		String str1 = "Vino";
		String str2 = "Vino";
		str2= str1.concat(str2) ;
		System.out.println(str1);
		System.out.println(str2);
		System.out.println();
	
		
		String str = new String("Vino");
		System.out.println(str);
		str="Himalayes";
		System.out.println(str);
		System.out.println();
				
	//	stringBuffer
		StringBuilder SB= new StringBuilder("Vino");
		SB.append("devi");
		System.out.println(SB);
	}

}
