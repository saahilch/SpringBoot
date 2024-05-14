package com.collection;

import java.util.HashMap;

public class MapExamples {
	public static void main(String[] args) {

		HashMap<String, Integer> courses = new HashMap<>();
		courses.put("Core Java", 40000);
		courses.put("Dot Net", 30000);
		courses.put("PHP", 20000);
		courses.put("React", 15000);
		courses.put("Angular", 60000);
		courses.put("Angular", 1000);
		System.out.println(courses);
		System.out.println();
		courses.forEach((key, value) -> {
			System.out.print(key);
			System.out.print("=>");
			System.out.println(value);
			System.out.println();

		});
		
	}
}
