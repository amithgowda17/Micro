class JackFruit{
	
	int noOfJackFruit=10;
	
	public JackFruit(){
		
		System.out.println("this is no argument constructor");
	}
	
	public JackFruit(int noOfJackFruit){
		
		this.noOfJackFruit=noOfJackFruit;
		System.out.println("total jackfruit is==="+this.noOfJackFruit);
		
	}
}