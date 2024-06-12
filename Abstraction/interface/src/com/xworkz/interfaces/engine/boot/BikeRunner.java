package com.xworkz.interfaces.engine.boot;

import com.xworkz.interfaces.engine.things.Engine;
import com.xworkz.interfaces.engine.bridge.Bike;

public class BikeRunner {

	public static void main(String[] args) {
		
		Engine bike=new Bike();
		
		bike.noOfEngine();
		bike.capacity();
		bike.range();
		bike.ifEngineAvailable();
		bike. price();
		bike.phoneNumber();
		bike.gst();
		bike.series();
		bike.companyName();

	}

}
