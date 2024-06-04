package com.xworkz.typecasting;

public class Rice extends Akki{
	
	public int price;
	public String name;
	
	public void rice() {
		
		System.out.println("this is rice class");
	}
	
	public void details(int price,String name) {
		
		this.price=price;
		this.name=name;
	}
	
	@Override
	
	public String toString() {
		
		System.out.println("this is string representation");
		
		return "[price==="+price+", name==="+name+"]";
	}
	
	
	
	

}
