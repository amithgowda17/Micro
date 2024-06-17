package com.xworkz.stocks.bridge;

import com.xworkz.stocks.things.StockMarket;

public class StockMarketBridge implements StockMarket{

	@Override
	public void totalStocks() {
		System.out.println("this is totalstocks method in bridge class");
		
	}

	@Override
	public void priceOfEachStock() {
		System.out.println("this is priceOfEachStock method in bridge class");
		
	}

}
