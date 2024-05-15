class Bus1{
	
	public int price;
	public String status;
	public Names nameOf;
	
	public void display(int price,String status,Names nameOf){
		this.price=price;
		this.status=status;
		this.nameOf=nameOf;
		
		System.out.println("enter your name ==="+this.nameOf.name);
		System.out.println("enter your phonenumber===="+this.nameOf.phoneNumber);
		System.out.println("enter your address===="+this.nameOf.address);
		System.out.println("price of the ticket==="+this.price);
		System.out.println("booking status===="+this.status);
		
		
	}

}