package com.xworkz.collection.dto;

public class ShowRoomCollectionDto implements Comparable<ShowRoomCollectionDto>{
	
	
	private int price;
	private String companyName;
	private String address;
	
	
	public ShowRoomCollectionDto(int price, String companyName, String address) {
		super();
		this.price = price;
		this.companyName = companyName;
		this.address = address;
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


	@Override
	public String toString() {
		return "ShowRoomCollectionDto [price=" + price + ", companyName=" + companyName + ", address=" + address + "]";
	}


	@Override
	public int compareTo(ShowRoomCollectionDto o) {
		if(this.getPrice()>o.getPrice()) {
			return 1;
		}
		return -1;
	}
	
	

}
