package boot;

import bridge.KrMarketBridge;
import object.Shops;

public class MarketRunner {
	
	public static void main(String[] args) {
		
		
		KrMarketBridge bridge =new KrMarketBridge();
		Shops shops=new Shops(bridge);
		
		shops.getShop();
		
	}

}
