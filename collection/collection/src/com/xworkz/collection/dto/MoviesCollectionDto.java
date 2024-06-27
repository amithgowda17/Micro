package com.xworkz.collection.dto;

public class MoviesCollectionDto {
	
	private String movieName;
	private int yearOfRelease;
	private String heroName;
	
	public MoviesCollectionDto(String movieName,int yearOfRelease,String heroName) {
		
		this.movieName=movieName;
		this.yearOfRelease=yearOfRelease;
		this.heroName=heroName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	@Override
	public String toString() {
		return "MoviesCollectionDto [movieName=" + movieName + ", yearOfRelease=" + yearOfRelease + ", heroName="
				+ heroName + "]";
	}
	
	

}
