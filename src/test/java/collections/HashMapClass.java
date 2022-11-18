package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClass {
<<<<<<< HEAD
	
	/* HashMapPractice
	 * 	Refer Map section in CollectionInterfaces.java
=======

	/*
	 * HashMap Refer Map section in CollectionInterfaces.java
>>>>>>> branch 'master' of git@github.com:SathiyamoorthiMurugesan/VinothiniJavaProject.git
	 * 
<<<<<<< HEAD
	 * Different ways to declare HashMapPractice
	 * 	Map <String, Integer> marks = new HashMapPractice <String, Integer> ();
	 * 	HashMapPractice <String, Integer> marks = new HashMapPractice <String, Integer> ();
	 *	HashMapPractice <String, Integer> marks1 = new HashMapPractice <String, Integer> (marks);
	 *	HashMapPractice <String, Integer> marks2 = new HashMapPractice <String, Integer> (10);
	 * 	
	 * keyset() - will return set of keys. Return type - Set
	 * values() - Will return Collection of values. Return type - Collection
	 * For iterating we cannot use for loop, but we can use other types
=======
	 * Different ways to declare HashMap Map <String, Integer> marks = new HashMap
	 * <String, Integer> (); HashMap <String, Integer> marks = new HashMap <String,
	 * Integer> (); HashMap <String, Integer> marks1 = new HashMap <String, Integer>
	 * (marks); HashMap <String, Integer> marks2 = new HashMap <String, Integer>
	 * (10);
>>>>>>> branch 'master' of git@github.com:SathiyamoorthiMurugesan/VinothiniJavaProject.git
	 * 
<<<<<<< HEAD
	 * forEach(), replaceAll() and clone() methods are overridden in HashMapPractice
	 * In Maps, we cannot use forEach() method on either keys or values. We can only use for keys and values pair.
=======
	 * keyset() - will return set of keys. Return type - Set values() - Will return
	 * Collection of values. Return type - Collection For iterating we cannot use
	 * for loop, but we can use other types
	 * 
	 * forEach(), replaceAll() and clone() methods are overridden in HashMap In
	 * Maps, we cannot use forEach() method on either keys or values. We can only
	 * use for keys and values pair.
>>>>>>> branch 'master' of git@github.com:SathiyamoorthiMurugesan/VinothiniJavaProject.git
	 */

	public static void main(String[] args) {
<<<<<<< HEAD
		HashMap <String, Integer> marks = new HashMap <String, Integer> ();
//		HashMapPractice <String, Integer> marks1 = new HashMapPractice <String, Integer> (marks);
//		HashMapPractice <String, Integer> marks2 = new HashMapPractice <String, Integer> (10);
		
=======
		HashMap<String, Integer> marks = new HashMap<String, Integer>();
//		HashMap <String, Integer> marks1 = new HashMap <String, Integer> (marks);
//		HashMap <String, Integer> marks2 = new HashMap <String, Integer> (10);

>>>>>>> branch 'master' of git@github.com:SathiyamoorthiMurugesan/VinothiniJavaProject.git
		marks.put("English", 75);
		marks.put("Maths", 100);
		marks.put(null, 50);
		marks.put(null, 45);
		marks.put("Bio", null);
		marks.put("Physics", null);

		marks.put("Chemistry", 75);
		marks.put("Maths", 95);
		marks.put("English", 75); // does not allow duplicate key

		System.out.println(marks);

		Set<String> keys = marks.keySet();
		for (String eachkey : keys) {
			System.out.println(eachkey);
		}

		Collection<Integer> value = marks.values();
		for (Integer eachvalue : value) {
			System.out.println(eachvalue);
		}

//		Set <Integer> value1 = (Set<Integer>) marks.values();
//		for(Integer eachvalue :value1) {
//			System.out.println(eachvalue);
//		}

//		Removing duplicate values from Map - by getting all the values from Map and put that into Set.
//		So duplicates will be removed as Set do not allow duplicates
		HashSet<Integer> setvalue = new HashSet<Integer>();
		Collection<Integer> collvalue = marks.values();
		System.out.println(collvalue);
		for (Integer value2 : collvalue) {
			setvalue.add(value2);
		}
		System.out.println(setvalue);

//		putAll() - is nothing but add all. 
//		It is simply adds B value to A
//		Initially if A has 5 values and B has 2 values, after A.putAll(B), A will be having 7 values.
		HashMap<String, Integer> marks1 = new HashMap<String, Integer>();
		marks1.put("ECE", 200);
		System.out.println("*********** putAll ************");
		marks1.putAll(marks);
		System.out.println(marks1);

		System.out.println(marks.containsKey("English"));
		System.out.println(marks.containsValue(75));
		System.out.println(marks.get("English"));

//		remove - returns true/false if the specified key and value is present
		System.out.println(marks.remove("Bio", 75));
		System.out.println(marks.remove("Bio", null));
		System.out.println(marks);

//		Iterating Map using iterator()
//		Set<String> setOfKeys = marks.keySet();
//		Iterator<String> iteratingKeys = setOfKeys.iterator();
		Iterator<String> marksIterator = marks.keySet().iterator();
		System.out.println("********* Iterating keys alone ********");
		while (marksIterator.hasNext()) {
			System.out.println("Hello");
			System.out.println(marksIterator.next());
//			System.out.println(marks.values());
		}

//		HashMap<String, Integer> marks23 = new HashMap<String, Integer>();
//		marks23.put("English", 75);
//		marks23.put("Maths", 100);
		Iterator<String> marksIterator1 = marks.keySet().iterator();
		while (marksIterator1.hasNext()) {
//			if (marksIterator1.next().equals(null)) {
			if (marksIterator1.next() == null) {
				marks.replace(null, 100);
			}
//				if (marksIterator1.next().equals("English")) {
//					marks.replace("English", 99);
//				}
		}

//		while (marksIterator.hasNext()) {
//			if (marksIterator.next().equals("English")) {
//				System.out.println(marks.get("English") + "111111111111111111");
//			}
//		}

		System.out.println("********* Iterating Map values alone ********");
		Iterator<Integer> valueIterator = marks.values().iterator();
		while (valueIterator.hasNext()) {
//			System.out.println(valueIterator.next());
			Integer eachValue = valueIterator.next();
			System.out.println(eachValue);
		}

		System.out.println("********entrySet() method ******");

//		Set<String> setOfKeys = marks.keySet();
//		Iterator<String> iteratingKeys = setOfKeys.iterator();

//		Set<Map.Entry<String, Integer>>  keyAndValues = marks.entrySet();
//		Iterator<Map.Entry<String, Integer>> iteratingKeysAndValues = keyAndValues.iterator();

		Iterator<Map.Entry<String, Integer>> entrySetIterator = marks.entrySet().iterator();
		while (entrySetIterator.hasNext()) {
			System.out.println(entrySetIterator.next());
		}

		System.out.println("********entrySet() method using getKey() and getValue()******");
		Iterator<Map.Entry<String, Integer>> entrySetIterator1 = marks.entrySet().iterator();
		while (entrySetIterator1.hasNext()) {
//			System.out.println(entrySetIterator1.next());
//			System.out.println(entrySetIterator1.next().getKey());
//			System.out.println(entrySetIterator1.next().getValue());
//			System.out.println(entrySetIterator1.next().getKey() + " : " + entrySetIterator1.next().getValue());
			Map.Entry<String, Integer> entry = entrySetIterator1.next();
			System.out.println("Key : " + entry.getKey() + ", " + " Value : " + entry.getValue());
		}

		System.out.println("********entrySet() method validation******");
		Set<Entry<String, Integer>> entrySet = marks.entrySet();
		Iterator<Entry<String, Integer>> entrySetIterator2 = entrySet.iterator();
		while (entrySetIterator2.hasNext()) {
			Entry<String, Integer> entry = entrySetIterator2.next();
			if (entry.getKey() == null) {
//				if (entry.getValue().equals(45))
				if (entry.getValue() == 45)
					System.out.println("TRUE");
			}
			else
				System.out.println(entry.getKey()+"---------"+entry.getValue());

			if (entry.getKey() != null && entry.getKey().equals("English")) {
				if (entry.getValue().equals(75))
					System.out.println("******************TRUE**********************");
			}
		}

		System.out.println("********* Iterating keys alone using foreach loop ********");
		for (String eachKey : marks.keySet()) {
			System.out.println(eachKey);
		}

		System.out.println("********* Iterating values alone using foreach loop ********");
		for (Integer eachValue : marks.values()) {
			System.out.println(eachValue);
		}

		System.out.println("******* Iterating key and values using foreach loop*****");
		Map<String, Integer> marks10 = new HashMap<String, Integer>();
		marks10.putAll(marks);
		for (Map.Entry<String, Integer> entry1 : marks10.entrySet()) {
			System.out.println(entry1.getKey());
			System.out.println(entry1.getValue());
		}

		System.out.println("********* foreach() method ***");
		marks.forEach((a, b) -> System.out.println(a + ":" + b));

	}
}
