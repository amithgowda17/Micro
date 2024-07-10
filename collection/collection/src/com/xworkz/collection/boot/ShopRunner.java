package com.xworkz.collection.boot;

import java.util.Arrays;
import java.util.List;

public class ShopRunner {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,8,37,32,44,8,89);
		list.forEach(n -> System.out.println("array = " + n));
		
		System.out.println("=====After filter=====");
		
		list.stream().sorted().filter(n -> n % 2 == 0).forEach(n -> System.out.println("array : " + n));

	}
}
