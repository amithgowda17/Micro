package com.xworkz.collection.dto;

public class BikeCollectionDto implements Comparable<BikeCollectionDto>{
	
	private int price;
	private String companyName;
	private String address;
	private int cc;
	
	public BikeCollectionDto(int price, String companyName, String address, int cc) {
		super();
		this.price = price;
		this.companyName = companyName;
		this.address = address;
		this.cc = cc;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getCc() {
		return cc;
	}
	
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	@Override
	public String toString() {
		return "Bike [price=" + price + ", companyName=" + companyName + ", address=" + address + ", cc=" + cc + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + cc;
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + price;
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
		BikeCollectionDto other = (BikeCollectionDto) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (cc != other.cc)
			return false;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
	public int compareTo(BikeCollectionDto o) {
		if(this.getCc()>o.getCc()) {
			return 1;
		}
		return -1;
	}
	
	

}
