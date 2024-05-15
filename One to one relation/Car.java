class Car{
	
	public String model;
	public String brand;
	public Details detail;
	
	public void display(String model,String brand,Details detail){
		this.model=model;
		this.brand=brand;
		this.detail=detail;
		System.out.println("name=="+detail.name);
		System.out.println("phoneNumber=="+detail.phoneNumber);
		System.out.println("adress=="+detail.address);
		System.out.println("brand=="+brand);
		System.out.println("model=="+model);
		
		
	}
	
}
