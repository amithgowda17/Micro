package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collection.dto.ShowRoomCollectionDto;

public class ShowRoomCollectionRunner {

	public static void main(String[] args) {
		
		ShowRoomCollectionDto dto = new ShowRoomCollectionDto(300000, "Skoda", "Hebbal");
		ShowRoomCollectionDto dto1 = new ShowRoomCollectionDto(5000000, "Audi", "RRNagar");
		ShowRoomCollectionDto dto2 = new ShowRoomCollectionDto(1000000, "Hyundai", "BtmLayout");
		ShowRoomCollectionDto dto3 = new ShowRoomCollectionDto(2000000, "BMW", "Tolgate");
		
		
		Comparator<ShowRoomCollectionDto> comparator = new Comparator<ShowRoomCollectionDto>() {

			@Override
			public int compare(ShowRoomCollectionDto o1, ShowRoomCollectionDto o2) {
				if (o1.getPrice() > o2.getPrice()) {
					return 1;
				}
				return -1;
			}
		};
		
		
		List<ShowRoomCollectionDto> list = new ArrayList<ShowRoomCollectionDto>();
		
		
		list.add(dto);
		list.add(dto2);
		list.add(dto3);
		list.add(dto1);
		
		
		
		Collections.sort(list,comparator);
		
		for (ShowRoomCollectionDto showRoomCollection : list) {
			System.out.println(showRoomCollection);
		}
		
	}
}