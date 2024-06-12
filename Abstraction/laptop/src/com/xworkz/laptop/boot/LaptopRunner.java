package com.xworkz.laptop.boot;

import com.xworkz.laptop.bridge.Dell;
import com.xworkz.laptop.things.Laptop;

public class LaptopRunner {
	
	public static void main(String[] args) {
		
		Laptop dell=new Dell();
		
		dell.noOfLaptop();
		dell.capacity();
		dell.range();
		dell.ifShopOpen();
		dell. price();
		dell.phoneNumber();
		dell.gst();
		dell.series();
		dell.companyName();

	}

}
