package string;

import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {

		String str1="hello world";
		removeDuplicate(str1);
	}
	
	public static void removeDuplicate(String str5)
	{
		
		HashSet<Character> s=new HashSet();
		int i;
		for(i=0;i<str5.length();i++)
		{
			s.add(str5.charAt(i));
		}
		
		for(char str4 : s)
		{
			System.out.println("One by one");
			System.out.println(str4);
		}
	
		
	}
	
	

}
