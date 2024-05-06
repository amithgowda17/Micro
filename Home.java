class Home{
	
	public int noOfAppliances=4;
	public String address="Mysore";
	
	public Home(){
		
		System.out.println("This is no argument constructor");
	}
	
	public void homeDetails(int noOfAppliances){
		
		this.noOfAppliances=noOfAppliances;
		System.out.println("total appliances home contains==="+this.noOfAppliances);
		
	}
	
	public void homeAddress(String address){
		
		this.address=address;
		System.out.println("address of the home is==="+this.address);
	}
	
	
}