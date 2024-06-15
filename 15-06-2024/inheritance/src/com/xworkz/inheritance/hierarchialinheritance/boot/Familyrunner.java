package com.xworkz.inheritance.hierarchialinheritance.boot;

import com.xworkz.inheritance.hierarchialinheritance.childclass.Amith;
import com.xworkz.inheritance.hierarchialinheritance.childclass.Ravi;

public class Familyrunner {
	
	public static void main(String[] args) {
		
		Amith amith=new Amith();
		Ravi ravi=new Ravi();
		
		amith.father();
		ravi.father();
		
		
	}

}
