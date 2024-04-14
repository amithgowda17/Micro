class Flight{
	
	public static void main(String []args){
		
		int numberOfFlights=30;
		char seriesOfTheFlight='a';
		byte storageCapacity=120;
		short flightCode=5135;
		long phoneNumber=8431331159l;
		boolean isJetAirwaysAvailable=true; 
		float costOfTheTicket=40000.2548f;
		double gstOfTheTicket=5000.0172676d;
		String companyName="Jet Airways";
	
       	if(numberOfFlights==30){
			System.out.println("total number of flights==="+numberOfFlights);
		}
		System.out.println("total number of flights not available");
	    
		if(seriesOfTheFlight=='a'){
		    System.out.println("the series of the flight is===="+seriesOfTheFlight);
	    }
		
		if(storageCapacity==150){
			System.out.println("capacity of the flight==="+storageCapacity);
		}
	    
		if(flightCode==5135){
			 System.out.println("flight code is succesfully verified");
		}

		if(phoneNumber==8431331159l){
			System.out.println("phone number of the customer is==="+phoneNumber);
		}

		if(isJetAirwaysAvailable==true){
			System.out.println("customer decided to book jet airways");
		}

		if(costOfTheTicket==40000.2548f){
			System.out.println("the cost of the flight ticket is=="+costOfTheTicket);
		}

		if(gstOfTheTicket==2000.978617d){
			System.out.println("gst succesfully matched");
		}
		System.out.println("gst of the ticket doesnot matched");

        if(companyName=="Jet Airways"){
			System.out.println("customer succesfully purchased jet airways flight ticket");
		}
	}
	
}