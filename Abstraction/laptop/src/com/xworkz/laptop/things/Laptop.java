package com.xworkz.laptop.things;

public interface Laptop {
	
	default int noOfLaptop() {
		int total=20;
		System.out.println("total number of laptop is==="+total);
		return total;
		
	}

	default short capacity() {
		short storage=120;
		System.out.println("storage capacity of mango is==="+storage);
		return storage;
		
	}

	default byte range() {
		byte range=100;
		System.out.println("range of laptop is==="+range);
		return range;
		
	}

	default boolean ifShopOpen() {
		boolean ifAvailable=false; 
		System.out.println("ifShopOpen is==="+ifAvailable);
		return ifAvailable;
		
	}

	default float price() {
		float price=600000.279f;
		System.out.println("price of laptop is==="+price);
		return price;
		
	}

	default long phoneNumber() {
		long phoneNumberOfCustomer=8716616617l;
		System.out.println("phoneNumber of owner  is==="+phoneNumberOfCustomer);
		return phoneNumberOfCustomer;
		
	}

	default double gst() {
		double gstOflaptop=4637.1297d;
		System.out.println("gst of laptop is==="+gstOflaptop);
		return gstOflaptop;
		
	}

	default char series() {
		char seriesOfLaptop='A';
		System.out.println("series of laptop is==="+seriesOfLaptop);
		return seriesOfLaptop;
	}

	default String companyName() {
		String companyName="HP";
		System.out.println("company name is==="+companyName);
		return companyName;
		
	}

}
