package object;

import bridge.KrMarketBridge;

public class Shops {
	
	public KrMarketBridge shop;
	
	public Shops(KrMarketBridge shop) {
		this.shop=shop;
	}

	public KrMarketBridge getShop() {
		System.out.println("this is shop class");
		return shop;
	}

	public void setShop(KrMarketBridge shop) {
		this.shop = shop;
	}
	
	
	

}
