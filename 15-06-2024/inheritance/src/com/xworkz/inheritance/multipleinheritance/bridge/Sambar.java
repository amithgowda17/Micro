package com.xworkz.inheritance.multipleinheritance.bridge;

import com.xworkz.inheritance.multipleinheritance.things.Spices;
import com.xworkz.inheritance.multipleinheritance.things.Water;

public class Sambar implements Water,Spices {

	@Override
	public void spices() {
		System.out.println("this is sambar class");
		
	}

	@Override
	public void water() {
		System.out.println("this is sambar class");
		
	}

}
