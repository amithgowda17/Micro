package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.dto.MoviesCollectionDto;

public class MoviesCollectionRunner {

	public static void main(String[] args) {

		MoviesCollectionDto dto = new MoviesCollectionDto("Yajamana", 2005, "Vishnuvardhan");
		MoviesCollectionDto dto1 = new MoviesCollectionDto("KGF", 2018, "Yash");
		MoviesCollectionDto dto2 = new MoviesCollectionDto("Om", 2002, "ShivRajkumar");
		MoviesCollectionDto dto3 = new MoviesCollectionDto("Rajkumara", 2017, "PuneethRajkumar");

		String hitMovies = "Ugram";
		String hitMovies1 = "KGF";
		String hitMovies2 = "Kantara";
		String hitMovies3 = "Charlie777";
		String hitMovies4 = "Rajkumara";
		String hitMovies5 = "James";
		String hitMovies6 = "Kateera";
		String hitMovies7 = "Om";
		String hitMovies8 = "Jogi";
		String hitMovies9 = "Sawastik";

		Collection<MoviesCollectionDto> collection = new ArrayList<MoviesCollectionDto>();

		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);

		Iterator<MoviesCollectionDto> iterator = collection.iterator();

		while (iterator.hasNext()) {

			System.out.println("iterator===" + iterator.next());
		}
		
		
		for (MoviesCollectionDto moviesCollectionDto : collection) {
			System.out.println("for each looop==="+moviesCollectionDto);
		}

		
		if (collection.isEmpty()) {

			System.out.println("is empty === true");
		} else {

			System.out.println("is empty === false");
		}

		if (collection.containsAll(collection)) {

			System.out.println("containsAll===true");
		} else {

			System.out.println("containsAll===false");
		}

		Collection<String> collection1 = new ArrayList<>();

		collection1.add(hitMovies);
		collection1.add(hitMovies1);
		collection1.add(hitMovies2);
		collection1.add(hitMovies3);
		collection1.add(hitMovies4);
		collection1.add(hitMovies5);
		collection1.add(hitMovies6);
		collection1.add(hitMovies7);
		collection1.add(hitMovies8);
		collection1.add(hitMovies9);
		
		Iterator<String> iterator1=collection1.iterator();
		
		while(iterator1.hasNext()) {
			System.out.println("string iterator======"+iterator1.next());
		}

		System.out.println("size===" + collection1.size());
		
		boolean value=collection.equals(collection1);
		
		System.out.println("equals==="+value);

	}

}
