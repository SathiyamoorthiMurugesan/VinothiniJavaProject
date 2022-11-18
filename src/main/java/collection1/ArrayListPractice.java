package collection1;

import java.util.*;
//import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {

		System.out.println("collection interface methods");
		ArrayList<String> a = new ArrayList<String>();
		a.add("jino");
		a.add("Srino");
		a.add("gino");
		a.add(null);
		a.add("karth");
		a.add("gino");
		a.add(null);
//		a.add(10);
		a.add("");
		a.add("        ");

		System.out.println("iterating arraylist with ForEach:");
		for (String each : a)
			System.out.println(each);

		System.out.println("********** Trying methods in Iterable interface************");
//		* 	Iterator<T> iterator();
//		* 	forEach(Consumer<? super T> action)
//		* 	SplitIterator<T> splitIterator()

		System.out.println("####### iterate list using iterator method ##############");
		Iterator ite = a.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

		System.out.println("******forEach method******");
//		for(String each: a) {
//			System.out.println(each);
//		}
		a.forEach(each -> System.out.println(each)); // lambda expression

		/*
		 * ********************************************************* ArrayList alp = new
		 * ArrayList(); alp.add(34); alp.add(101); alp.add(null); alp.add(102);
		 * alp.add(1013);
		 * 
		 * System.out.println("NEw code"); alp.forEach(each -> System.out.println(each)
		 * );
		 * 
		 * 
		 * ArrayList<Integer> list1= new ArrayList<Integer>(); list1.add(34);
		 * 
		 * alp.removeAll(list1);
		 * 
		 * System.out.println("remove values"); alp.forEach(each2 ->
		 * System.out.println(each2));
		 ****************************************************/

		ArrayList<String> nullArray = new ArrayList<String>();
		nullArray.add(null);

		ArrayList<String> li = new ArrayList<String>();
		li.addAll(a);
		for (String each : li) {
			System.out.println(each);
		}
		li.removeAll(nullArray);
		li.forEach(each -> System.out.println(each));
		System.out.println("swap to Uppercase");
		li.forEach(each -> System.out.println(each.toUpperCase()));

		System.out.println("############# splitIterator() ########################");
//		Spliterator<String> sp = a.spliterator();

		System.out.println("********** Trying methods in collection interface************");

//		* size();
//		* isEmpty();
//		* contains(Object o)
//		* toArray();
//		* toArray(T[] a);
//		* add(E e);
//		* remove(Object o);
//		* containsAll(Collection<?> c)
//		* addAll(Collection<? extends E> c);
//		* removeAll(Collection<?> c);
//		* removeIf(Predicate<? super E> filter)
//		* retainAll(Collection<?> c);
//		* clear();
//		* equals(Object o);
//		* Spliterator<E> spliterator();
//		* Stream<E> parallelStream();

		System.out.println("####### size() method ##############");

		System.out.println(a.size());
		int sizeOfMyArray = a.size();
		System.out.println(sizeOfMyArray);

		System.out.println("####### empty()  method ############## which return boolean");
		System.out.println("is empty(): " + a.isEmpty());

		System.out.println("####### contains(Object o)  method ############## which return boolean");
		System.out.println("Contain value of Vino : " + a.contains("vino"));
		System.out.println("contain Empty elements2: " + a.contains(""));
		System.out.println("contain Empty elements3: " + a.contains("    "));
		System.out.println("contain Empty elements4: " + a.contains(null));

		System.out.println("####### toArray() method ############## which obj[]");
		a.toArray();
		Object[] myArrayListValues = a.toArray();
		for (Object each : myArrayListValues) {
			System.out.println(each);
		}

//		System.out.println("#######* toArray(T[] a) method ############## which obj[]");
//			a.toArray(null));
//			Object[] myArrayListValues = a.toArray();
//			for(Object each: myArrayListValues ) {
//				System.out.println(each);
//			}

		System.out.println("####### * remove(Object o)  method * ##############");
		System.out.println("Remove one elements from list");
		a.remove(2);
		for (String str1 : a)
			System.out.println(str1);

		// New two objects gets created

		ArrayList<String> Q2 = new ArrayList<String>();
		Q2.add("Sathya1");
		Q2.add("hino");
		Q2.add("sathya");
		Q2.add("Vinothkini");
		Q2.add("KAvino");

		ArrayList Q1 = new ArrayList();
		Q1.add("Sathya");

		System.out.println(("Remove object 0"));
		Q2.remove(Q1);
		for (Object each : Q2) {
			System.out.println(each);
		}

		System.out.println("####### containsAll() method ##############");
		ArrayList int1 = new ArrayList();
		int1.add(1);
		int1.add(2);
		int1.add(3);
		int1.add(4);

		ArrayList int2 = new ArrayList();
		int2.add(1);
		int2.add(2);
		int2.add(3);
		int2.add(4);
		int2.add(5);
		int2.add(50);
		int2.add(513);

		System.out.println(int2.containsAll(int1));
		for (Object i : int2)
			System.out.println(i);

		System.out.println("####### addAll(Collection<? extends E> c) method ##############");
		ArrayList int3 = new ArrayList(4);
		int3.add("Vino");
		int3.add(190);

		int1.addAll(int3);
		for (Object i : int1)
			System.out.println(i);

		System.out.println("####### removeAll() method ##############");
		ArrayList int4 = new ArrayList();
		int4.add("vino");
		int4.add("arun");
		int4.add("Sathya");

		ArrayList str12 = new ArrayList();
		str12.add("Vino");
		int4.add("Arun");

		int4.removeAll(str12);
		for (Object i2 : int4)
			System.out.println(i2);

		System.out.println("####### retainAll(Collection<?> c); method ##############");
		// removes from this list all of its elements that are not contained in the
		// specified collection.
		ArrayList aaa = new ArrayList();
		aaa.add("vino");
		aaa.add("arun");
		aaa.add("smart");
		aaa.add("");

		ArrayList bbb = new ArrayList();
		bbb.add("vino");
		bbb.add("arun");
		bbb.add("sathya");
		bbb.add("anu");
		aaa.add("");

		bbb.retainAll(aaa);
		for (Object obj5 : bbb)
			System.out.println(obj5);

		System.out.println("####### clear() method ##############");
		ArrayList aaaa = new ArrayList();
		aaaa.add("vino");
		aaaa.add("arun");
		aaaa.clear();
		for (Object o : aaaa) {
			System.out.println(o);
		}
		System.out.println("Nothing to iterate");

		System.out.println("####### equals method ##############");
		ArrayList bbbb = new ArrayList();
		bbbb.add("vino");
		// bbbb.add(" ");
		ArrayList bbaa = new ArrayList();
		bbaa.add("vino");
		bbaa.add("");
		System.out.println(bbbb.equals(bbaa));

		/////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("********** Trying methods in List interface************");
		/////////////////////////////////////////////////////////////////////////////////////////////////
		List dr = new ArrayList();
		dr.add("jino");
		dr.add("Srino");
		dr.add("gino");
		dr.add(null);
		dr.add("karth");
		dr.add("gino");
		dr.add(null);
        dr.add(10);
		dr.add("");
		dr.add("      ");

		System.out.println("####### add(int index,E element) method ##############");

		dr.add(5, "Vinothini");
		for (Object obj : dr)
			System.out.println(obj);

		System.out.println("#######  set () method ##############");
		dr.set(6, "dr");
		for (Object obj : dr)
			System.out.println(obj);
		System.out.println("set blank index with some values");
		System.out.println(dr.set(7, "hello"));

		System.out.println("#######  get () method ##############");
		System.out.println(dr.get(7));

		System.out.println("#######  Sort() method ##############");
		
		System.out.println("Before sorting");
		for (Object obj : dr)
			System.out.println(obj);
		System.out.println("After sorting");
//		 //
//		for (Object obj : )
//			System.out.println(obj);
		
		
	//	dr.sort();
		
	    System.out.println("#######  remove() method ##############");
	    
		System.out.println(dr.remove(0));
		System.out.println(dr.remove(2));
		
		
		
		System.out.println("#######  indexof() method ##############");
   //Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
	    System.out.println(dr.indexOf("karth"));
		System.out.println(dr.indexOf(20));
		System.out.println(dr.indexOf(10));
		
		System.out.println("####### lastIndexOf()  method ##############");
  // Returns the index of the last occurrence of the specified element in this list
		dr.add(4,"gino");
		
		System.out.println("\"current list of elements after manipulation\"");
		for (Object obj : dr)
			System.out.println( obj);
		System.out.println(dr.lastIndexOf("gino"));
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("********** Trying methods in ArrayList Class methods************");
		/////////////////////////////////////////////////////////////////////////////////////////////////
		
		ArrayList de = new ArrayList();
		de.add("jino");
		de.add("Srino");
		de.add("gino");
		de.add(null);
		de.add("karth");
		de.add("gino");
		de.add(null);
        de.add(10);
		de.add("");
		de.add("      ");

		System.out.println("#######  trimToSize() method ##############");
		ArrayList df = new ArrayList(9);
		df.add(10);
		df.add(45);
		df.add("Vino");
		df.add("sathya");
		df.add("gino");
		df.add("celebrity");
		df.trimToSize();
		df.forEach(each -> System.out.println(each));
		
		
 	System.out.println("####### toArray() method ##############");
	
	
		

		System.out.println("@@@@@@@@@@@@@@@@@@@@@end of pattern@@@@@@@@@@@@@@@@@@@@@");


//		System.out.println("#######  method ##############");
//		System.out.println("#######  method ##############");
//		System.out.println("#######  method ##############");
//		System.out.println("#######  method ##############");
//		System.out.println("#######  method ##############");
//		System.out.println("#######  method ##############");

		ArrayList a1 = new ArrayList();
		a1.add(30);
		a1.add(20);
		a1.add(45);
		a1.add(1);
		a1.add("String");
		a1.iterator();

		ArrayList a2 = new ArrayList();
		a2.add(24);
		a2.add(44);
		a2.add(20);

		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}

		System.out.println("Length of array: " + a1.size());
		System.out.println("is empty(): " + a.isEmpty());

		System.out.println("toArray");
		Object o[] = a1.toArray();
		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i]);
		}

		System.out.println("Remove elements");
		System.out.println(a1.remove(1));

		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}

		System.out.println("add all the elements present in the collection2 which returns boolean");
		System.out.println(a1.addAll(a2));
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}

		System.out.println("remove all the elements present in the collection2 which returns boolean");
		System.out.println(a2.removeAll(a1));
		for (int i = 0; i < a2.size(); i++) {
			System.out.println(a2.get(i));
		}

		System.out.println("retain all the elements present in the collection2 which returns boolean");
		System.out.println(a1.retainAll(a2));
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}

	}
	
     

	}


