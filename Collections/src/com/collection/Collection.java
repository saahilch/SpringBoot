package com.collection;

import java.util.*;

public class Collection {
	public static void main(String[] args) {

		/*
		 * 1-) type safe collection - same type ca be added 2-) un tyep safe collection-
		 * different type can be added
		 */
		// 1)
		ArrayList<String> names = new ArrayList<>();
		names.add("Sahil");
		names.add("Ravi");
		names.add("Shyam");
		names.add("Shyam");
		System.out.println(names);
		// to get index based
		System.out.println(names.get(1));

		names.remove("Ravi");
		System.out.println(names.size());

		System.out.println(names.contains("Sahil"));
		System.out.println(names.set(1, "Sourabh"));
		System.out.println(names);
//		LinkedList list = new LinkedList();
//		list.add(1);
//		list.add("sunny");
//		System.out.println(list);
		Vector<String> vector = new Vector<>();
		vector.addAll(names);
		System.out.println("vectore " + vector);

		HashSet<Double> nms = new HashSet<>();
		nms.add(15.2);
		nms.add(1.3);
		nms.add(5.6);
		nms.add(9.88);
		nms.add(8.4);
		nms.add(20.1);
		System.out.println(nms);

		TreeSet<Double> tst = new TreeSet<>();

		tst.addAll(nms);
		System.out.println(tst);
	}

}
