class Egg{
	
	int noOfEggsInShop;
	byte storage;
	short shopCode;
	long ownerNum;
	char series;
	boolean isEggAvailable;
	float costOfTrae;
	double gstOfTrae;
	String ownerName;
	
	public void total(int totalEggs){
		
		noOfEggsInShop=totalEggs;
		System.out.println("total eggs in the shop==="+noOfEggsInShop);
	}
	
	public void eggAvailability(boolean isAvailable){
		
		isEggAvailable=isAvailable;
		System.out.println("is egg available==="+isEggAvailable);	
	}
	
	public void nameOfOwner(String name){
		
		ownerName=name;
		System.out.println("name of the company is==="+ownerName);
	}
}
