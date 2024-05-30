package com.xworkz.methods;

public class Bottle {

	public static int total=10;
	
	public boolean ifWaterAvailable;

	public Bottle() {
		
		System.out.println("This is no argument constructor");
		
	}
	
	public static void number() {
		
		System.out.println("total number of water is==="+total);
	}
	
	public void availability(boolean ifWaterAvailable) {
		
		this.ifWaterAvailable=ifWaterAvailable;
		
		System.out.println("does water available==="+this.ifWaterAvailable);
	}
	
	

}
