package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collection.dto.DressCollection;

public class DressCollectionRunner {

	public static void main(String[] args) {

		DressCollection dto = new DressCollection(4, "Raw collection", 4000, "RR Nagar");
		DressCollection dto1 = new DressCollection(10, "Bro Zone", 15000, "Btm Layout");
		DressCollection dto2 = new DressCollection(5, "new collections", 6779, "KHB colony");
		DressCollection dto3 = new DressCollection(15, "Rockline stores", 17689, "A dasarahalli");
		DressCollection dto4 = new DressCollection(2, "mens collection", 1999, "Kamakshipalya");

		Comparator<DressCollection> comparator = new Comparator<DressCollection>() {

			@Override
			public int compare(DressCollection o1, DressCollection o2) {
				if (o1.getPrice() > o2.getPrice()) {
					return 1;
				}
				return -1;
			}
		};

		List<DressCollection> list = new ArrayList<DressCollection>();

		System.out.println("size===" + list.size());

		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);

		Collections.sort(list, comparator);

		for (DressCollection dres : list) {
			System.out.println("for loop is====" + dres.toString());
		}

	}

}
