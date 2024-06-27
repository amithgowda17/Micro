package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.dto.IccCollectionDto;

public class IccCollectionRunner {
	
	public static void main(String[] args) {
		
		IccCollectionDto dto = new IccCollectionDto(1,"India","Rohith Sharma");
		IccCollectionDto dto1 = new IccCollectionDto(2,"Australia","Pat Cummins");
		IccCollectionDto dto2 = new IccCollectionDto(3,"England","Jos Buttler");
		IccCollectionDto dto3 = new IccCollectionDto(4,"Newzeland","Kane williamson");
		
		String captianNameOfIndia="Rohith Sharma";
		String captianNameOfWestIndies="Roman Powell";
		String captianNameOfAustralia="Pat Cummins";
		String captianNameOfEngland="Jos Buttler";
		String captianNameOfSouthAfrica="Aiden Markram";
		String captianNameOfPakistan="Babar Azam";
		String captianNameOfAfganisthan="Rashid Khan";
		String captianNameOfSrilanka="Hasaranga";
		String captianNameOfNewZeland="Kane Williamson";
		String captianNameOfIreland="Paul Stirling";
		
		Collection<IccCollectionDto> collection=new ArrayList<IccCollectionDto>();
		
		collection.add(dto3);
		collection.add(dto2);
		collection.add(dto1);
		collection.add(dto);
		
		
		Iterator<IccCollectionDto> iterate=collection.iterator();
		
		while(iterate.hasNext()) {
			
			System.out.println("iterator==="+iterate.next());
		}
		
		System.out.println("size of collection is==="+collection.size());
		
		if(collection.isEmpty()==true) {
			
			System.out.println("it is empty");
			
		}else {
			System.out.println("its not empty");
		}
		
		if(collection.contains(dto)) {
			System.out.println("contains === true");
		}else {
			System.out.println("contains === false");
		}
		
		Collection<String> collection1=new ArrayList<String>();
		
		collection1.add(captianNameOfIreland);
		collection1.add(captianNameOfNewZeland);
		collection1.add(captianNameOfAfganisthan);
		collection1.add(captianNameOfPakistan);
		collection1.add(captianNameOfSrilanka);
		collection1.add(captianNameOfAustralia);
		collection1.add(captianNameOfEngland);
		collection1.add(captianNameOfSouthAfrica);
		collection1.add(captianNameOfWestIndies);
		collection1.add(captianNameOfIndia);
		
		Iterator<String> iterate1 = collection1.iterator();
		
		while(iterate1.hasNext()) {
			System.out.println("iterator of string==="+iterate1.next());
		}
		
		boolean value=collection.equals(collection1);
		
		System.out.println("equals value==="+value);
		
	}

}
