package com.xworkz.abstraction.tata.bridge;

import com.xworkz.abstraction.tata.things.Business;
import com.xworkz.abstraction.tata.things.Charity;
import com.xworkz.abstraction.tata.things.Employees;
import com.xworkz.abstraction.tata.things.RatanTata;
import com.xworkz.abstraction.tata.things.Social;

public class Tata extends RatanTata implements Social,Employees,Business,Charity{
	
	@Override
	public void bike() {
	
		System.out.println("This is Bike method");
	}

	@Override
	public void bus() {
		
		System.out.println("This is Bus method");
	}

	@Override
	public void fire() {
		
		System.out.println("This is fire method");
	}

	@Override
	public void camera() {
		
		System.out.println("This is camera method");
	}

	@Override
	public void safty() {
		
		System.out.println("This is safty method");
	}

	@Override
	public void tender() {
		
		System.out.println("This is tender method");
	}

	@Override
	public void temples() {
		
		System.out.println("This is temples method");
	}

	@Override
	public void roads() {
		
		System.out.println("This is roads method");
	}

	@Override
	public void formLand() {
		
		System.out.println("This is form land method");
	}

	@Override
	public void cattle() {
		
		System.out.println("This is cattle method");
	}

	@Override
	public void sales() {
		
		System.out.println("This is Sales method");
	}

	@Override
	public void market() {
		
		System.out.println("This is market method");
	}

	@Override
	public void pfDept() {
		
		System.out.println("This is PF dept method");
	}

	@Override
	public void salary() {
		
		System.out.println("This is salary method");
	}

	@Override
	public void shares() {
		
		System.out.println("This is Shares method");
	}

	@Override
	public void nameOfAshrama() {
		
		System.out.println("This is name of Ashrama method");
	}

	@Override
	public void location() {
		
		System.out.println("This is location method");
	}

	@Override
	public void noOfStaff() {
		
		System.out.println("This is number of staff method");
	}

	@Override
	public void nameOfPresident() {
		
		System.out.println("This is name of president method");
	}
	
	@Override
	public void name() {
		System.out.println("this is name method");
	}
	
	@Override
	public void college() {
		System.out.println("this is college method");
	}
	
	@Override
	public String simple() {
		System.out.println("he is very simple");
		return null;
	}
	
	@Override
	public String noExpensive() {
		System.out.println("No expensive things required");
		return null;
	}
	
	@Override
	public boolean moral() {
		System.out.println("Be moral");
		return false;
	}
	
	@Override
	public float address() {
		System.out.println("this is address method");
		return 0.0f;
	}
	
	@Override
	public double patience() {
		System.out.println("be patient");
		return 0.0d;
	}
	
	@Override
	public long standard() {
		System.out.println("Be market standard");
		return 0;
	}

}
