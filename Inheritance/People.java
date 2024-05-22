class People extends King{
	
	int noOfPeople;
	
	public void peopleTotal(int noOfPeople){
		
		System.out.println("total==="+this.noOfPeople);
		this.noOfPeople=noOfPeople;
		System.out.println("total==="+this.noOfPeople);
		super.noOfPeople=this.noOfPeople;
	}
}