package com.xworkz.collection.dto;

public class BikeCollectionDto {
	
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
	
	

}
