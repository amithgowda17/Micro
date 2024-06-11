package com.xworkz.abstraction.sambar.bridge;

import com.xworkz.abstraction.sambar.things.Gas;
import com.xworkz.abstraction.sambar.things.Mutton;
import com.xworkz.abstraction.sambar.things.Oil;
import com.xworkz.abstraction.sambar.things.Spices;
import com.xworkz.abstraction.sambar.things.Water;

public class MuttonSambar extends Spices implements Water,Mutton,Oil,Gas {

	@Override
	public void companyName() {
		System.out.println("this is company name method of mutton sambar");
		
	}

	@Override
	public void price() {
		System.out.println("this is mutton sambar class of price method");
		
	}

	@Override
	public void ifOilAvailable() {
		
		System.out.println("this is if oil available method of mutton sambar");
		
	}

	@Override
	public void storeName() {
		System.out.println("this is store name method of mutton sambar");
	}

	@Override
	public void costOfMutton() {
		System.out.println("this is cost method of mutton sambar ");
		
	}

	@Override
	public void owneerName() {
		System.out.println("this is owner name of mutton sambar class");
		
	}

	@Override
	public void address() {
		System.out.println("this is address method of mutton sambar class");
		
	}

	@Override
	public void qualityOfMutton() {
		System.out.println("this is quality method of mutton sambar class");
		
	}

	@Override
	public void quantity() {
		System.out.println("this is quantity of mutton sambar class");
		
	}

	@Override
	public void cost() {
		System.out.println("this is cost method of mutton sambar class ");
	}

	@Override
	public void source() {
		System.out.println("this is source method of mutton sambar class");
		
	}

	@Override
	public void ifWaterAvailable() {
		System.out.println("this is if water available method of mutton sambar class");
		
	}

	@Override
	public void bill() {
		
		System.out.println("this is bill method of mutton sambar class");
		
	}
	
	public void noOfitmes() {
		System.out.println("total no of items is 10 of mutton sambar class");
	}
	
	public void shopNameOfSpices() {
		System.out.println("name of the shop is vinayaka store of mutton sambar class");
	}
	
	public String ingredients() {
		System.out.println("this is ingredients methods of mutton sambar class");
        return null;	
	}
	
	public String customers() {
		System.out.println("this is customers method of mutton sambar class");
	    return null;
	}
	
	
	public boolean ifItemsAvailable() {
		System.out.println("this is if item available method of mutton sambar class");
	    return false;
	}
	
	public double gst() {
		System.out.println("this is gst method of mutton sambar class");
	    return 0.0d;
	}
	
	public float priceOfSpices() {
		System.out.println("this is price method of mutton sambar class");
	    return 0.0f;
	}
	
	public long ownerNumber() {
	
		System.out.println("this is owner number method of mutton sambar class");
	    return 0; 
	}

	@Override
	public void priceOfGas() {
		System.out.println("this is price of gas child class");
		
	}

	@Override
	public void quantityOfGas() {
		System.out.println("this is quantity of gas");
		
	}

	@Override
	public void addressOfGas() {
		System.out.println("this is addressOfGas method");
		
	}

	@Override
	public void customerName() {
		System.out.println("this is customerName method");
		
	}
	

	@Override
	public void companyNameOfGas() {
		System.out.println("this is companyNameOfGas method");
		
	}

	@Override
	public void quantityOfOil() {
		System.out.println("this is quantityOfOil method");
		
	}

	@Override
	public void shopName() {
		System.out.println("this is shop name method ");
		
	}


}
