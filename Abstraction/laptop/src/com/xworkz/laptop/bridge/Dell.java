package com.xworkz.laptop.bridge;

import com.xworkz.laptop.things.Laptop;

public class Dell implements Laptop {
	
	public int noOfLaptop() {
		int total=30;
		System.out.println("total number of laptop is==="+total);
		return total;
		
	}

	public short capacity() {
		short storage=250;
		System.out.println("storage capacity of mango is==="+storage);
		return storage;
		
	}

	public byte range() {
		byte range=120;
		System.out.println("range of laptop is==="+range);
		return range;
		
	}

	public boolean ifShopOpen() {
		boolean ifAvailable=true; 
		System.out.println("ifShopOpen is==="+ifAvailable);
		return ifAvailable;
		
	}

	public float price() {
		float price=50000.279f;
		System.out.println("price of laptop is==="+price);
		return price;
		
	}

	public long phoneNumber() {
		long phoneNumberOfCustomer=8716616617l;
		System.out.println("phoneNumber of owner  is==="+phoneNumberOfCustomer);
		return phoneNumberOfCustomer;
		
	}

	public double gst() {
		double gstOflaptop=2637.1297d;
		System.out.println("gst of laptop is==="+gstOflaptop);
		return gstOflaptop;
		
	}

	public char series() {
		char seriesOfLaptop='B';
		System.out.println("series of laptop is==="+seriesOfLaptop);
		return seriesOfLaptop;
	}

	public String companyName() {
		String companyName="DELL";
		System.out.println("company name is==="+companyName);
		return companyName;
		
	}

}
