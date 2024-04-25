class BottleRunner{
	
	public static void main(String []args){
		Bottle.setBottleTotal(10);
		Bottle.setWaterAvailability(true);
		Bottle.setStorageDetails("Water");
		int getTotalMethod=Bottle.getBottleTotal();
		boolean getAvailable=Bottle.getisWaterAvailable();
		String getStorage=Bottle.getStorageDetails();
		
		System.out.println("total number of bottles is==="+getTotalMethod);
		System.out.println("is water available==="+getAvailable);
		System.out.println("bottle contains is==="+getStorage);
		
	}
		
}