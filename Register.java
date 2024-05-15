class Register{
	
	public int ticketPrice;
	public Detail data;
	public String status;
	
	public void registration(int ticketPrice,Detail data,String status){
		
		this.ticketPrice=ticketPrice;
		this.data=data;
		this.status=status;
		
		System.out.println("enter your name==="+this.data.name);
		System.out.println("enter your phoneNumber==="+this.data.phoneNumber);
		System.out.println("enter aadhar number==="+this.data.aadharNumber);
		System.out.println("price of the ticket==="+this.ticketPrice);
		System.out.println("booking status==="+this.status);
		
		
	}
}