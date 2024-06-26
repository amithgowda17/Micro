package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.BikeCollectionDto;

public class BikeCollectionRunner {
	
	public static void main(String[] args) {
		
		BikeCollectionDto dto = new BikeCollectionDto(50000, "Honda", "RR Nagar", 200);
		BikeCollectionDto dto1 = new BikeCollectionDto(150000, "Pulsar", "BTM layout", 180);
		BikeCollectionDto dto2 = new BikeCollectionDto(390000, "KTM", "Kottigepalya", 390);
		BikeCollectionDto dto3 = new BikeCollectionDto(500000, "BMW", "RT Nagar", 350);
		BikeCollectionDto dto4 = new BikeCollectionDto(350000, "Royal enfield", "Basveshwar Nagar",390);
		
		Collection<BikeCollectionDto> collection=new ArrayList<BikeCollectionDto>();
		
		System.out.println("size of the methods==="+collection.size());
		
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		
		for (BikeCollectionDto bikeCollectionDto : collection) {
			System.out.println("colection==="+bikeCollectionDto.toString());
		}
		
		System.out.println("size of the methods==="+collection.size());
		
		collection.remove(dto3);
		
		System.out.println("size of the methods==="+collection.size());
		
		collection.clear();
		
		System.out.println("size of the methods==="+collection.size());
		
	
	}

}
