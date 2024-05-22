class Banks extends RBI{
	
	int noOfBanks;
	
	public void bank(int noOfBanks){
		
		System.out.println("total==="+this.noOfBanks);
		this.noOfBanks=noOfBanks;
		System.out.println("total==="+this.noOfBanks);
		super.noOfBanks=this.noOfBanks;
	}
}