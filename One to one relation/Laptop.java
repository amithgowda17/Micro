class Laptop{
	
	public Contact contact;
	public int price;
	public String companyName;
	
	public void display(Contact contact,int price,String companyName){
		
		this.contact=contact;
		this.price=price;
		this.companyName=companyName;
		
		System.out.println("name==="+this.contact.name);
		System.out.println("phonenumber===="+this.contact.phoneNumber);
		System.out.println("addresss==="+this.contact.address);
		System.out.println("price==="+price);
		System.out.println("company name==="+companyName);
	}
}