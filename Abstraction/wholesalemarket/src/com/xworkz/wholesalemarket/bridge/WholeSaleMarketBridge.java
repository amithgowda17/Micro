package com.xworkz.wholesalemarket.bridge;

import com.xworkz.wholesalemarket.things.WholeSaleMarket;

public class WholeSaleMarketBridge implements WholeSaleMarket{

	@Override
	public void inventory() {
		System.out.println("this is inventory method");
		
	}

	@Override
	public void price() {
		System.out.println("this is price method");
		
	}
	
	

}
