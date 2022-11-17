package string;

import java.util.Arrays;

public class StringClass {

	
	static String str = "";
	static String str1 ="  ";
	static String str2;
	static String str3 = "Vino";
	static String str4 = "vinothinidevi",str5 = "vinothini";
	
	
	public static void main(String[] args) {

	//Length of String
	int length=length(str3);
	System.out.println("Length of String : " + length);
	
	//Check that string is Empty or not and IsEmpty - return type will be boolean
	System.out.println("Str");
	boolean String1 = str.isEmpty();
	System.out.println("String is Empty or not : " +String1);
	
	//getCharAt() - Returns the char value at the * specified index  
	System.out.println("Get character value at specified index");
	char indexValue = str5.charAt(0);
	System.out.println("Character at index" +indexValue);
	char indexValue1 = str3.charAt(3);
	System.out.println("Character1 at index" +indexValue1);
	
	//equals - compare two are strings are equal and return boolean
	String str10="vhen";
	String str11="vino";
	System.out.println("Equals");
	boolean b =str10.equals(str11);
	System.out.println(b);
	// return 
	
	//equalsIgnorecase - compare two strings which ignoring case consideration and returen boolean
	boolean b1= str10.equalsIgnoreCase(str11);
	System.out.println(b1);
	
	//compareTo-
	int c=str.compareTo("CompareTo: " +str11);
	System.out.println(c);
	
	//ComparetoIgnoreCase
	int d=str10.compareToIgnoreCase("ComparetoIgnoreCase: " +str11);
	System.out.println(d);
	
	//startsWith - characters present in arguments(str13) is a prefix of character seq presents in original string(str12)
	String str12="vino thini devi";
	String str13="devi";
	System.out.println("startWith");
	boolean b3= str4.startsWith(str12);
	System.out.println(b3);
		
	//Endswith - characters present in arguments(str4) is a suffix of character seq presents in original string(str12)
	System.out.println("EndsWith");
	b3= str12.endsWith(str4);
	System.out.println(b3);
	
	//lastIndexOf - 
	System.out.println("LastIndexOF");
	int b4 = str12.lastIndexOf(str13);
	System.out.println(b4);
	
//	Arrays
	
	
	// substring - Returns a string that is a substring of this string 
	// substring begins with the character at the specified index and extends to the end of this string
	String str16 = "Vinothini devi";
	String str14 = str12.substring(2);
	System.out.println("substring type1: " + str14);
	String str15 = str16.substring(0,5); // print start with specified begin index to end of index -1
	System.out.println("substring type2:" + str15);
	
	// subsequence - Returns a character sequence that is a subsequence of this sequence.
	System.out.println("Sub-sequence");
	CharSequence str17= str16.subSequence(0,5);
	System.out.println("Subsequence:"+ str17.isEmpty());
	
	//concat - Concatenates the specified string to the end of this string.
	String str18 ="kavi";
	String str19 = str3.concat(str16);
	System.out.println("concatenation of twwo string:"+str19);
	
	//replace - Returns a string resulting from replacing all occurrences of
   // * {@code oldChar} in this string with {@code newChar}.
	System.out.println("replace a new string");
	String str20 = str16.replace("","d" );
	System.out.println("we can see d added in betweena all characters below output");
	System.out.println(str20);
	String str21 = str16.replace(" ","d"+ ":-"+"we can see d added in the spaces only in this output");
	System.out.println(str21);
	
	//Split- 
	
	//toUpperCase 
	System.out.println("convert to upper case");
	String str22= str16.toUpperCase(); 
	System.out.println("concatenation :"+str22);
	str3.toUpperCase();
	
	//toLowerCase
	 	System.out.println("toUpperCase letters");
		String str23 = "                VINO DEVI KAvI  ";
		System.out.println(str23.toLowerCase());
	
	
	//trim - Returns a string whose value is this string, with all leading and trailing space removed,
		System.out.println("trim the values");
		System.out.println(str23.trim());
		System.out.println(str3.trim());
		
		
	//isBlank - return boolean true when empty or blank string is there otherwise it return false
		System.out.println("Check whether its blank or not");
		System.out.println(str.isBlank());
		System.out.println(str1.isBlank());
		System.out.println(str3.isBlank());
		
	//toCharArray -Converts this string to a new character array. 
		System.out.println("toCharArray output");
		String str30= "vinothini";
		char str31[]= str30.toCharArray();		
		for(int i=0;i<str31.length;i++) {
		System.out.println(str31[i]);
		}
		
	//Split- 

}
	
	
	
	
	
	
	
	public static int length(String Str2) {
		System.out.println(str5);
		return str3.length();
	}
	
}
