package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class Traverse {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("Sahil");
		names.add("Ravi");
		names.add("Shyam");
		names.add("Shyam");
		System.out.println(names);
		for (String str : names) {
			System.out.print(str + "\t" + str.length() + "\t");
			StringBuffer sb = new StringBuffer(str);

			System.out.println(sb.reverse());
			System.out.println("------------------------");
//Traversing using Iterator--For traversing in Forword direction
			Iterator<String> itr = names.iterator();
			while (itr.hasNext()) {
				String next = itr.next();
				System.out.println(next);
			}
			System.out.println("--------------------");
			// Traversing using Iterator--For traversing in Backword direction
			ListIterator<String> litr = names.listIterator(names.size());
			while (litr.hasPrevious()) {
				String privious = litr.previous();
				System.out.println(privious);
			}
		}
		// foreach method
		System.out.println("--------------------");
		names.forEach(e -> {
			System.out.println(e);
		});
		// using TreeSet Method
		System.out.println("-------------------");
		// removes duplicate
		TreeSet<String> set = new TreeSet<>();
		set.addAll(names);
		set.forEach(e -> {
			System.out.println(e);
		});
	}

}
