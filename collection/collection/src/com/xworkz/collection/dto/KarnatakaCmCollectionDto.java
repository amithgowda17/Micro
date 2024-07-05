package com.xworkz.collection.dto;

public class KarnatakaCmCollectionDto {
	
	private int age;
	private String name;
	private String electedFrom;
	
	public KarnatakaCmCollectionDto(int age, String name, String electedFrom) {
		super();
		this.age = age;
		this.name = name;
		this.electedFrom = electedFrom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getElectedFrom() {
		return electedFrom;
	}

	public void setElectedFrom(String electedFrom) {
		this.electedFrom = electedFrom;
	}

	@Override
	public String toString() {
		return "KarnatakaCmCollection [age=" + age + ", name=" + name + ", electedFrom=" + electedFrom + "]";
	}
	
	
	

}
