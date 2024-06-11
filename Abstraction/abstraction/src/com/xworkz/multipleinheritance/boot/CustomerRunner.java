package com.xworkz.multipleinheritance.boot;

import com.xworkz.multipleinheritance.bridge.Customer;

public class CustomerRunner {
	
	public static void main(String[] args) {
		
		Customer customer=new Customer();
		
		customer.quantityOfFish();
		customer.costOfFish();
		customer.addressOfFishShop();
		customer.storeNameOfFish();
		customer.customerNameOfFish();
		customer.quantityOfGoat();
		customer.costOfGoat();
		customer.addressOfGoatShop();
		customer.storeNameOfGoat();
		customer.customerNameOfGoat();
		customer.quantityOfSheep();
		customer.costOfSheep();
		customer.addressOfSheepShop();
		customer.storeNameOfSheep();
		customer.customerNameOfSheep();
		customer.quality();
		customer.cost();
		customer.address();
		customer.storeName();
		customer.customerName();
		customer.quantityOfMeat();
		customer.quality();
		customer.ownerNameOfShop();
		customer.storeName();
		customer.ifMeatAvailable();
		customer.costOfMeat();
		customer.gst();
		customer.phoneNumber();
		
	}

}
