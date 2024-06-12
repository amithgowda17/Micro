package com.xworkz.interfaces.engine.bridge;

import com.xworkz.interfaces.engine.things.Engine;

public class Bike implements Engine {
	
	@Override
	
	public int noOfEngine() {
		int total=15;
		System.out.println("total number of engine is==="+total);
		return total;
	}

	@Override
	
	public short capacity() {
		short storage=567;
		System.out.println("capacity of engine is==="+storage);
		return storage;
	}

	@Override
	
	public byte range() {
		byte rangeOfEngine=120;
		System.out.println("range of engine is==="+rangeOfEngine);
		return rangeOfEngine;
	}

	@Override
	
	public boolean ifEngineAvailable() {
		boolean ifAvailable=true;
		System.out.println("ifEngineAvailable is==="+ifAvailable);
		return ifAvailable;
	}

	@Override
	
	public float price() {
		float price=10000.219f;
		System.out.println("price of engine is==="+price);
		return price;
	}

	@Override
	
	public long phoneNumber() {
		long phoneNumberOfCustomer=9826772267l;
		System.out.println("phoneNumber of owner  is==="+phoneNumberOfCustomer);
		return phoneNumberOfCustomer;
	}

	@Override
	
	public double gst() {
		double gstOfEngine=2000.2197d;
		System.out.println("gst of engine is==="+gstOfEngine);
		return gstOfEngine;
	}

	@Override
	
	public char series() {
		char seriesOfEngine='A';
		System.out.println("series of engine is==="+seriesOfEngine);
		return seriesOfEngine;
	}
	
	@Override
	
	public String companyName() {
		String companyName="Honda";
		System.out.println("company name is==="+companyName);
		return companyName;
	}

}
