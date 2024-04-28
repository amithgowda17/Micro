class RefrigeratorRunner{
	
	public static void main(String []args){
		
		Refrigerator ref=new Refrigerator();
		
		ref.total(10);
		ref.refrigeratorAvailability(true);
		ref.nameOfCompany("Samsung");
		ref.storage=120;
		ref.refrigeratorCode=5675;
		ref.customerNum=962992267l;
		ref.series='L';
		ref.cost=30000.6786f;
		ref.gst=3000.17899d;
		
		System.out.println("storage capacity of refrigerator is==="+ref.storage);
		System.out.println("refrigerator code is==="+ref.refrigeratorCode);
		System.out.println("customer number is==="+ref.customerNum);
		System.out.println("series of refrigerator is==="+ref.series);
		System.out.println("cost of the refrigerator is==="+ref.cost);
		System.out.println("gst of the refrigerator is==="+ref.gst);
		
			
	}
}