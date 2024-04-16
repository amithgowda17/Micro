class Drinks{
	
	public static void main(String []args){
		 
		 int noOFBottles=10;
		 String drinkType="Juice";
		 
		if(noOFBottles==11 || drinkType=="Coco Cola"){
		 
		 System.out.println("invalid");
		 
		}else{
			 
			System.out.println("the valid drink type is=="+drinkType);
	        }
		
		if(noOFBottles!=13 || drinkType=="Juice"){
		 
		 System.out.println("drink type is successfully verified");
		 
		}else{
			 
			System.out.println("Invalid entry");
		}
			 
    }

}
