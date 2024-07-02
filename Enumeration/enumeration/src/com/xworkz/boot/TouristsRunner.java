package com.xworkz.boot;

import com.xworkz.constants.TouristsEnum;

public class TouristsRunner {
	
	public static void main(String[] args) {
		
		
		String name = TouristsEnum.GOKARANA.getPlaceName();
		int distance = TouristsEnum.GOKARANA.getNoOfKm();
		
		String name1 = TouristsEnum.MYSORE.getPlaceName();
		int distance1 = TouristsEnum.MYSORE.getNoOfKm();
		
		String name2 = TouristsEnum.CHIKKBALLAPURA.getPlaceName();
		int distance2 = TouristsEnum.CHIKKBALLAPURA.getNoOfKm();
		
		String name3 = TouristsEnum.BHATKAL.getPlaceName();
		int distance3 = TouristsEnum.BHATKAL.getNoOfKm();
		
		String name4 = TouristsEnum.VIJAYANAGARA.getPlaceName();
		int distance4 = TouristsEnum.VIJAYANAGARA.getNoOfKm();
		
		String name5 = TouristsEnum.UDUPI.getPlaceName();
		int distance5 = TouristsEnum.UDUPI.getNoOfKm();
		
		String name6 = TouristsEnum.NAGARHOLE.getPlaceName();
		int distance6 = TouristsEnum.NAGARHOLE.getNoOfKm();
		
		String name7 = TouristsEnum.BANDIPURA.getPlaceName();
		int distance7 = TouristsEnum.BANDIPURA.getNoOfKm();
		
		System.out.println("name=="+name);
		System.out.println("distance=="+distance);
		
		System.out.println("name1=="+name1);
		System.out.println("distance1=="+distance1);
		
		System.out.println("name2=="+name2);
		System.out.println("distance2=="+distance2);
		
		System.out.println("name3=="+name3);
		System.out.println("distance3=="+distance3);
		
		System.out.println("name4=="+name4);
		System.out.println("distance4=="+distance4);
		
		System.out.println("name5=="+name5);
		System.out.println("distance5=="+distance5);
		
		System.out.println("name6=="+name6);
		System.out.println("distance6=="+distance6);
		
		System.out.println("name7=="+name7);
		System.out.println("distance7=="+distance7);
	}

}
