class Mobile1{
	
	public Mobile1(){
		//System.out.println("This is no args constructor");
		this(10000,"Samsung");
	}
	
	public Mobile1(int price){
		
		System.out.println("price of the mobile is==="+price);
	}
	
	public Mobile1(int price,String companyName){
		
		System.out.println("mobiles details are==="+price+"  and"+companyName);
	}
}
