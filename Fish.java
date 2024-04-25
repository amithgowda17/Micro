class Fish{
	
	static int totalFishs;
	static boolean isCatlaAvailable;
	static String fishName;
	
	public static void setFishTotal(int total){
		System.out.println("total no of fishs in set method==="+total);
		totalFishs=total;
		
	}
	
	public static void setCatlaAvailability(boolean available){
		System.out.println("is catla fish available in set method==="+available);
		isCatlaAvailable=available;
		
	}
	
	public static void setFishDetails(String nameOfFish){
		System.out.println("name of the fish in set method is==="+nameOfFish);
		fishName=nameOfFish;
		
	}
	
	public static int getFishTotal(){
		System.out.println("total no of fish in get method is==="+totalFishs);
		return totalFishs;
	}
	
	public static boolean getCatlaAvailability(){
		System.out.println("is catla available in get method==="+isCatlaAvailable);
		return isCatlaAvailable;
	}
	
	public static String getFishName(){
		System.out.println("name of the fish in get method is==="+fishName);
		return fishName;
	}
	
}