package com.xworkz.mango.things;

public interface Mango {
	
	default int noOfMango() {
		int total=100;
		System.out.println("total number of mango is==="+total);
		return total;
		
	}

	default short capacity() {
		short storage=110;
		System.out.println("storage capacity of mango is==="+storage);
		return storage;
		
	}

	default byte range() {
		byte rangeOfMango=127;
		System.out.println("range of mango is==="+rangeOfMango);
		return rangeOfMango;
		
	}

	default boolean ifShopOpen() {
		boolean ifAvailable=false; 
		System.out.println("ifShopOpen is==="+ifAvailable);
		return ifAvailable;
		
	}

	default float price() {
		float price=100.279f;
		System.out.println("price of mango is==="+price);
		return price;
		
	}

	default long phoneNumber() {
		long phoneNumberOfCustomer=8716616617l;
		System.out.println("phoneNumber of owner  is==="+phoneNumberOfCustomer);
		return phoneNumberOfCustomer;
		
	}

	default double gst() {
		double gstOfShop=721637.1297d;
		System.out.println("gst of engine is==="+gstOfShop);
		return gstOfShop;
		
	}

	default char series() {
		char seriesOfMango='A';
		System.out.println("series of mango is==="+seriesOfMango);
		return seriesOfMango;
	}

	default String companyName() {
		String shopName="Vinayak fruit stall";
		System.out.println("company name is==="+shopName);
		return shopName;
		
	}

}



