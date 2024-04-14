class Paper{
	
	public static void main(String []args){
		
		int totalSheets=40;
		char seriesOfTheSheet='a';
		byte maxPage=120;
		short bookNumber=5674;
		long phoneNumber=8431331159l;
		boolean ispageAvailable=true; 
		float costOfThePage=10.02928f;
		double gstOfTheBook=2.0172676d;
		String ownerName="Ravi";
		if(totalSheets==30){
			System.out.println("total number of sheets==="+totalSheets);
		}
		System.out.println("total number of doesn't matched");
		
	        if(seriesOfTheSheet=='a'){
		System.out.println("the series of the sheet is===="+seriesOfTheSheet);
	        }
		
		if(maxPage==100){
			System.out.println("paper reached maximum limit");
		}

	        if(bookNumber==5674){
			 System.out.println("book number is succesfully verified");
		 }

		if(phoneNumber==8431331159l){
			System.out.println("phone number matched succesfully");
		}

		if(ispageAvailable!=false){
			System.out.println("page is available");
		}

		if(costOfThePage==10.02928f){
			System.out.println("the cost is succesfully matched");
		}

		if(gstOfTheBook==2.978617d){
			System.out.println("gst succesfully matched");
		}

                if(ownerName=="Ravi"){
			System.out.println("owner name sucessfully matched as=="+ownerName);
		}
	}
	
}
