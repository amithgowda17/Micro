package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.dto.DressCollection;

public class DressCollectionRunner {

	public static void main(String[] args) {
		
		DressCollection dto = new DressCollection(4, "Raw collection", 4000, "RR Nagar");
		DressCollection dto1 = new DressCollection(10, "Bro Zone", 15000, "Btm Layout");
		DressCollection dto2 = new DressCollection(5, "new collections", 6779, "KHB colony");
		DressCollection dto3 = new DressCollection(15, "Rockline stores", 17689, "A dasarahalli");
		DressCollection dto4 = new DressCollection(2, "mens collection", 1999, "Kamakshipalya");

		Collection<DressCollection> collection = new ArrayList<DressCollection>();
		
		System.out.println("size===" + collection.size());
		
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		
		for(DressCollection dress:collection) {
			System.out.println("for loop is===="+dress.toString());
		}
		
		System.out.println("size after methods===" + collection.size());
		
		collection.remove(dto2);
		
		System.out.println("size after methods===" + collection.size());
		
		collection.clear();
		
		System.out.println("size after methods===" + collection.size());

	}

}
