package collection1;

import java.util.*;

public class HashSetPractice {

	public static void main(String[] args) {

		hashSetMethods();
		List AA = new ArrayList();
		AA.add(20);
		AA.add(34);
		AA.add(0, 1304);
		AA.add(3,20);
		for (Object i : AA) {
			System.out.println(i);
		}
		
		System.out.println("####### toArray() method ############## which return object[]");
		Object[] o = AA.toArray();
		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i]);
		}
		System.out.println(AA.indexOf(20));
	}
	public static void hashSetMethods() {
		HashSet<String> H = new HashSet<String>();
		H.add("Keerth");
		H.add("Anbu");
		H.add("Prabu");
		H.add("Sasi");
		H.add("Zoo");
		H.add("Sembu");

		HashSet HH = new HashSet();

		HashSet HHH = new HashSet();
		HHH.add(" ");
		HHH.add("");
		HHH.add("Vino");

		System.out.println("**********HashSet Class Implementation*************");

		System.out.println("####### empty() method ############## which return boolean");
		System.out.println("Returns Empty or not");
		System.out.println(HH.isEmpty());
		System.out.println(H.isEmpty());
		System.out.println(HHH.isEmpty());

		System.out.println("####### size() method ############## which return integer");
		int size1 = H.size();
		int size2 = HH.size();
		int size3 = HHH.size();
		System.out.println("Size of collections: " + " List1: " + size1 + " List2: " + size2 + " List3: " + size3);

		System.out.println("####### contains() method ############## which return boolean");
		System.out.println(H.contains("Sasi"));
		System.out.println(HHH.contains(" "));
		System.out.println(HHH.contains(""));
		System.out.println(H.contains("zoo"));
		System.out.println(H.contains("Keerth"));

		System.out.println("####### remove() method ############## which return boolean");
		System.out.println(H.remove("Sasi"));
		System.out.println("Elements display after remove string operation");
		for (Object obj : H)
			System.out.println(obj);
		System.out.println("Elements display after remove Blankspace operation");
		System.out.println(HHH.remove(" "));
		for (Object obj : HHH)
			System.out.println(obj);

		System.out.println("####### toArray() method ############## which return object[]");
		Object o = H.toArray();
		for (Object obj : H)
			System.out.println(obj);

		System.out.println("####### <T> T[] toArray(T[] a) method ############## which return object[]");
		String[] str1 = new String[4];
		String str2[] = H.toArray(str1);
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}

		System.out.println("####### clear() method ############## which return void ");

		System.out.println("befor clear() function run");
		for (Object obj : H)
			System.out.println(obj);
		System.out.println("After clear()function run");
		H.clear();
		for (Object obj : H)
			System.out.println("Hello");
		// System.out.println(obj);

		System.out.println("####### clone() method ############## which return object ");
		HashSet<String> HC = new HashSet<String>();
//		HashSet<String> HC = (HashSet<String>) HH.clone();
		HC = (HashSet<String>) HH.clone();
		for (String r : HC) {

			System.out.println(r);
		}

	}
}