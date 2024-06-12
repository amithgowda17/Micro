package com.xworkz.mango.bridge;

import com.xworkz.mango.things.Mango;

public class MangoFruit implements Mango {
	
	public int noOfMango() {
		int total=300;
		System.out.println("total number of mango is==="+total);
		return total;
		
	}

	public short capacity() {
		short storage=1100;
		System.out.println("storage capacity of mango is==="+storage);
		return storage;
		
	}

	public byte range() {
		byte rangeOfMango=119;
		System.out.println("range of mango is==="+rangeOfMango);
		return rangeOfMango;
		
	}

	public boolean ifShopOpen() {
		boolean ifAvailable=true; 
		System.out.println("ifShopOpen is==="+ifAvailable);
		return ifAvailable;
		
	}

	public float price() {
		float price=200.279f;
		System.out.println("price of mango is==="+price);
		return price;
		
	}

	public long phoneNumber() {
		long phoneNumberOfCustomer=8885626567l;
		System.out.println("phoneNumber of owner  is==="+phoneNumberOfCustomer);
		return phoneNumberOfCustomer;
		
	}

	public double gst() {
		double gstOfShop=921637.1297d;
		System.out.println("gst of engine is==="+gstOfShop);
		return gstOfShop;
		
	}

	public char series() {
		char seriesOfMango='b';
		System.out.println("series of mango is==="+seriesOfMango);
		return seriesOfMango;
	}

	public String companyName() {
		String shopName="Maruthi fruit stall";
		System.out.println("company name is==="+shopName);
		return shopName;
		
	}

}
