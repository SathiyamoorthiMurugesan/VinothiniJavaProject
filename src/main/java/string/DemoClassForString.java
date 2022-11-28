package string;

public class DemoClassForString {

	public static void main(String[] args) {

		String str1 = "Kavipriya";

				char[] str21= str1.toCharArray() ;
				String str2="";
				for(int i=0;i<str21.length;i++)
				{System.out.println(str21[i]);
	
				}
				
				
				System.out.println(str1.toUpperCase());
				System.out.println(str1.toLowerCase());
				
				String Str4="Vino";
				System.out.println(str1.concat(Str4));
				System.out.println(str1= str1.concat(Str4));
				System.out.println("String one"+str1);
				System.out.println(str2.concat(Str4));
				
				
				
				String str11="Vinodevi",str12="kavidev",str13="prabu";
				System.out.println("strign 11 udpates:");
				System.out.println(str11= str11.concat(str12));
				System.out.println(str11= str11.concat(str13));
				System.out.println(str11.substring(5));
				System.out.println(str12.toLowerCase());
				String str14= "KAVI";
				System.out.println(str12.equalsIgnoreCase(str14));
				System.out.println(str12.compareToIgnoreCase(str14));
				System.out.println(str14.charAt(2));
				
				String str17="vinothinidevi",str18="devi";
				System.out.println(str18.contains(str17));
				System.out.println(str18.toString());
	}

}
