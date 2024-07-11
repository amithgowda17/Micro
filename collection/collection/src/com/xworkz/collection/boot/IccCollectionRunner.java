package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collection.dto.IccCollectionDto;

public class IccCollectionRunner {

	public static void main(String[] args) {

		IccCollectionDto dto1 = new IccCollectionDto(2, "Australia", "Pat Cummins");
		IccCollectionDto dto = new IccCollectionDto(1, "India", "Rohith Sharma");
		IccCollectionDto dto3 = new IccCollectionDto(4, "Newzeland", "Kane williamson");
		IccCollectionDto dto2 = new IccCollectionDto(3, "England", "Jos Buttler");

		Comparator<IccCollectionDto> comparator = new Comparator<IccCollectionDto>() {

			@Override
			public int compare(IccCollectionDto o1, IccCollectionDto o2) {
				if (o1.getIccRankings() > o2.getIccRankings()) {
					return 1;
				}
				return -1;
			}
		};

		List<IccCollectionDto> list = new ArrayList<IccCollectionDto>();

		list.add(dto3);
		list.add(dto2);
		list.add(dto1);
		list.add(dto);

		Collections.sort(list, comparator);

		for (IccCollectionDto icc : list) {

			System.out.println("icc===" + icc);

		}

	}
}
