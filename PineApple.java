class PineApple{
	
	
	
	public PineApple(){
		System.out.println("this is no args constructor");
		this.total(10);
		this.owner("Ravi");
	}
	
	public void total(int noOfPineApple){
		System.out.println("total number of pineapple is==="+noOfPineApple);
	}
	
	public static void owner(String name){
		System.out.println("name of the owner is== "+name);
	}
	
}