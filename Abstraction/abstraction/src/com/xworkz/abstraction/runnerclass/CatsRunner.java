package com.xworkz.abstraction.runnerclass;

import com.xworkz.abstraction.childclasess.Dogs;
import com.xworkz.abstraction.childclasess.Tiger;

public class CatsRunner {

	public static void main(String[] args) {
		
		Dogs dogs=new Dogs();
		Tiger tiger=new Tiger();
		
		dogs.cat();
		dogs.types();
		dogs.species();
		dogs.pets();
		dogs.foody();
		
		tiger.cat();
		tiger.types();
		tiger.species();
		tiger.pets();
		tiger.foody();
		
	}

}
