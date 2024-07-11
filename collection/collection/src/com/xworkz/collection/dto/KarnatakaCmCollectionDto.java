package com.xworkz.collection.dto;

public class KarnatakaCmCollectionDto implements Comparable<KarnatakaCmCollectionDto> {
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((electedFrom == null) ? 0 : electedFrom.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KarnatakaCmCollectionDto other = (KarnatakaCmCollectionDto) obj;
		if (age != other.age)
			return false;
		if (electedFrom == null) {
			if (other.electedFrom != null)
				return false;
		} else if (!electedFrom.equals(other.electedFrom))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(KarnatakaCmCollectionDto o) {
		if(this.getAge()>o.getAge()) {
			return 1;
		}
		return -1;
	}
	
	
	

}
