class Land{
	
	static int sqfOfLand;
	static boolean isLandReadyForRegistration;
	static String buyerName;
	
	public static void setLandDimension(int sqf){
		System.out.println("the sqf of the land in set method==="+sqf);
		sqfOfLand=sqf;
		
	}
	
	public static void setLandForRegister(boolean canRegister){
		System.out.println("is land registration possible in set method==="+canRegister);
		isLandReadyForRegistration=canRegister;
		
	}
	
	public static void setCustomerDetails(String clientName){
		System.out.println("name of the customer in set method is==="+clientName);
		buyerName=clientName;
		
	}
	
	public static int getLandDimension(){
		System.out.println("the sqf of the land in get method is==="+sqfOfLand);
		return sqfOfLand;
	}
	
	public static boolean getLandForRegister(){
		System.out.println("is land registration possible in get method==="+isLandReadyForRegistration);
		return isLandReadyForRegistration;
	}
	
	public static String getCustomerDetails(){
		System.out.println("name of the customer in get method is==="+buyerName);
		return buyerName;
	}
	
}