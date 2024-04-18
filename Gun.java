class Gun{
	
	static int noOfGuns=25;
	static String ownerName;
	
	public static void gunDetails(){
		
		System.out.println("total number of guns is==="+noOfGuns);
	}
	
	public static void ownerDetails(){
		ownerName="Revanth";
		
		System.out.println("name of the gun owner is=="+ownerName);
	}
}