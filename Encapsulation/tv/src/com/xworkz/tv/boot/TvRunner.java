package com.xworkz.tv.boot;

import com.xworkz.tv.bridge.TvThings;

public class TvRunner {

	public static void main(String[] args) {
		
		TvThings tv=new TvThings();
		
		tv.save("Pai", "Ravi", "RR Nagar", "Magadi", 8652552256l, 20, 8654552267l, 30, 100, true);

	}

}
