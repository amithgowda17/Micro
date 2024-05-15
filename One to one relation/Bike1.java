class Bike1{
	
	
	public String brand;
	public Engines detail;
	
	public void display(String brand,Engines detail){
		
		this.brand=brand;
		this.detail=detail;
		System.out.println("cc=="+detail.cc);
		System.out.println("Varient=="+detail.varient);
		System.out.println("model=="+detail.model);
		System.out.println("brand=="+brand);
		
		
		
	}
	
}
