package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collection.dto.KarnatakaCmCollectionDto;
import com.xworkz.collection.dto.ShowRoomCollectionDto;

public class KaranatakaCmCollectionRunner {

	public static void main(String[] args) {

		KarnatakaCmCollectionDto dto = new KarnatakaCmCollectionDto(75, "Siddhramaiah", "Varuna");
		KarnatakaCmCollectionDto dto1 = new KarnatakaCmCollectionDto(76, "Yeddiyurappa", "Shimogga");
		KarnatakaCmCollectionDto dto2 = new KarnatakaCmCollectionDto(65, "Kumarswamy", "Channapatna");
		KarnatakaCmCollectionDto dto3 = new KarnatakaCmCollectionDto(69, "Bangarappa", "Shorabha");
		
	Comparator<KarnatakaCmCollectionDto> comparator = new Comparator<KarnatakaCmCollectionDto>() {

			@Override
			public int compare(KarnatakaCmCollectionDto o1, KarnatakaCmCollectionDto o2) {
				if (o1.getAge() > o2.getAge()) {
					return 1;
				}
				return -1;
			}
		};

		List<KarnatakaCmCollectionDto> list = new ArrayList<KarnatakaCmCollectionDto>();

		list.add(dto);
		list.add(dto2);
		list.add(dto3);
		list.add(dto1);

		Collections.sort(list,comparator);

		for (KarnatakaCmCollectionDto colldto : list) {
			System.out.println(colldto);
		}

	}

}
