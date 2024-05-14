package com.Threading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Threading {
	public static void main(String[] args) {
		// List<String> list = new ArrayList<>();
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("First");
		list.add("second");
		list.add("third");
		list.add("fourth");
		list.add("fifth");
		System.out.println(list);
		Runnable t1 = () -> {
			// thread 1-task
			for (String str : list) {
				System.out.println(str);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();

				}

			}

		};
		Runnable t2 = () -> {
			list.add("new item");
			list.add("new item");
			list.add("new item");

		};
		// Starting thred
		new Thread(t2).start();
		new Thread(t1).start();
		/*
		 * Two thred start a once but it throws an exception concurent modfication
		 * exception these process is called concurent collection4 To avoid these change
		 * in list that we decalre
		 */
	}

}
