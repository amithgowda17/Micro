package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TwoDigitRunner {
	
	public static void main(String[] args) {
		
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer a, Integer b) {
				if( a % 10 > b % 10) {
					return 1;
				}
				return -1;
			}
		};		
		

		List<Integer> list=new ArrayList<Integer>();
		
		list.add(17);
		list.add(56);
		list.add(34);
		list.add(11);
		
		Collections.sort(list,comparator);
		
		for (Integer inte : list) {
			System.out.println(inte);
		}
	}

}
