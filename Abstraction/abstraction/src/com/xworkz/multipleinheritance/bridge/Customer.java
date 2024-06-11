package com.xworkz.multipleinheritance.bridge;

import com.xworkz.multipleinheritance.things.Chicken;
import com.xworkz.multipleinheritance.things.Fish;
import com.xworkz.multipleinheritance.things.Goat;
import com.xworkz.multipleinheritance.things.MeatShop;
import com.xworkz.multipleinheritance.things.Sheep;

public class Customer extends MeatShop implements Chicken,Sheep,Goat,Fish{

	@Override
	public void quantityOfFish() {
		System.out.println("this is quantityOfFish method");
		
	}

	@Override
	public void costOfFish() {
		System.out.println("this is costOfFish method");
		
	}

	@Override
	public void addressOfFishShop() {
		System.out.println("this is addressOfFishShop method");
		
	}

	@Override
	public void storeNameOfFish() {
		System.out.println("this is storeNameOfFish method");
		
	}

	@Override
	public void customerNameOfFish() {
		System.out.println("this is customerNameOfFish method");
		
	}

	@Override
	public void quantityOfGoat() {
		System.out.println("this is quantityOfGoat method");
		
	}

	@Override
	public void costOfGoat() {
		System.out.println("this is costOfGoat method");
		
	}

	@Override
	public void addressOfGoatShop() {
		System.out.println("this is addressOfGoatShop method");
	}

	@Override
	public void storeNameOfGoat() {
		System.out.println("this is storeNameOfGoat method");
		
	}

	@Override
	public void customerNameOfGoat() {
		System.out.println("this is customerNameOfGoat method");
		
	}

	@Override
	public void quantityOfSheep() {
		System.out.println("this is quantityOfSheep method");
		
	}

	@Override
	public void costOfSheep() {
		System.out.println("this is costOfSheep method");
	}

	@Override
	public void addressOfSheepShop() {
		System.out.println("this is addressOfSheepShop method");
		
	}

	@Override
	public void storeNameOfSheep() {
		System.out.println("this is storeNameOfSheep method");
		
	}

	@Override
	public void customerNameOfSheep() {
		System.out.println("this is customerNameOfSheep method");
		
	}

	@Override
	public void quantity() {
		System.out.println("this is quantity method");
		
	}

	@Override
	public void cost() {
		System.out.println("this is cost method");
		
	}

	@Override
	public void address() {
		System.out.println("this is address method");
		
	}

	@Override
	public void storeName() {
		System.out.println("this is storeName method");		
	}

	@Override
	public void customerName() {
		System.out.println("this is customerName method");
		
	}
	
	public void quantityOfMeat() {
		System.out.println("this is quantityOfMeat method");
	}
	
	public void quality() {
		System.out.println("this is quality of meat method");
	}
	
	public String ownerNameOfShop() {
		System.out.println("this is ownerNameOfShop method");
		return null;
	}
	
	public String storeNameOfShop() {
		System.out.println("this is storeNameOfShop of meat method");
		return null;
	}
	
	public boolean ifMeatAvailable() {
		System.out.println("this is ifMeatAvailable method");
		return false;
	}
	
	public float costOfMeat() {
		System.out.println("this is costOfMeat of meat method");
		return 0.0f;
	}
	
	public double gst() {
		System.out.println("this is gstOfMeat method");
		return 0.0d;
	}
	
	public long phoneNumber() {
		System.out.println("this is phoneNumber of meat method");
        return 0;	
	}
	
	

}
