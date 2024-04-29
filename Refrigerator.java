class Refrigerator{
	
	int noOfRefrigerator;
	byte storage;
	short refrigeratorCode;
	long customerNum;
	char series;
	boolean isRefrigeratorAvailable;
	float cost;
	double gst;
	String companyName;
	
	public void total(int totalRefrigerator){
		
		noOfRefrigerator=totalRefrigerator;
		System.out.println("total number of refrigerator==="+noOfRefrigerator);
	}
	
	public void refrigeratorAvailability(boolean isAvailable){
		
		isRefrigeratorAvailable=isAvailable;
		System.out.println("is refrigerator available==="+isRefrigeratorAvailable);	
	}
	
	public void nameOfCompany(String name){
		
		companyName=name;
		System.out.println("name of the company is==="+companyName);
	}
}
