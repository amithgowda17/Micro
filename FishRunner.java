class FishRunner{
	
	public static void main(String []args){
		Fish.setFishTotal(150);
		Fish.setCatlaAvailability(true);
		Fish.setFishDetails("Catla");
		int getTotalMethod=Fish.getFishTotal();
		boolean getAvailable=Fish.getCatlaAvailability();
		String getName=Fish.getFishName();
		
		System.out.println("total number of fish is==="+getTotalMethod);
		System.out.println("is catla available==="+getAvailable);
		System.out.println("name of the fish is==="+getName);
		
	}
		
}