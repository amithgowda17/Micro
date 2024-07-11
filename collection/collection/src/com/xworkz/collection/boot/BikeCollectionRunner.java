package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collection.dto.BikeCollectionDto;

public class BikeCollectionRunner {
	
	public static void main(String[] args) {
		
		BikeCollectionDto dto = new BikeCollectionDto(50000, "Honda", "RR Nagar", 200);
		BikeCollectionDto dto1 = new BikeCollectionDto(150000, "Pulsar", "BTM layout", 180);
		BikeCollectionDto dto2 = new BikeCollectionDto(390000, "KTM", "Kottigepalya", 390);
		BikeCollectionDto dto3 = new BikeCollectionDto(500000, "BMW", "RT Nagar", 350);
		BikeCollectionDto dto4 = new BikeCollectionDto(350000, "Royal enfield", "Basveshwar Nagar",390);
		
		
		Comparator<BikeCollectionDto> comparator=new Comparator<BikeCollectionDto>() {
			
			@Override
			public int compare(BikeCollectionDto o1, BikeCollectionDto o2) {
				if(o1.getPrice()>o2.getPrice()) {
					return 1;
				}
				return -1;
			}
		};
		
		
		List<BikeCollectionDto> list=new ArrayList<BikeCollectionDto>();
		
		System.out.println("size of the methods==="+list.size());
		
		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		
		Collections.sort(list,comparator);
		
		for (BikeCollectionDto bikeCollectionDto : list) {
			System.out.println("colection==="+bikeCollectionDto.toString());
		}
		
	
	
	}

}
