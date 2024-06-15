package bridge;

import things.KrMarket;

public class KrMarketBridge implements KrMarket{

	@Override
	public void price() {
		System.out.println("this is price method");
		
	}

	@Override
	public void products() {
		System.out.println("this is product method");
		
	}
	
	

}
