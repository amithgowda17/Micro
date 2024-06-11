package com.xworkz.abstraction.tesla.boot;

import com.xworkz.abstraction.tesla.bridge.TeslaCustomer;

public class TeslaRunner {
	
	public static void main(String[] args) {
		
		TeslaCustomer tesla=new TeslaCustomer();
		
		
		tesla.capacity();
		tesla.cost();
		tesla.cc();
		tesla.companyNameOfEngine();
		tesla.quality();
		tesla.totalTyre();
		tesla.tyreCompanyName();
		tesla.tyrequality();
		tesla.tyrePrice();
		tesla.ifTyreaAvailable();
		tesla.total();
		tesla.total1();
		tesla.companyNameOfBody();
		tesla.ownerName();
		tesla.ifAvailable();
		tesla.phoneNumber();
		tesla.gst();
		tesla.priceOfBody();
		tesla.totalSeats();
		tesla.costOfSeats();
		tesla.brand();
		tesla.ifSeatsAvailable();
		tesla.qualityOfSeatBelts();
		tesla.qualityOfSeats();
		tesla.totalSeatBelts();
		tesla.priceOfSeatBelts();
		tesla.ifSeatsBeltAvailable();
		tesla.companyName();
	}

}
