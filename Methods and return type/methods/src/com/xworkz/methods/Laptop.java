package com.xworkz.methods;

public class Laptop {

	public static String companyName="Dell";
	
	public int cost;

	public Laptop() {
		
		System.out.println("This is no argument constructor");
		
	}
	
	public static void name() {
		
		System.out.println("name of the company is==="+companyName);
	}
	
	public void price(int cost) {
		
		this.cost=cost;
		
		System.out.println("cost of the laptop==="+this.cost);
	}
	
	

}
