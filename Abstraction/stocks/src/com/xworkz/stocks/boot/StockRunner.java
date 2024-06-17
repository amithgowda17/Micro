package com.xworkz.stocks.boot;

import com.xworkz.stocks.bridge.StockMarketBridge;
import com.xworkz.stocks.object.Stock;

public class StockRunner {
	
	public static void main(String[] args) {
		
		StockMarketBridge bridge = new StockMarketBridge();
		
		Stock stock=new Stock(bridge);
		stock.getStocks();
	}

}
