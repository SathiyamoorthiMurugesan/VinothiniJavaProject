package collection1;

import java.util.*;

public class HashMapPractice {

	public static void main(String[] args) {

		HashMap<String, Integer> M = new HashMap<String, Integer>();
		M.put("Maths", 25);
		M.put("Chemistry", null);
		M.put("Physics", null);
		M.put("computerScience", 80);
		M.put("Tamil", 91);
		M.put("Maths", 45);
		M.put("Hindi", null);
		M.put(null, 90);
		M.put(null, 90);
		M.put(" ", null);

		System.out.println("Get method()");
		Integer i10 = M.get(M);
		System.out.println("results:" + i10);

		System.out.println("Using keySet() to return Key ");
		Set<String> s1 = M.keySet();
		for (String str1 : s1) {
			System.out.println(str1);
		}

		System.out.println("Using values() to return values");
		Collection<Integer> c = M.values();
		for (Integer i : c) {
			System.out.println(i);
		}

		System.out.println("*****Removing Duplicate values******");
		HashSet HS = new HashSet();
		Collection<Integer> c1 = M.values();
		System.out.println(c1);
		for (Integer i1 : c1) {
			HS.add(i1);
		}
		System.out.println(HS);

		System.out.println("Iterating key alone");
		Iterator<String> ite1 = M.keySet().iterator();
		while (ite1.hasNext()) {
			System.out.println(ite1.next());
		}

		System.out.println("Iterating values alone");
		Iterator<Integer> ite2 = M.values().iterator();
		while (ite2.hasNext()) {
			System.out.println(ite2.next());
		}

		System.out.println("*****EntrySet method() ****");
		Iterator<Map.Entry<String, Integer>> Ite4 = M.entrySet().iterator();
		while (Ite4.hasNext()) {
			System.out.println(Ite4.next());
		}

		System.out.println("     Equals() method");
		HashMap<String, Integer> N = new HashMap<String, Integer>();
		N.put("senthil", 80);
		System.out.println(M.equals(N));

		System.out.println(" ******Remove() method");
		M.remove("Hindi");
		System.out.println(M);

		System.out.println("After remove Map Elements");

		Iterator<String> ite5 = M.keySet().iterator();
		while (ite5.hasNext()) {
			System.out.println(ite5.next());

		}
		System.out.println(" before replace method");
		Iterator<Map.Entry<String, Integer>> ite10 = M.entrySet().iterator();
		while (ite10.hasNext()) {
			System.out.println(ite10.next());

		}

		System.out.println(" ******After Replace() method");
		M.replace("vinothini", 12);
		System.out.println(M);

		System.out.println("***Put all is to add values to another map***");
		M.putAll(N);
		System.out.println(M);
		Iterator<Map.Entry<String, Integer>> Ite6 = M.entrySet().iterator();
		while (Ite6.hasNext()) {
			System.out.println(Ite6.next());
		}

		System.out.println("********ContainsKey() method********");
		System.out.println(M.containsKey("senthil"));
		System.out.println(M.containsKey(" "));
		System.out.println(M.containsKey(""));

		System.out.println("********ContainsValue() method********");
		System.out.println(M.containsValue(null));
		System.out.println(M.containsValue(" "));
		System.out.println(M.containsKey(20));

	}

}
