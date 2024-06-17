package com.xworkz.wholesalemarket.object;

import com.xworkz.wholesalemarket.bridge.WholeSaleMarketBridge;

public class Shop {
	
	public WholeSaleMarketBridge shops;
	
	public Shop(WholeSaleMarketBridge shops) {
		this.shops=shops;
	}

	public WholeSaleMarketBridge getShops() {
		System.out.println("this is shop");
		return shops;
	}

	public void setShops(WholeSaleMarketBridge shops) {
		this.shops = shops;
	}
	

}
