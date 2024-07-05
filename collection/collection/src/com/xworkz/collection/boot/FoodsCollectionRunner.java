package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FoodsCollectionRunner {

	public static void main(String[] args) {

		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String i, String j) {

				Character i1 = i.charAt(i.length() - 4);
				Character j2 = j.charAt(j.length() - 4);

				return i1.compareTo(j2);
			}
		};

		List<String> list = new ArrayList<String>();

		list.add("Idlisambar");
		list.add("Masaldosa");
		list.add("Ricebath");
		list.add("Biryani");

		Collections.sort(list, comparator);

		for (String string : list) {
			System.out.println(string);
		}
	}
}
