class LandRunner{
	
	public static void main(String []args){
		Land.setLandDimension(1200);
		Land.setLandForRegister(true);
		Land.setCustomerDetails("Revanth");
		int getLandMethod=Land.getLandDimension();
		boolean getRegister=Land.getLandForRegister();
		String getCustomerMethod=Land.getCustomerDetails();
		
		System.out.println("the sqf of the land is==="+getLandMethod);
		System.out.println("is land registration possible==="+getRegister);
		System.out.println("name of the customer is==="+getCustomerMethod);
		
	}
		
}
