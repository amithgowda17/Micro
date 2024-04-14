class Mobile{
	
	public static void main(String []args){
		
		int numberOfMobiles=50;
		char seriesOfTheMobile='a';
		byte storage=64;
		short mobileCode=9674;
		long phoneNumber=8431331159l;
		boolean isSamsungAvailable=true; 
		float costOfTheMobile=30000.2548f;
		double gstOfTheMobile=2000.0172676d;
		String companyName="Samsung";
		
		if(numberOfMobiles==30){
			System.out.println("total number of sheets==="+numberOfMobiles);
		}
		System.out.println("total number of mobiles available is==="+numberOfMobiles);
	   
	        if(seriesOfTheMobile=='a'){
		    System.out.println("the series of the mobile is===="+seriesOfTheMobile);
	        }
		
		if(storage==64){
			System.out.println("internal storage of the mobile is==="+storage);
		}
	    
		if(mobileCode==9674){
			 System.out.println("mobile code is succesfully verified");
		 }

		if(phoneNumber==8431331159l){
			System.out.println("phone number of the customer is==="+phoneNumber);
		}

		if(isSamsungAvailable==true){
			System.out.println("customer decided to buy samsung mobile");
		}

		if(costOfTheMobile==30000.2548f){
			System.out.println("the cost of the mobile is=="+costOfTheMobile);
		}
	
    	        if(gstOfTheMobile==200.978617d){
			System.out.println("gst succesfully matched");
		}
		System.out.println("gst of the mobile doesnot matched");
    
                if(companyName=="Samsung"){
			System.out.println("customer purchased the samsung phone sucessfully ");
		}
	}
	
}
