package com.xworkz.block.boot;

import com.xworkz.block.things.Car;

public class CarRunner {
	
	public static void main(String[] args)  throws Exception{
		
		Class.forName("com.xworkz.block.things.Car");
		
		Car car=new Car();
		
		Class.forName("com.xworkz.block.things.Car").getConstructor().newInstance();
	}

}
