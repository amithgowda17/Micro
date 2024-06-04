package com.xworkz.typecasting;

public class Ravi extends Shivaram {
	
	public String name;
	public int noOfBike;
	
	
	public void son(){
		
		System.out.println("this is son class");
	}
	
    public void youngerSon(String name,int noOfBike) {
    	
    	this.name=name;
    	this.noOfBike=noOfBike;
		
	}
  
    @Override
    
    public String toString(){
    	
    	System.out.println("this is string representation");
    	
    	return "[name=="+name+", noOfBike==="+noOfBike+"]";
    }
    
    
    
    
    
    
    
	

}
