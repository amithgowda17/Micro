package com.xworkz.stocks.object;

import com.xworkz.stocks.bridge.StockMarketBridge;

public class Stock {
	
	public StockMarketBridge stocks;
	
	public Stock(StockMarketBridge stocks) {
		this.stocks=stocks;
		
	}

	public StockMarketBridge getStocks() {
		System.out.println("this is stock method");
		return stocks;
	}

	public void setStocks(StockMarketBridge stocks) {
		this.stocks = stocks;
	}
	
	

}
