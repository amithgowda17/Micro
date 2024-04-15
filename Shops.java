class Shops{
	
	public static void main(String []args){
		
		int numberOfShops=40;
		char seriesOfTheShop='B';
		byte storageCapacity=100;
		short shopCode=9135;
		long ownerPhoneNumber=8431331159l;
		boolean isShopOpened=true; 
		float priceOfTheShop=4000.2548f;
		double gstOfTheShop=500.0172676d;
		String shopName="Vinayaka Stores";
		
		if(numberOfShops==40){
			System.out.println("total number of numberOfShops==="+numberOfShops);
		}else{
			System.out.println("total number of shops doesnot matched");
		}
	   
	        if(seriesOfTheShop=='A'){
		System.out.println("the series of the shop is===="+seriesOfTheShop);
	        }else{
			System.out.println("the series of the shop is==="+seriesOfTheShop);
		}
		
		if(storageCapacity==100){
			System.out.println("storage capacity of the shop is==="+storageCapacity);
		}else{
			System.out.println("storage capacity of the shop doesn't matched");
		}
	    
		if(shopCode==5135){
			 System.out.println("shop code doesn't matched");
		}else{
			 System.out.println("the shop code is==="+shopCode);
		}
		
		if(ownerPhoneNumber==8431331159l){
			System.out.println("phone number of the shop owner is==="+ownerPhoneNumber);
		}else{
			System.out.println("phone number of the owner doesn't matched");
		}
		
		if(isShopOpened==false){
			System.out.println("shop is not opened yet");
		}else{
			System.out.println("shop is opened");
		}
		
		if(priceOfTheShop==4000.2548f){
			System.out.println("the cost of the shop is=="+priceOfTheShop);
		}else{
			System.out.println("price of the shop doesn't matched");
		}
		
		if(gstOfTheShop==200.978617d){
			System.out.println("gst of the shop succesfully matched");
		}else{
			System.out.println("gst of the shop doesnot matched");
		}
        
		if(shopName=="Vinayaka Stores"){
			System.out.println("the name of the shop is==="+shopName);
	        }else{
		System.out.println("shop name doesnot matched");
		}
	
	}
	
}
