package com.xworkz.methods;

public class Cylinder {

	public static int total=100;
	
	public int cost;

	public Cylinder() {
		
		System.out.println("This is no argument constructor");
		
	}
	
	public static void sum() {
		
		System.out.println("total number of cylinder is==="+total);
	}
	
	public void price(int cost) {
		
		this.cost=cost;
		
		System.out.println("cost of the cylinder==="+this.cost);
	}
	
	

}
