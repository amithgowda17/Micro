class Flute{
	
	static int noOfFlutes=10;
	
	public static void totalFlutes(){
		Gun.gunDetails();
		Gun.ownerDetails();
		
		System.out.println("total number of flutes is==="+noOfFlutes);
		System.out.println("name of the gun owner is=="+Gun.ownerName);
	}
}