package com.xworkz.abstraction.childclasess;

import com.xworkz.abstraction.things.Cats;

public class Dogs extends Cats{
	
	@Override
	public void cat() {
		
		System.out.println("this is dog class cat method");
	}
	
	@Override
	public void types() {
		System.out.println("this is dog class types method");
	}
	
	@Override
	public void species() {
		System.out.println("this is dog class species method");
	}
	
	@Override
	public void pets() {
		System.out.println("this is dog class pets method");
	}
	
	@Override
	public void foody() {
		System.out.println("this is dog class foody method ");
	}

}
