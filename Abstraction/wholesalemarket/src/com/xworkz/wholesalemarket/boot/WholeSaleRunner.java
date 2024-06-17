package com.xworkz.wholesalemarket.boot;

import com.xworkz.wholesalemarket.bridge.WholeSaleMarketBridge;
import com.xworkz.wholesalemarket.object.Shop;

public class WholeSaleRunner {
	
	public static void main(String[] args) {
		
		WholeSaleMarketBridge bridge=new WholeSaleMarketBridge();
		
		Shop shop=new Shop(bridge);
		
		shop.getShops();
	}

}
