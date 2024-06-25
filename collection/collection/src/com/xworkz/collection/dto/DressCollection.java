package com.xworkz.collection.dto;

public class DressCollection {
	
	private int noOfDress;
	private String shopName;
	private int price;
	private String address;
	
	
	public DressCollection(int noOfDress, String shopName, int price, String address) {
		super();
		this.noOfDress = noOfDress;
		this.shopName = shopName;
		this.price = price;
		this.address = address;
	}
	
	public int getNoOfDress() {
		return noOfDress;
	}
	public void setNoOfDress(int noOfDress) {
		this.noOfDress = noOfDress;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "DressCollection [noOfDress=" + noOfDress + ", shopName=" + shopName + ", price=" + price + ", address="
				+ address + "]";
	}

}
