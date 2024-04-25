class Bottle{
	
	static int totalBottles;
	static boolean isWaterAvailable;
	static String bottleContains;
	
	public static void setBottleTotal(int total){
		System.out.println("total no of bottles in set method==="+total);
		totalBottles=total;
		
	}
	
	public static void setWaterAvailability(boolean available){
		System.out.println("is water available in set method==="+available);
		isWaterAvailable=available;
		
	}
	
	public static void setStorageDetails(String store){
		System.out.println("bottle contains in set method is==="+store);
		bottleContains=store;
		
	}
	
	public static int getBottleTotal(){
		System.out.println("total bottles in get method is==="+totalBottles);
		return totalBottles;
	}
	
	public static boolean getisWaterAvailable(){
		System.out.println("is water available in get method==="+isWaterAvailable);
		return isWaterAvailable;
	}
	
	public static String getStorageDetails(){
		System.out.println("bottle contains in get method is==="+bottleContains);
		return bottleContains;
	}
	
}