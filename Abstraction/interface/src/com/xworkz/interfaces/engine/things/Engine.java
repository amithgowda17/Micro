package com.xworkz.interfaces.engine.things;

public interface Engine {

	default int noOfEngine() {
		int total=10;
		System.out.println("total number of engine is==="+total);
		return total;
		
	}

	default short capacity() {
		short storage=110;
		System.out.println("capacity of engine is==="+storage);
		return storage;
		
	}

	default byte range() {
		byte rangeOfEngine=121;
		System.out.println("range of engine is==="+rangeOfEngine);
		return 121;
		
	}

	default boolean ifEngineAvailable() {
		boolean ifAvailable=false; 
		System.out.println("ifEngineAvailable is==="+ifAvailable);
		return ifAvailable;
		
	}

	default float price() {
		float price=10000.279f;
		System.out.println("price of engine is==="+price);
		return price;
		
	}

	default long phoneNumber() {
		long phoneNumberOfCustomer=8716616617l;
		System.out.println("phoneNumber of owner  is==="+phoneNumberOfCustomer);
		return phoneNumberOfCustomer;
		
	}

	default double gst() {
		double gstOfEngine=1990.2797d;
		System.out.println("gst of engine is==="+gstOfEngine);
		return gstOfEngine;
		
	}

	default char series() {
		char seriesOfEngine='B';
		System.out.println("series of engine is==="+seriesOfEngine);
		return seriesOfEngine;
	}

	default String companyName() {
		String companyName="Bajaj";
		System.out.println("company name is==="+companyName);
		return companyName;
		
	}

}

