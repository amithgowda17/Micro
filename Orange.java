class Orange{
	
	int noOfOrange=5;
	boolean ifOragneJuiceAvailable=true;
	
	public Orange(){
		
		System.out.println("This is no argument constructor");
	}
	
	public void total(int noOfOrange){
		
		this.noOfOrange=noOfOrange;
		System.out.println("total number of orange is=="+this.noOfOrange);
	}
	
	public void juiceAvailability(boolean ifOragneJuiceAvailable){
		this.total(100);
		this.ifOragneJuiceAvailable=ifOragneJuiceAvailable;
		System.out.println("if Oragne Juice Available=="+this.ifOragneJuiceAvailable);
	}
	
}