class Apple{
	
	int noOfApple=5;
	String ownerName="Ravi";
	
	public Apple(){
		
		System.out.println("This is no argument constructor");
	}
	
	public void total(int noOfApple){
		
		this.noOfApple=noOfApple;
		System.out.println("total number of apple is=="+this.noOfApple);
	}
	
	public void name(String ownerName){
		
		this.ownerName=ownerName;
		System.out.println("name of the owner is=="+this.ownerName);
	}
	
}