package collection1;

import java.util.*;

public class HashMapPractice {

	public static void main(String[] args) {

		HashMap <String,Integer> M = new HashMap <String,Integer>();
		M.put("Maths",25);
		M.put("Chemistry", null);
		M.put("Physics", null);
		M.put("computerScience", 80);
		M.put("Tamil", 91);
		M.put("Maths", 45);
		M.put(null, 90);
		M.put(null, 90);
		
		System.out.println("Using keySet() to return Key ");
		Set key1 = M.keySet();
		for(Object str1 : key1) {
			System.out.println(str1);
		}
		
		System.out.println("Using keySet() to return values");
		Collection Value1 = M.values();
		for(Object str1 : Value1) {
			System.out.println(str1);
		}
		
//		HashSet<String> hs= new HashSet<String>();
//		Collection<String> cs=M.values();
//		System.out.println(cs);
//		for(String dupvalues:cs) {
//			hs.add(dupvalues);
//		}
//		System.out.println("***After removing duplicates using HashSet***");
//		System.out.println(hs);
		
	}

}
