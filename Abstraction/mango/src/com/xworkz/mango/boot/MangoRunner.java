package com.xworkz.mango.boot;

import com.xworkz.mango.bridge.MangoFruit;
import com.xworkz.mango.things.Mango;

public class MangoRunner {
	
	public static void main(String[] args) {
		
		Mango mango=new MangoFruit();
		
		
		mango.noOfMango();
		mango.capacity();
		mango.range();
		mango.ifShopOpen();
		mango.price();
		mango.phoneNumber();
		mango.gst();
		mango.series();
		mango.companyName();
	}

}
