package com.xworkz.abstraction.tesla.bridge;

import com.xworkz.abstraction.tesla.things.Tesla;
import com.xworkz.abstraction.tesla.things.TeslaCarTyre;
import com.xworkz.abstraction.tesla.things.TeslaEngine;
import com.xworkz.abstraction.tesla.things.TeslaSeatBelts;
import com.xworkz.abstraction.tesla.things.TeslaSeats;

public class TeslaCustomer extends Tesla implements TeslaCarTyre,TeslaEngine, TeslaSeats,TeslaSeatBelts {

	@Override
	public void capacity() {
		System.out.println("this is capacity method");
		
	}

	@Override
	public void cc() {
		System.out.println("this is cc method");
		
	}

	@Override
	public void cost() {
		System.out.println("this is cost method");
		
	}

	@Override
	public void companyNameOfEngine() {
		System.out.println("this is companyNameOfEngine method");
		
	}

	@Override
	public void quality() {
		System.out.println("this is quality method");
		
	}

	@Override
	public void totalTyre() {
		System.out.println("this is totalTyre method");
		
	}

	@Override
	public void tyreCompanyName() {
		System.out.println("this is tyreCompanyName method");
		
	}

	@Override
	public void tyrequality() {
		System.out.println("this is tyrequality method");
		
	}

	@Override
	public void ifTyreaAvailable() {
		System.out.println("this is ifTyreaAvailable method");
		
	}

	@Override
	public void tyrePrice() {
		System.out.println("this is tyrePrice method");
		
	}

	@Override
	public void totalSeatBelts() {
		System.out.println("this is totalSeatBelts method");
		
	}

	@Override
	public void priceOfSeatBelts() {
		System.out.println("this is priceOfSeatBelts method");
		
	}

	@Override
	public void qualityOfSeatBelts() {
		System.out.println("this is qualityOfSeatBelts method");
		
	}

	@Override
	public void ifSeatsBeltAvailable() {
		System.out.println("this is ifSeatsBeltAvailable method");
		
	}

	@Override
	public void companyName() {
		System.out.println("this is companyName method");
		
	}

	@Override
	public void totalSeats() {
		System.out.println("this is totalSeats method");
		
	}

	@Override
	public void brand() {
		System.out.println("this is brand method");
		
	}

	@Override
	public void costOfSeats() {
		System.out.println("this is costOfSeats method");
		
	}

	@Override
	public void ifSeatsAvailable() {
		System.out.println("this is ifSeatsAvailable method");
		
	}

	@Override
	public void qualityOfSeats() {
		System.out.println("this is qualityOfSeats method");
		
	}
	
	@Override
	public void total() {
		System.out.println("this is total method in car");
	}
	
	@Override
	public void total1() {
		System.out.println("this is total1 method in car");
	}
	
	@Override
	public String companyNameOfBody() {
		System.out.println("this is companyNameOfBody method in car");
	    return null;
	}
	
	@Override
	public String ownerName() {
		System.out.println("this is ownerName method in car");
		return null;
	}
	
	@Override
	public boolean ifAvailable() {
		System.out.println("this is ifAvailable method in car");
		return false;
	}
	
	@Override
	public long phoneNumber() {
		System.out.println("this is phone number method in car");
		return 0;
	}
	
	@Override
	public double gst() {
		System.out.println("this is gst method in car");
		return 0.0d;
	}
	
	@Override
	public float priceOfBody() {
		System.out.println("this is priceOfBody method");
		return 0.0f;
	}


}
