class Home{

   public static void main(String []args){
	 
        int [] noOfFloors={0,1,2,3,4};
        char [] floorSeries={'G','F','S','T','F'};	
     	byte [] noOfPersons={3,4,4,3,4};
    	short [] squareFeet={400,600,600,600,600};
        long  [] phoneNumberOfEachPerson={9975739256l,8541662278l,7635288163l,8262996327l,7891072244l};
     	float [] currentBill={340.939f,450.45f,300.12f,530.76f,500.46f};
	    double [] rent={4000.543243d,6000.384793d,5000.4932729d,7000.2937423d,6000.9765456d};
	
        for(int i=0;i<noOfFloors.length;i++){
		 System.out.println("number floors in the house is=="+noOfFloors[i]);
	    }
	 
	    for(int i=0;i<floorSeries.length;i++){
		 System.out.println("series of the floors in the house is=="+floorSeries[i]);
	    }
	 
	     for(int i=0;i<noOfPersons.length;i++){
		 System.out.println("number of persons in each floor is is=="+noOfPersons[i]);
	    }
	 
	    for(int i=0;i<squareFeet.length;i++){
		 System.out.println("square feet of the house is=="+squareFeet[i]);
	    }
	 
	    for(int i=0;i<phoneNumberOfEachPerson.length;i++){
		 System.out.println("phone number of each person in the house is=="+phoneNumberOfEachPerson[i]);
	    }
	 
	    for(int i=0;i<currentBill.length;i++){
		 System.out.println("currentBill of the house is=="+currentBill[i]);
	    }
	 
	    for(int i=0;i<rent.length;i++){
		 System.out.println("rent of the house is=="+rent[i]);
	    }
	 
	
   }
   
}
